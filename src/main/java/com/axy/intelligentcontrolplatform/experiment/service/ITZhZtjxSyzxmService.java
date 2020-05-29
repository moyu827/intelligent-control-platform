package com.axy.intelligentcontrolplatform.experiment.service;

import com.axy.intelligentcontrolplatform.basic.dto.MessageBean;
import com.axy.intelligentcontrolplatform.experiment.entity.TZhZtjxSyzxm;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 试验子项目 服务类
 * </p>
 *
 * @author moyu
 * @since 2020-05-25
 */
public interface ITZhZtjxSyzxmService extends IService<TZhZtjxSyzxm> {

    MessageBean getSubProject(TZhZtjxSyzxm tZhZtjxSyzxm);

    MessageBean postSubProject(TZhZtjxSyzxm tZhZtjxSyzxm);

    MessageBean deleteSubProject(String objId);

    List<TZhZtjxSyzxm> getSubProjectByProjectId(String objId);

}
