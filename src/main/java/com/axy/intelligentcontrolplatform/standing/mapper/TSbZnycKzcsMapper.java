package com.axy.intelligentcontrolplatform.standing.mapper;

import com.axy.intelligentcontrolplatform.standing.entity.TSbZnycKzcs;
import com.axy.intelligentcontrolplatform.standing.requestParam.TSbZnycKzcsParam;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * <p>
 * 设备部件附件扩展参数表 Mapper 接口
 * </p>
 *
 * @author liwenqiang
 * @since 2020-05-14
 */
@Repository
public interface TSbZnycKzcsMapper extends BaseMapper<TSbZnycKzcs> {

    List<TSbZnycKzcs> getPartsParam(TSbZnycKzcsParam param);

    int getPartsParamCount(TSbZnycKzcsParam param);

}
