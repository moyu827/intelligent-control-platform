package com.axy.intelligentcontrolplatform.experiment.service;

import com.axy.intelligentcontrolplatform.basic.dto.MessageBean;
import com.axy.intelligentcontrolplatform.experiment.entity.TZhZtjxSyxm;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 试验项目 服务类
 * </p>
 *
 * @author moyu
 * @since 2020-05-25
 */
public interface ITZhZtjxSyxmService extends IService<TZhZtjxSyxm> {

    /**
     * 查询集合
     * @param tZhZtjxSyxm
     * @return
     */
    MessageBean getExperimentProject(TZhZtjxSyxm tZhZtjxSyxm);

    /**
     * 新增或修改
     * @param tZhZtjxSyxm
     * @return
     */
    MessageBean postExperimentProject(TZhZtjxSyxm tZhZtjxSyxm);

    /**
     * 删除
     * @param objId
     * @return
     */
    MessageBean deleteExperimentProject(String objId);
}
