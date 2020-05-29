package com.axy.intelligentcontrolplatform.standing.mapper;

import com.axy.intelligentcontrolplatform.standing.entity.TSbZnycKzcsDy;
import com.axy.intelligentcontrolplatform.standing.requestParam.TSbZnycKzcsDyParam;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * <p>
 * 设备部件附件扩展参数定义表(库) Mapper 接口
 * </p>
 *
 * @author liwenqiang
 * @since 2020-05-14
 */
@Repository
public interface TSbZnycKzcsDyMapper extends BaseMapper<TSbZnycKzcsDy> {

    List<TSbZnycKzcsDy> getPartsParamDefine(TSbZnycKzcsDyParam param);

    int getPartsParamDefineCount(TSbZnycKzcsDyParam param);

    List<TSbZnycKzcsDy> selectPartsParamDefine(TSbZnycKzcsDy tSbZnycKzcsDy);

}
