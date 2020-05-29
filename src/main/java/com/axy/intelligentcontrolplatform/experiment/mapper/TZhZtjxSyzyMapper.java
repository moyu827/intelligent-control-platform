package com.axy.intelligentcontrolplatform.experiment.mapper;

import com.axy.intelligentcontrolplatform.experiment.entity.TZhZtjxSyzy;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * <p>
 * 试验专业 Mapper 接口
 * </p>
 *
 * @author moyu
 * @since 2020-05-25
 */
@Repository
public interface TZhZtjxSyzyMapper extends BaseMapper<TZhZtjxSyzy> {

    List<TZhZtjxSyzy> getSpeciality(TZhZtjxSyzy tZhZtjxSyzy);

    int getSpecialityCount(TZhZtjxSyzy tZhZtjxSyzy);

}
