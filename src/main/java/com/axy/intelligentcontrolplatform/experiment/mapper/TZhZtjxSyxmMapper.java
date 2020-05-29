package com.axy.intelligentcontrolplatform.experiment.mapper;

import com.axy.intelligentcontrolplatform.basic.dto.MessageBean;
import com.axy.intelligentcontrolplatform.experiment.entity.TZhZtjxSyxm;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * <p>
 * 试验项目 Mapper 接口
 * </p>
 *
 * @author moyu
 * @since 2020-05-25
 */
@Repository
public interface TZhZtjxSyxmMapper extends BaseMapper<TZhZtjxSyxm> {

    List<TZhZtjxSyxm> getProject(TZhZtjxSyxm tZhZtjxSyxm);
    int getProjectCount(TZhZtjxSyxm tZhZtjxSyxm);

}
