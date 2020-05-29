package com.axy.intelligentcontrolplatform.standing.requestParam;

import com.axy.intelligentcontrolplatform.basic.requestParam.PageParam;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * TSbznycDlqParam：
 *
 * @author: li wenqiang
 * @date: 2020/5/14 10:54
 */
@Data
public class TSbznycDlqParam extends PageParam{
    /**
     * 断路器ID
     */
    private String objId;

    /**
     * 所属组合电器(开关柜)
     */
    private String sjsbid;

    /**
     * 电系铭牌运行库ID
     */
    private String dxmpyxkid;

    /**
     * 设备名称
     */
    private String sbmc;

    /**
     * 设备编码;设备类型的设备都具有该编码
     */
    private String sbbm;

    /**
     * 相数
     */
    private String xs;

    /**
     * 相别 包括：1:A,2:B,3:C,4:O,5:ABC,6:ABCO
     */
    private String xb;

    /**
     * 额定电流;计量单位:A
     */
    private Double eddl;

    /**
     * 额定频率;计量单位:Hz
     */
    private Double edpl;

    /**
     * 生产厂家
     */
    private String sccj;

    /**
     * 出厂编号
     */
    private String ccbh;

    /**
     * 产品代号
     */
    private String cpdh;

    /**
     * 制造国家
     */
    private String zzgj;

    /**
     * 运行编号
     */
    private String yxbh;

    /**
     * 出厂日期
     */
    private LocalDate ccrq;

    /**
     * 使用环境
     */
    private String syhj;

    /**
     * 资产编号
     */
    private String zcbh;

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
     * 组合设备类型
     */
    private String zhsblx;

    /**
     * 结构型式
     */
    private String jgxs;

    /**
     * 操作机构型式
     */
    private String czjgxs;

    /**
     * 灭弧介质 包括：01:SF6,02:真空,03:多油,04:少油,05:充油,06:空气
     */
    private String mhjz;

    /**
     * 额定绝缘水平
     */
    private String edjysp;

    /**
     * 运维单位
     */
    private String ywdw;

    /**
     * 额定短路开断电流;计量单位:kA
     */
    private Double eddlkddl;

    /**
     * 额定短路电流开断次数;计量单位:次
     */
    private Double eddldlkdcs;

    /**
     * 额定短路关合电流;计量单位:kA
     */
    private Double eddlghdl;

    /**
     * 动稳定电流;计量单位:kA
     */
    private Double dwddl;

    /**
     * 热稳定电流;计量单位:kA
     */
    private Double rwddl;

    /**
     * 热稳定持续时间;计量单位:S
     */
    private Double rwdcxsj;

    /**
     * 断口数量
     */
    private Integer dksl;

    /**
     * 套管爬电距离;计量单位:mm
     */
    private Double tgpdjl;

    /**
     * 套管干弧距离;计量单位:mm
     */
    private Double tgghjl;

    /**
     * 对地泄漏比距;计量单位:cm/kV
     */
    private Double ddxlbj;

    /**
     * 机械寿命;计量单位:次
     */
    private Double jxsm;

    /**
     * 合闸电阻;计量单位:Ω
     */
    private Double hzdz;

    /**
     * 合分时间(金属短接时间);计量单位:ms
     */
    private String hfsjjsdjsj;

    /**
     * SF6气体额定压力;计量单位:Mpa
     */
    private Double sf6qtedyl;

    /**
     * SF6气体报警压力;计量单位:Mpa
     */
    private Double sf6qtbjyl;

    /**
     * SF6气体闭锁压力;计量单位:Mpa
     */
    private Double sf6qtbsyl;

    /**
     * 所属站房
     */
    private String sszf;

    /**
     * 合闸闭锁操作压力;计量单位:Mpa
     */
    private Double hzbsczyl;

    /**
     * 分闸闭锁操作压力;计量单位:Mpa
     */
    private Double fzbsczyl;

    /**
     * 重合闸闭锁压力;计量单位:Mpa
     */
    private Double zhzbsyl;

    /**
     * 最近投运日期
     */
    private LocalDate zjtyrq;

    /**
     * 运行状态 包括：31:现场留用 32:库存备用 20:在运 30:退役 40:报废 10:未投运 33:待报废
     */
    private String yxzt;

    /**
     * 最大允许跳闸次数
     */
    private Integer zdyxtzcs;

    /**
     * 故障跳闸次数
     */
    private Integer gztzcs;

    /**
     * 累计跳闸次数
     */
    private Integer ljtzcs;

    /**
     * 额定失步开断电流;计量单位:kA
     */
    private Double edsbkddl;

    /**
     * 近区故障开断电流;计量单位:kA
     */
    private Double jqgzkddl;

    /**
     * 资产性质 包括：01:国家电网公司,02:分部,03:省（直辖市、自治区）公司,04:子公司,05:用户
     */
    private String zcxz;

    /**
     * 额定线路充电开断电流;计量单位:A
     */
    private Double edxlcdkddl;

    /**
     * 额定电缆充电开断电流;计量单位:A
     */
    private Double eddlcdkddl;

    /**
     * 额定雷电冲击耐受电压(对地);计量单位:kV
     */
    private Double edldcjnsdydd;

    /**
     * 额定雷电冲击耐受电压(相间);计量单位:kV
     */
    private Double edldcjnsdyxj;

    /**
     * 额定雷电冲击耐受电压(断口);计量单位:kV
     */
    private Double edldcjnsdydk;

    /**
     * 一分钟工频耐压(对地);计量单位:kV
     */
    private Double yfzgpnydd;

    /**
     * 一分钟工频耐压(相间);计量单位:kV
     */
    private Double yfzgpnyxj;

