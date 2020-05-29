package com.axy.intelligentcontrolplatform.standing.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 主变压器
 * </p>
 *
 * @author liwenqiang
 * @since 2020-05-14
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("t_sb_znyc_zbyq")
public class TSbZnycZbyq implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 变压器ID
     */
    @TableId("obj_id")
    private String objId;

    /**
     * 设备名称
     */
    private String sbmc;

    /**
     * 电系铭牌运行库ID
     */
    private String dxmpyxkid;

    /**
     * "设备编码；设备类型的设备都具有该编码"
     */
    private String sbbm;

    /**
     * 间隔单元
     */
    private String jgdy;

    /**
     * 运行编号
     */
    private String yxbh;

    /**
     * 运维单位
     */
    private String ywdw;

    /**
     * 维护班组
     */
    private String whbz;

    /**
     * 所属站房
     */
    private String sszf;

    /**
     * 资产性质 包括：01:国家电网公司,02:分部,03:省（直辖市、自治区）公司,04:子公司,05:用户
     */
    private String zcxz;

    /**
     * "额定电压；计量单位:kV"
     */
    private String eddy;

    /**
     * 所属地市
     */
    private String ssds;

    /**
     * 电压比
     */
    private String dyb;

    /**
     * 空载电流
     */
    private Double kzdl;

    /**
     * "总重；计量单位:t"
     */
    private Double zz;

    /**
     * 油号
     */
    private String yh;

    /**
     * 资产单位
     */
    private String zcdw;

    /**
     * 电压等级包括：1:交流6V、2:交流12V、3:交流24V、4:交流36V、5:交流48V 、6:交流110V、7:交流220V、8:交流380V(含400V)、51:直流6V、52:直流12V、53:直流24V、54:直流36V、、88:直流320kV
     */
    private String dydj;

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
     * 出厂日期
     */
    private LocalDate ccrq;

    /**
     * 最近投运日期
     */
    private LocalDate zjtyrq;

    /**
     * 使用环境
     */
    private String syhj;

    /**
     * 绝缘耐热等级
     */
    private String jynrdj;

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
     * 用途
     */
    private String yt;

    /**
     * 绝缘介质 包括：1:油浸,2:SF6,3:干式,4:环氧树脂,5:光电式,6:空气,7:真空,8:氮气（N2） 
     */
    private String jyjz;

    /**
     * 绕组型式
     */
    private String rzxs;

    /**
     * 结构型式
     */
    private String jgxs;

    /**
     * 冷却方式
     */
    private String lqfs;

    /**
     * 调压方式
     */
    private String dyfs;

    /**
     * 安装位置
     */
    private String azwz;

    /**
     * 联接组标号
     */
    private String ljzbh;

    /**
     * "额定容量；计量单位:MVA"
     */
    private Double edrl;

    /**
     * "自冷却容量；计量单位:%"
     */
    private Double zlqrl;

    /**
     * "额定电流(中压)；计量单位:A"
     */
    private Double eddlzy;

    /**
     * "额定电流(低压)；计量单位:A"
     */
    private Double eddldy;

    /**
     * "短路阻抗(高压-中压)；计量单位:%"
     */
    private Double dlzkgyzy;

    /**
     * "短路阻抗(高压-低压)；计量单位:%"
     */
    private Double dlzkgydy;

    /**
     * "短路阻抗(中压-低压)；计量单位:%"
     */
    private Double dlzkzydy;

    /**
     * "空载损耗；计量单位:kW"
     */
    private Double kzsh;

    /**
     * "负载损耗(满载)；计量单位:kW"
     */
    private Double fzshmz;

    /**
     * "油重；计量单位:t"
     */
    private Double yz;

    /**
     * 油产地
     */
    private String ycd;

    /**
     * "SF6气体额定压力；计量单位:Mpa"
     */
    private Double sf6qtedyl;

    /**
     * "SF6气体报警压力；计量单位:Mpa"
     */
    private Double sf6qtbjyl;

    /**
     * 累计调档次数
     */
    private String ljddcs;

    /**
     * 运行状态 包括：31:现场留用 32:库存备用 20:在运 30:退役 40:报废 10:未投运 33:待报废
     */
    private String yxzt;

    /**
     * 防污等级
     */
    private String fwdj;

    /**
     * 绝缘水平
     */
    private String jysp;

    /**
     * 绝缘水平(中性点)
     */
    private String jyspzxd;

    /**
     * "额定电压(中压)；计量单位:kV"
     */
    private String eddyzy;

    /**
     * "额定电压(低压)；计量单位:kV"
     */
    private String eddydy;

    /**
     * "负载损耗(高压-低压)；计量单位:kW"
     */
    private Double fzshgydy;

    /**
     * "负载损耗(高压-中压)；计量单位:kW"
     */
    private Double fzshgyzy;

    /**
     * "负载损耗(中压-低压)；计量单位:kW"
     */
    private Double fzshzydy;

    /**
     * "100%强迫风冷噪声；计量单位:dB"
     */
    private Double qpflzs;

    /**
     * "油枕容量；计量单位:m3"
     */
    private Double yzrl;

    /**
     * 油枕密封方式
     */
    private String yzmffs;

    /**
     * 有无热虹吸
     */
    private String ywrhx;

    /**
     * "上节油箱重；计量单位:t"
     */
    private Double sjyxz;

    /**
     * 油(气)箱结构
     */
    private String yqxjg;

    /**
     * SF6厂家
     */
    private String sf6cj;

    /**
     * "SF6气体重量；计量单位:kg"
     */
    private Double sf6qtzl;

    /**
     * "SF6气重(本体)；计量单位:kg"
     */
    private Double sf6qzbt;

    /**
     * "SF6气重(电缆仓)；计量单位:kg"
     */
    private Double sf6qzdlc;

    /**
     * "SF6气重(有载开关)；计量单位:kg"
     */
    private Double sf6qzyzkg;

    /**
     * "SF6气体压力(本体)；计量单位:MPa"
     */
    private Double sf6qtylbt;

    /**
     * "SF6气体压力(电缆仓)；计量单位:MPa"
     */
    private Double sf6qtyldlc;

    /**
     * "SF6气体压力(有载开关)；计量单位:MPa"
     */
    private Double sf6qtylyzkg;

    /**
     * "冷却水重；计量单位:t"
     */
    private Double lqsz;

    /**
     * "器身重；计量单位:t"
     */
    private Double qsz;

    /**
     * "运输重；计量单位:t"
     */
    private Double ysz;

    /**
     * 投运日期
     */
    private LocalDate tyrq;

    /**
     * 相数
     */
    private String xs;

    /**
     * 相别 包括：1:A,2:B,3:C,4:O,5:ABC,6:ABCO
     */
    private String xb;

    /**
     * "额定电流；计量单位:A"
     */
    private Double eddl;

    /**
     * "额定频率；计量单位:Hz"
     */
    private Double edpl;

    /**
     * 设备增加方式 包括：01:设备增加-基本建设,02:设备增加-技术改造,03:设备增加-零星购置,04:设备增加-投资者投入,05:设备增加-融资租入,06:设备增加-债务重组取得,07:设备增加-接受捐赠,08:设备增加-无偿调入,09:设备增加-盘盈,10:设备增加-其他途径 
     */
    private String sbzjfs;

    /**
     * 型号
     */
    private String xh;

    /**
     * 中性点接地方式
     */
    private String zxdjdfs;

    /**
     * 备注
     */
    private String bz;

    /**
     * "上层油温限值；计量单位:℃"
     */
    private Double scywxz;

    /**
     * "绕组温度限值；计量单位:℃"
     */
    private Double rzwdxz;

    /**
     * 高压侧抽头档位
     */
    private String gycctdw;

    /**
     * 中压侧抽头档位
     */
    private String zycctdw;

    /**
     * 低压侧抽头档位
     */
    private String dycctdw;

    /**
     * "中压侧容量；计量单位:MW"
     */
    private Double zycrl;

    /**
     * "低压侧容量；计量单位:MW"
     */
    private Double dycrl;

    /**
     * "高压侧零序电阻；计量单位:Ω"
     */
    private Double gyclxdz;

    /**
     * "高压侧零序电抗；计量单位:s"
     */
    private Double gyclxdk;

    /**
     * "中压侧零序电阻；计量单位:Ω"
     */
    private Double zyclxdz;

    /**
     * "中压侧零序电抗；计量单位:s"
     */
    private Double zyclxdk;

    /**
     * "低压侧零序电阻；计量单位:Ω"
     */
    private Double dyclxdz;

    /**
     * "低压侧零序电抗；计量单位:s"
     */
    private Double dyclxdk;

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
     * 发布状态包括：录入、发布默认发布
     */
    private String fbzt;

    /**
     * 容量比
     */
    private String rlb;

    /**
     * 噪声水平(db)
     */
    private String zssp;

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
     * 开关编号
     */
    private String kgbh;

    /**
     * 是否发变组
     */
    private String sffbz;

    /**
     * 发电机名称
     */
    private String fdjmc;

    /**
     * 实物ID
     */
    private String swid;

    /**
     * 打印次数
     */
    private Long dycs;

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
