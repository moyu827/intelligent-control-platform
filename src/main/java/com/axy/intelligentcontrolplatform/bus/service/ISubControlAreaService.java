package com.axy.intelligentcontrolplatform.bus.service;

import com.axy.intelligentcontrolplatform.basic.dto.MessageBean;
import com.axy.intelligentcontrolplatform.bus.entity.SubControlArea;
import com.axy.intelligentcontrolplatform.bus.requestParam.SubControlAreaParam;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 子控区表 服务类
 * </p>
 *
 * @author yct
 * @since 2020-05-12
 */
public interface ISubControlAreaService extends IService<SubControlArea> {
    /**
     * 新增
     * @param subControlArea
     * @return
     */
    MessageBean addSubControlArea(SubControlArea subControlArea);

    /**
     * 单个删除
     * @param id
     * @return
     */
    MessageBean deleteSubControlArea(Long id);

    /**
     * 修改
     * @param subControlArea
     * @return
     */
    MessageBean putSubControlArea(SubControlArea subControlArea);

    /**
     * 获取集合
     * @param subControlAreaParam
     * @return
     */
    MessageBean getSubControlAreas(SubControlAreaParam subControlAreaParam);
}
