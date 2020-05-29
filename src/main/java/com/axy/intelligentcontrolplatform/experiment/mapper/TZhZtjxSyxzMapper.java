package com.axy.intelligentcontrolplatform.experiment.mapper;

import com.axy.intelligentcontrolplatform.experiment.entity.TZhZtjxSyxz;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * <p>
 * 试验性质 Mapper 接口
 * </p>
 *
 * @author moyu
 * @since 2020-05-25
 */
@Repository
public interface TZhZtjxSyxzMapper extends BaseMapper<TZhZtjxSyxz> {

    List<TZhZtjxSyxz> getNature(TZhZtjxSyxz tZhZtjxSyxz);

    int getNatureCount(TZhZtjxSyxz tZhZtjxSyxz);

}
