package com.axy.intelligentcontrolplatform.experiment.service;

import com.axy.intelligentcontrolplatform.basic.dto.MessageBean;
import com.axy.intelligentcontrolplatform.experiment.entity.TZhZtjxSyzy;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 试验专业 服务类
 * </p>
 *
 * @author moyu
 * @since 2020-05-25
 */
public interface ITZhZtjxSyzyService extends IService<TZhZtjxSyzy> {

    MessageBean getSpeciality(TZhZtjxSyzy tZhZtjxSyzy);

    MessageBean postSpeciality(TZhZtjxSyzy tZhZtjxSyzy);

    MessageBean deleteSpeciality(String objId);

}
