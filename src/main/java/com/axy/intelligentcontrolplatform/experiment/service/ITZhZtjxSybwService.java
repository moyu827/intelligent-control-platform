package com.axy.intelligentcontrolplatform.experiment.service;

import com.axy.intelligentcontrolplatform.basic.dto.MessageBean;
import com.axy.intelligentcontrolplatform.experiment.entity.TZhZtjxSybw;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 试验部位 服务类
 * </p>
 *
 * @author moyu
 * @since 2020-05-25
 */
public interface ITZhZtjxSybwService extends IService<TZhZtjxSybw> {

    /**
     * 查询集合
     * @param tZhZtjxSybw
     * @return
     */
    MessageBean getExperimentPosition(TZhZtjxSybw tZhZtjxSybw);

    /**
     * 添加或修改
     * @param tZhZtjxSybw
     * @return
     */
    MessageBean postExperimentPosition(TZhZtjxSybw tZhZtjxSybw);

    /**
     * 删除试验部位
     * @param objId
     * @return
     */
    MessageBean deleteExperimentPosition(String objId);

    /**
     * 根据项目ID、项别ID查询部位
     * @param param1 项目id
     * @param param2 项别id
     * @return
     */
    List<TZhZtjxSybw> getPositionById(String param1,String param2);

}
