package com.axy.intelligentcontrolplatform.basic.utils;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;

public class QueryWrapperUtils {
    public static <T> QueryWrapper<T> getQueryWrapper(Class<T> Class){
        QueryWrapper<T> queryWrapper = new QueryWrapper<>();
        return queryWrapper;
    }

}
