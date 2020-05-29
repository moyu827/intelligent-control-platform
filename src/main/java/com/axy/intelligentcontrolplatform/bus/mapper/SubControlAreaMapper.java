package com.axy.intelligentcontrolplatform.bus.mapper;

import com.axy.intelligentcontrolplatform.bus.entity.SubControlArea;
import com.axy.intelligentcontrolplatform.bus.requestParam.SubControlAreaParam;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * <p>
 * 子控区表 Mapper 接口
 * </p>
 *
 * @author yct
 * @since 2020-05-12
 */
@Repository
public interface SubControlAreaMapper extends BaseMapper<SubControlArea> {

    int getSubControlAreaCount(SubControlAreaParam subControlAreaParam);

    List<SubControlArea> getSubControlAreas(SubControlAreaParam subControlAreaParam);

    /**
     * 删除子口区域时，删掉与下级单位的关联
     * @param parentId
     */
    void removeChildParentId(Long parentId);

}
