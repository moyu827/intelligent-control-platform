package com.axy.intelligentcontrolplatform.standing.requestParam;

import com.axy.intelligentcontrolplatform.basic.requestParam.PageParam;
import lombok.Data;

/**
 * TSbZnycKzcsParam：
 *
 * @author: li wenqiang
 * @date: 2020/5/14 16:31
 */
@Data
public class TSbZnycKzcsParam extends PageParam{
    /**
     * 参数ID
     */
    private String objId;

    /**
     * 部件ID
     */
    private String bjid;

    /**
     * 参数定义ID
     */
    private String csdyid;

    /**
     * 设备类型
     */
    private String sblx;

    /**
     * 参数名称
     */
    private String csmc;

    /**
     * 参数值
     */
    private String csz;


}
