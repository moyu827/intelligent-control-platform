package com.axy.intelligentcontrolplatform.bus.mapper;

import com.axy.intelligentcontrolplatform.bus.entity.PowerDevModel;
import com.axy.intelligentcontrolplatform.bus.requestParam.PowerDevModelParam;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * <p>
 * 电力设备型号表 Mapper 接口
 * </p>
 *
 * @author yct
 * @since 2020-05-07
 */
@Repository
public interface PowerDevModelMapper extends BaseMapper<PowerDevModel> {
    List<PowerDevModel> getPowerDevModels(PowerDevModelParam powerDevModelParam);

    int getPowerDevModelsCount(PowerDevModelParam powerDevModelParam);
}
