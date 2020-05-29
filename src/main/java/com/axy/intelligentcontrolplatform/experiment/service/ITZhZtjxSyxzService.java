package com.axy.intelligentcontrolplatform.experiment.service;

import com.axy.intelligentcontrolplatform.basic.dto.MessageBean;
import com.axy.intelligentcontrolplatform.experiment.entity.TZhZtjxSyxz;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 试验性质 服务类
 * </p>
 *
 * @author moyu
 * @since 2020-05-25
 */
public interface ITZhZtjxSyxzService extends IService<TZhZtjxSyxz> {

    MessageBean getNature(TZhZtjxSyxz tZhZtjxSyxz);

    MessageBean postNature(TZhZtjxSyxz tZhZtjxSyxz);

    MessageBean deleteNature(String objId);

}
