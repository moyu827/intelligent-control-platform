package com.axy.intelligentcontrolplatform.basic.cache;

import com.alibaba.fastjson.JSON;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cache.annotation.CachingConfigurerSupport;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.interceptor.KeyGenerator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.cache.RedisCacheConfiguration;
import org.springframework.data.redis.cache.RedisCacheManager;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.*;
import java.lang.reflect.Method;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;


/**
 * <p>
 * redis config
 * </p>
 *
 * @author moyu
 * @since 2020-05-27
 */
@Configuration
@EnableCaching
public class RedisConfig extends CachingConfigurerSupport {
    private static final Logger logger = LoggerFactory.getLogger(RedisConfig.class);
    /**
     * 类名+方法名+参数列表的类型+参数值 再做 哈希散列 作为key
     *
     * @return
     */
    @Bean
    @Override
    public KeyGenerator keyGenerator() {
        logger.info("RedisCacheConfig.keyGenerator()");
        return new KeyGenerator() {
            @Override
            public Object generate(Object o, Method method, Object... objects) {
                StringBuilder sb = new StringBuilder();
                sb.append(o.getClass().getSimpleName())
                        .append(":")
                        .append(method.getName())
                        .append(":");
                for (Object obj : objects) {
                    if (null != obj) {// 替换字符串
                        String objKey = JSON.toJSONString(obj);
                        objKey = objKey.replace(":", "=");
                        sb.append(objKey);
                    }
                }
                logger.info("keyGenerator=" + sb.toString());
                return sb.toString();
            }
        };
    }


    //缓存生存时间
    private Duration timeToLive = Duration.ofHours(1);

    @Bean
    public RedisCacheManager cacheManager(RedisConnectionFactory connectionFactory) {
        //redis缓存配置
        RedisCacheConfiguration config = RedisCacheConfiguration.defaultCacheConfig()
                .entryTtl(this.timeToLive)
                .serializeKeysWith(RedisSerializationContext.SerializationPair.fromSerializer(keySerializer()))
                .serializeValuesWith(RedisSerializationContext.SerializationPair.fromSerializer(valueSerializer()))
                .disableCachingNullValues();
        //缓存配置map
        Map<String, RedisCacheConfiguration> cacheConfigurationMap = new HashMap<>();
        //自定义缓存名，后面使用的@Cacheable的CacheName
        cacheConfigurationMap.put("default", config);
        //根据redis缓存配置和reid连接工厂生成redis缓存管理器
        RedisCacheManager redisCacheManager = RedisCacheManager.builder(connectionFactory)
                .cacheDefaults(config)
                .transactionAware()
                .withInitialCacheConfigurations(cacheConfigurationMap)
                .build();
        logger.debug("自定义RedisCacheManager加载完成");
        return redisCacheManager;
    }

    /**
     * redisTemplate模板提供给其他类对redis数据库进行操作
     *
     * @param redisConnectionFactory
     * @return
     */

    @Bean(name = "redisTemplate")
    public RedisTemplate<String, Object> redisTemplate(RedisConnectionFactory redisConnectionFactory) {
        RedisTemplate<String, Object> redisTemplate = new RedisTemplate<>();
        redisTemplate.setConnectionFactory(redisConnectionFactory);
        redisTemplate.setKeySerializer(keySerializer());
        redisTemplate.setHashKeySerializer(keySerializer());
        redisTemplate.setValueSerializer(valueSerializer());
        redisTemplate.setHashValueSerializer(valueSerializer());
        logger.debug("自定义RedisTemplate加载完成");
        return redisTemplate;
    }

    /**
     * redis键序列化使用StrngRedisSerializer
     *
     * @return
     */
    private RedisSerializer<String> keySerializer() {
        return new StringRedisSerializer();
    }

    /**
     * redis值序列化使用json序列化器
     *
     * @return
     */

    private RedisSerializer<Object> valueSerializer() {
        return new GenericJackson2JsonRedisSerializer();
    }

}