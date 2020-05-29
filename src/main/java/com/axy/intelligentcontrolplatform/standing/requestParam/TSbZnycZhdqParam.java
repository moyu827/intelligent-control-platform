package com.axy.intelligentcontrolplatform.standing.requestParam;

import com.axy.intelligentcontrolplatform.basic.requestParam.PageParam;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * TSbZnycZhdqParam：
 *
 * @author: li wenqiang
 * @date: 2020/5/14 16:32
 */
@Data
public class TSbZnycZhdqParam extends PageParam{
    /**
     * 组合电器ID
     */
    private String objId;

    /**
     * 设备名称
     */
    private String sbmc;

    /**
     * 设备相关图纸资料
     */
    private String dxmpyxkid;

    /**
     * 设备编码;	设备类型的设备都具有该编码
     */
    private String sbbm;

    /**
     * 生产厂家
     */
    private String sccj;

    /**
     * 出厂编号
     */
    private String ccbh;

    /**
     * 所属地市
     */
    private String ssds;

    /**
     * 维护班组
     */
    private String whbz;

    /**
     * WBS编号
     */
    private String wbsbh;

    /**
     * WBS描述
     */
    private String wbsms;

    /**
     * 设备增加方式 包括：01:设备增加-基本建设,02:设备增加-技术改造,03:设备增加-零星购置,04:设备增加-投资者投入,05:设备增加-融资租入,06:设备增加-债务重组取得,07:设备增加-接受捐赠,08:设备增加-无偿调入,09:设备增加-盘盈,10:设备增加-其他途径
     */
    private String sbzjfs;

    /**
     * 型号
     */
    private String xh;

    /**
     * 产品代号
     */
    private String cpdh;

    /**
     * 制造国家
     */
    private String zzgj;

    /**
     * 出厂日期
     */
    private LocalDate ccrq;

    /**
     * 投运日期
     */
    private LocalDate tyrq;

    /**
     * 最近投运日期
     */
    private LocalDate zjtyrq;

    /**
     * 运行状态 包括：31:现场留用 32:库存备用 20:在运 30:退役 40:报废 10:未投运 33:待报废
     */
    private String yxzt;

    /**
     * 使用环境
     */
    private String syhj;

    /**
     * 资产编号
     */
    private String zcbh;

    /**
     * 类型;	GIS,HGIS, PASS,COMPASS,HIS,ZHW,ZCW,其他
     */
    private String lx;

    /**
     * 运行编号
     */
    private String yxbh;

    /**
     * 结构型式
     */
    private String jgxs;

    /**
     * 电流互感器布置方式
     */
    private String dlhgqbzfs;

    /**
     * 进出线方式
     */
    private String jcxfs;

    /**
     * SF6气体额定压力(非断路器气室);	计量单位:MPa
     */
    private Double sf6qtedylfdlqqs;

    /**
     * SF6气体压力降低报警压力(非断路器气室);	计量单位:MPa
     */
    private Double sf6qtyljdbjylfdlqqs;

    /**
     * 断路器数量;	计量单位:台
     */
    private Integer dlqsl;

    /**
     * 隔离开关数量;	计量单位:组
     */
    private Integer glkgsl;

    /**
     * 接地开关数量;	计量单位:组
     */
    private Integer jdkgsl;

    /**
     * 避雷器数量;	计量单位:台
     */
    private Integer blqsl;

    /**
     * 运维单位
     */
    private String ywdw;

    /**
     * 电流互感器数量;	计量单位:台
     */
    private Integer dlhgqsl;

    /**
     * 电压互感器数量;	计量单位:台
     */
    private Integer dyhgqsl;

    /**
     * 资产性质 包括：01:国家电网公司,02:分部,03:省（直辖市、自治区）公司,04:子公司,05:用户
     */
    private String zcxz;

    /**
     * 资产单位
     */
    private String zcdw;

    /**
     * 电压等级包括：1:交流6V、2:交流12V、3:交流24V、4:交流36V、5:交流48V 、6:交流110V、7:交流220V、8:交流380V(含400V)、51:直流6V、52:直流12V、53:直流24V、54:直流36V、、88:直流320kV
     */
    private String dydj;

    /**
     * 间隔单元
     */
    private String jgdy;

    /**
     * 备注
     */
    private String bz;

    /**
     * 所属站房
     */
    private String sszf;

    /**
     * 登记时间
     */
    private LocalDateTime djsj;

    /**
     * 设备主人
     */
    private String sbzr;

    /**
     * 资产单位名称
     */
    private String zcdwmc;

    /**
     * 维护班组名称
     */
    private String whbzmc;

    /**
     * 设备主人名称
     */
    private String sbzrmc;

    /**
     * 所属地市名称
     */
    private String ssdsmc;

    /**
     * 运维单位名称
     */
    private String ywdwmc;

    /**
     * 输变配标识
     */
    private String sbpbs;

    /**
     * 额定电压
     */
    private String eddy;

    /**
     * 热稳定持续时间
     */
    private Double rwdcxsj;

    /**
     * 热稳定电流
     */
    private Double rwddl;

    /**
     * 额定电流
     */
    private Double eddl;

    /**
     * 中午注释：标准代码，是和否。包括：1 是， 0 否
     */
    private String sfnw;

    /**
     * 发布状态包括：录入、发布默认发布
     */
    private String fbzt;

    /**
     * WBS编码
     */
    private String erpwbsbm;

    /**
     * 专业分类 包括：1输电2变电3配电
     */
    private String zyfl;

    /**
     * 修改后设备名称
     */
    private String xghsbmc;

    /**
     * 中午注释：标准代码，是和否。包括：1 是， 0 否
     */
    private String sfyc;

    /**
     * 实物ID
     */
    private String swid;

    /**
     * 打印次数
     */
    private Double dycs;

    /**
     * 匹配时间
     */
    private LocalDateTime ppsj;

    /**
     * 匹配失败原因
     */
    private String ppsbyy;

    /**
     * 是否打印
     */
    private String sfjd;

    /**
     * 匹配状态(01:未匹配,02:匹配成功,03:匹配失败)
     */
    private String sfpp;

    /**
     * 是否有实物 01:实际现场有实物,02:实际现场无实物
     */
    private String sfysw;

    /**
     * 台账创建日期
     */
    private LocalDate cjrq;

    /**
     * 台账来源（1:pc端,2:app）
     */
    private String tzly;

}
