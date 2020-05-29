package com.axy.intelligentcontrolplatform.experiment.mapper;

import com.axy.intelligentcontrolplatform.experiment.entity.TZhZtjxSymbxb;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * <p>
 * 试验模板-相别 Mapper 接口
 * </p>
 *
 * @author moyu
 * @since 2020-05-25
 */
@Repository
public interface TZhZtjxSymbxbMapper extends BaseMapper<TZhZtjxSymbxb> {

    List<TZhZtjxSymbxb> getTempItems(TZhZtjxSymbxb tZhZtjxSymbxb);
    int getTempItemsCount(TZhZtjxSymbxb tZhZtjxSymbxb);
    List<TZhZtjxSymbxb> getTempItemsById(String objId);
    int getTempItemsByIdCount(String objId);
}
