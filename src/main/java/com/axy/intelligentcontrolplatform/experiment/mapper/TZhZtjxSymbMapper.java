package com.axy.intelligentcontrolplatform.experiment.mapper;

import com.axy.intelligentcontrolplatform.basic.dto.MessageBean;
import com.axy.intelligentcontrolplatform.experiment.entity.TZhZtjxSymb;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * <p>
 * 试验模板 Mapper 接口
 * </p>
 *
 * @author moyu
 * @since 2020-05-25
 */
@Repository
public interface TZhZtjxSymbMapper extends BaseMapper<TZhZtjxSymb> {

    List<TZhZtjxSymb> getExperimentTemp(TZhZtjxSymb tZhZtjxSymb);

    int getExperimentTempCount(TZhZtjxSymb tZhZtjxSymb);

    List<TZhZtjxSymb> selectExperimentTemp(TZhZtjxSymb tZhZtjxSymb);

}
