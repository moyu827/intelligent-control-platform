package com.axy.intelligentcontrolplatform.bus.mapper;

import com.axy.intelligentcontrolplatform.bus.entity.PowerDevNameplate;
import com.axy.intelligentcontrolplatform.bus.requestParam.PowerDevNameplateParam;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * <p>
 * 铭牌参数表 Mapper 接口
 * </p>
 *
 * @author yct
 * @since 2020-05-07
 */
@Repository
public interface PowerDevNameplateMapper extends BaseMapper<PowerDevNameplate> {

    List<PowerDevNameplate> getPowerDevNameplates(PowerDevNameplateParam powerDevNameplateParam);

    int getPowerDevNameplatesCount(PowerDevNameplateParam powerDevNameplateParam);

}
