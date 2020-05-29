package com.axy.intelligentcontrolplatform.experiment.service;

import com.axy.intelligentcontrolplatform.basic.dto.MessageBean;
import com.axy.intelligentcontrolplatform.experiment.entity.TZhZtjxSymb;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 试验模板 服务类
 * </p>
 *
 * @author moyu
 * @since 2020-05-25
 */
public interface ITZhZtjxSymbService extends IService<TZhZtjxSymb> {

    /**
     * 获取集合
     * @param tZhZtjxSymb
     * @return
     */
    MessageBean getExperimentTemp(TZhZtjxSymb tZhZtjxSymb);

    /**
     * 新增或修改
     * @param tZhZtjxSymb
     * @return
     */
    MessageBean postExperimentTemp(TZhZtjxSymb tZhZtjxSymb);

    /**
     * 删除
     * @param objId
     * @return
     */
    MessageBean deleteExperimentTemp(String objId);

    /**
     * 下拉框
     * @param tZhZtjxSymb
     * @return
     */
    MessageBean selectExperimentTemp(TZhZtjxSymb tZhZtjxSymb);

}
