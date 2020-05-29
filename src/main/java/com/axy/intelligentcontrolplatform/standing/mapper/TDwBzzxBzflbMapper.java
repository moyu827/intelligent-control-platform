package com.axy.intelligentcontrolplatform.standing.mapper;

import com.axy.intelligentcontrolplatform.standing.entity.TDwBzzxBzflb;
import com.axy.intelligentcontrolplatform.standing.requestParam.TDwBzzxBzflbParam;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * <p>
 * 标准分类表 Mapper 接口
 * </p>
 *
 * @author liwenqiang
 * @since 2020-05-14
 */
@Repository
public interface TDwBzzxBzflbMapper extends BaseMapper<TDwBzzxBzflb> {

    List<TDwBzzxBzflb> getNormalSort(TDwBzzxBzflbParam param);

    int getNormalSortCount(TDwBzzxBzflbParam param);

    List<TDwBzzxBzflb> selectNormalSort(TDwBzzxBzflb tDwBzzxBzflb);
}
