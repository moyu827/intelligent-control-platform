package com.axy.intelligentcontrolplatform.experiment.service;

import com.axy.intelligentcontrolplatform.basic.dto.MessageBean;
import com.axy.intelligentcontrolplatform.experiment.entity.TZhZtjxSymbxb;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 试验模板-相别 服务类
 * </p>
 *
 * @author moyu
 * @since 2020-05-25
 */
public interface ITZhZtjxSymbxbService extends IService<TZhZtjxSymbxb> {
    MessageBean getTempItems(TZhZtjxSymbxb tZhZtjxSymbxb);

    MessageBean postTempItems(TZhZtjxSymbxb tZhZtjxSymbxb);

    MessageBean deleteTempItems(String objId);

    List<TZhZtjxSymbxb> getTempItemsById(String objId);

}
