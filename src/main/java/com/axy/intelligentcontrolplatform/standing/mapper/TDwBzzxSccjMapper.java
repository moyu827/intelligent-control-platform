package com.axy.intelligentcontrolplatform.standing.mapper;

import com.axy.intelligentcontrolplatform.bus.entity.PowerDevModel;
import com.axy.intelligentcontrolplatform.bus.requestParam.PowerDevModelParam;
import com.axy.intelligentcontrolplatform.standing.entity.TDwBzzxSccj;
import com.axy.intelligentcontrolplatform.standing.requestParam.TDwBzzxSccjParam;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * <p>
 * 生产厂家 Mapper 接口
 * </p>
 *
 * @author liwenqiang
 * @since 2020-05-14
 */
@Repository
public interface TDwBzzxSccjMapper extends BaseMapper<TDwBzzxSccj> {


    List<TDwBzzxSccj> getMfrs(TDwBzzxSccjParam tDwBzzxSccjParam);

    int getMfrsCount(TDwBzzxSccjParam tDwBzzxSccjParam);

    List<TDwBzzxSccj> selectMfrs(TDwBzzxSccj tDwBzzxSccj);
}