    /**
     * 一分钟工频耐压(断口);计量单位:kV
     */
    private Double yfzgpnydk;

    /**
     * 辅助回路额定电源电压;计量单位:V
     */
    private Double fzhleddydy;

    /**
     * 额定瞬态恢复电压;计量单位:kV
     */
    private Double edsthfdy;

    /**
     * 资产单位
     */
    private String zcdw;

    /**
     * 断口泄漏比距;计量单位:cm/kV
     */
    private Double dkxlbj;

    /**
     * 三相分闸不同期;计量单位:ms
     */
    private Double sxfzbtq;

    /**
     * 三相合闸不同期;计量单位:ms
     */
    private Double sxhzbtq;

    /**
     * 同相分闸不同期;计量单位:ms
     */
    private Double txfzbtq;

    /**
     * 同相合闸不同期计量单位:ms
     */
    private Double txhzbtq;

    /**
     * 分、合闸装置额定电压;计量单位:V
     */
    private Double fhzzzeddy;

    /**
     * 操作机构-额定操作电压;计量单位:V
     */
    private Double czjgedczdy;

    /**
     * 油重(单相);计量单位:t
     */
    private Double yzdx;

    /**
     * 电压等级包括：1:交流6V、2:交流12V、3:交流24V、4:交流36V、5:交流48V 、6:交流110V、7:交流220V、8:交流380V(含400V)、51:直流6V、52:直流12V、53:直流24V、54:直流36V、、88:直流320kV
     */
    private String dydj;

    /**
     * 油厂家
     */
    private String ycj;

    /**
     * SF6气体重量;计量单位:kg
     */
    private Double sf6qtzl;

    /**
     * 储能电机型号
     */
    private String cndjxh;

    /**
     * 储能电机电压;计量单位:V
     */
    private Double cndjdy;

    /**
     * 储能时间;计量单位:S
     */
    private Double cnsj;

    /**
     * 启动压力;计量单位:Mpa
     */
    private Double qdyl;

    /**
     * 停止压力;计量单位:Mpa
     */
    private Double tzyl;

    /**
     * 合闸解除闭锁操作压力;计量单位:Mpa
     */
    private Double hzjcbsczyl;

    /**
     * 分闸解除闭锁操作压力;计量单位:Mpa
     */
    private Double fzjcbsczyl;

    /**
     * 重合闸闭锁解除操作压力;计量单位:Mpa
     */
    private Double zhzbsjcczyl;

    /**
     * 间隔单元
     */
    private String jgdy;

    /**
     * 异常升高压力;计量单位:Mpa
     */
    private Double ycsgyl;

    /**
     * 异常降低压力;计量单位:Mpa
     */
    private Double ycjdyl;

    /**
     * 安全阀动作压力;计量单位:Mpa
     */
    private Double aqfdzyl;

    /**
     * 安全阀动作返回压力;计量单位:Mpa
     */
    private Double aqfdzfhyl;

    /**
     * 投运日期
     */
    private LocalDate tyrq;

    /**
     * 最大变位次数
     */
    private Integer zdbwcs;

    /**
     * 最大事故变位次数
     */
    private Integer zdsgbwcs;

    /**
     * 最大工作电压;计量单位:kV
     */
    private Double zdgzdy;

    /**
     * 额定电压;计量单位:kV
     */
    private String eddy;

    /**
     * 组合电器(开关柜)名称
     */
    private String zhdqkggmc;

    /**
     * 油号
     */
    private String yh;

    /**
     * 所属地市
     */
    private String ssds;

    /**
     * 维护班组
     */
    private String whbz;

    /**
     * 中午注释：标准代码，是和否。包括：1 是， 0 否
     */
    private String sfdw;

    /**
     * 操作机构型号
     */
    private String czjgxh;

    /**
     * 开关作用
     */
    private String kgzy;

    /**
     * 过流脱扣器额定脱扣电流(低压)
     */
    private Double gltkqedtkdldy;

    /**
     * 额定动稳定电流(峰值);计量单位:kA
     */
    private Double eddwddlfz;

    /**
     * 额定热稳定电流;计量单位:kA
     */
    private Double edrwddl;

    /**
     * 分/合闸控制线圈额定电压
     */
    private String fhzkzxqeddy;

    /**
     * 固有合闸时间;计量单位:s
     */
    private Double gyhzsj;

    /**
     * 固有分闸时间;计量单位:s
     */
    private Double gyfzsj;

    /**
     * 操作方式
     */
    private String czfs;

    /**
     * 正常运行方式
     */
    private String zcyxfs;

    /**
     * 重要程度
     */
    private String zycd;

    /**
     * 备注
     */
    private String bz;

    /**
     * 地区特征 包括：01:市中心区,02:市区,03:城镇,04:县城区,05:农村,06:乡镇,07:农牧区
     */
    private String dqtz;

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
     * 中午注释：标准代码，是和否。包括：1 是， 0 否
     */
    private String sfnw;

    /**
     * 输变配标识
     */
    private String sbpbs;

    /**
     * 额定工作压力(Mpa)
     */
    private Double edgzyl;

    /**
     * 发布状态包括：录入、发布默认发布
     */
    private String fbzt;

    /**
     * 分闸时间
     */
    private String fzsj;

    /**
     * 合闸时间
     */
    private String hzsj;

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
     * 所属大馈线
     */
    private String ssdkx;

    /**
     * 所属馈线线段
     */
    private String sskxxd;

    /**
     * 供电区域 包括：A+、A、B、C、D、E
     */
    private String gdqy;

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

    /**
     * 新增数据来源，0代表来源于本地主站和APP端，1代表来源于ERP
     */
    private String sjly;
}
