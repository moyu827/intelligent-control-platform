package com.axy.intelligentcontrolplatform.standing.mapper;

import com.axy.intelligentcontrolplatform.standing.entity.TDwBzzxGgdmb;
import com.axy.intelligentcontrolplatform.standing.requestParam.TDwBzzxGgdmbParam;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * <p>
 * 公共代码表 Mapper 接口
 * </p>
 *
 * @author liwenqiang
 * @since 2020-05-14
 */
@Repository
public interface TDwBzzxGgdmbMapper extends BaseMapper<TDwBzzxGgdmb> {

    List<TDwBzzxGgdmb> getCommonCode(TDwBzzxGgdmbParam param);

    int getCommonCodeCount(TDwBzzxGgdmbParam param);

}
