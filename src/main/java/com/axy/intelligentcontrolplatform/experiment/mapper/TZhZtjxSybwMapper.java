package com.axy.intelligentcontrolplatform.experiment.mapper;

import com.axy.intelligentcontrolplatform.experiment.entity.TZhZtjxSybw;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * <p>
 * 试验部位 Mapper 接口
 * </p>
 *
 * @author moyu
 * @since 2020-05-25
 */
@Repository
public interface TZhZtjxSybwMapper extends BaseMapper<TZhZtjxSybw> {
    List<TZhZtjxSybw> getExperimentPosition(TZhZtjxSybw tZhZtjxSybw);
    int getExperimentPositionCount(TZhZtjxSybw tZhZtjxSybw);
    List<TZhZtjxSybw> getPositionById(String param1,String param2);
}
