package com.axy.intelligentcontrolplatform.standing.mapper;

import com.axy.intelligentcontrolplatform.standing.entity.TSbZnycBjfj;
import com.axy.intelligentcontrolplatform.standing.requestParam.TSbZnycBjfjParam;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * <p>
 * 部件附件 Mapper 接口
 * </p>
 *
 * @author liwenqiang
 * @since 2020-05-14
 */
@Repository
public interface TSbZnycBjfjMapper extends BaseMapper<TSbZnycBjfj> {

    List<TSbZnycBjfj> getPartsAccessories(TSbZnycBjfjParam tSbZnycBjfjParam);

    int getPartsAccessoriesCount(TSbZnycBjfjParam tSbZnycBjfjParam);

    List<TSbZnycBjfj> selectPartsAccessories(TSbZnycBjfj tSbZnycBjfj);

}
