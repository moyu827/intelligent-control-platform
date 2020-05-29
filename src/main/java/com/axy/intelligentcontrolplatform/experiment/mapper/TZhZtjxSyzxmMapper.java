package com.axy.intelligentcontrolplatform.experiment.mapper;

import com.axy.intelligentcontrolplatform.experiment.entity.TZhZtjxSyzxm;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * <p>
 * 试验子项目 Mapper 接口
 * </p>
 *
 * @author moyu
 * @since 2020-05-25
 */
@Repository
public interface TZhZtjxSyzxmMapper extends BaseMapper<TZhZtjxSyzxm> {

    List<TZhZtjxSyzxm> getSubProject(TZhZtjxSyzxm tZhZtjxSyzxm);

    int getSubProjectCount(TZhZtjxSyzxm tZhZtjxSyzxm);

    List<TZhZtjxSyzxm> getSubProjectByProjectId(String objId);

}
