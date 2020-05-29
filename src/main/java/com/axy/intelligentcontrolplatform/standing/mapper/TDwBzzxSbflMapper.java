package com.axy.intelligentcontrolplatform.standing.mapper;

import com.axy.intelligentcontrolplatform.standing.entity.TDwBzzxSbfl;
import com.axy.intelligentcontrolplatform.standing.requestParam.TDwBzzxSbflParam;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * <p>
 * 设备类型表 Mapper 接口
 * </p>
 *
 * @author liwenqiang
 * @since 2020-05-14
 */
@Repository
public interface TDwBzzxSbflMapper extends BaseMapper<TDwBzzxSbfl> {

    List<TDwBzzxSbfl> getPartsType(TDwBzzxSbflParam param);

    int getPartsTypeCount(TDwBzzxSbflParam param);

    List<TDwBzzxSbfl> selectPartsType(TDwBzzxSbfl tDwBzzxSbfl);

}
