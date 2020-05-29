package com.axy.intelligentcontrolplatform.standing.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 换流变
 * </p>
 *
 * @author liwenqiang
 * @since 2020-05-14
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("t_sb_zlsb_hl")
public class TSbZlsbHl implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 换流变ID
     */
    @TableId("obj_id")
    private String objId;

    /**
     * 设备编码
     */
    private String sbbm;

    /**
     * 电系铭牌运行库ID
     */
    private String dxmpyxkid;

    /**
     * 设备名称
     */
    private String sbmc;

    /**
     * 运行编号
     */
    private String yxbh;

    /**
     * 所属地市
     */
    private String ssds;

    /**
     * 运维单位
     */
    private String ywdw;

    /**
     * 维护班组
     */
    private String whbz;

    /**
     * 换流站
     */
    private String hlz;

    /**
     * 电压等级包括：1:交流6V、2:交流12V、3:交流24V、4:交流36V、5:交流48V 、6:交流110V、7:交流220V、8:交流380V(含400V)、51:直流6V、52:直流12V、53:直流24V、54:直流36V、、88:直流320kV
     */
    private String dydj;

    /**
     * 间隔单元
     */
    private String jgdy;

    /**
     * 使用环境
     */
    private String syhj;

    /**
     * 相数
     */
    private String xs;

    /**
     * 相别 包括：1:A,2:B,3:C,4:O,5:ABC,6:ABCO
     */
    private String xb;

    /**
     * 高低端
     */
    private String gdd;

    /**
     * 资产性质 包括：01:国家电网公司,02:分部,03:省（直辖市、自治区）公司,04:子公司,05:用户
     */
    private String zcxz;

    /**
     * 资产单位
     */
    private String zcdw;

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
     * 投运日期
     */
    private LocalDate tyrq;

    /**
     * 运行状态 包括：31:现场留用 32:库存备用 20:在运 30:退役 40:报废 10:未投运 33:待报废
     */
    private String yxzt;

    /**
     * 型号
     */
    private String xh;

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
     * 器身重量
     */
    private Double qszl;

    /**
     * 运输重量
     */
    private Double yszl;

    /**
     * 外形尺寸
     */
    private String wxcc;

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
     * 调压方式
     */
    private String dyfs;

    /**
     * 中性点接地方式
     */
    private String zxdjdfs;

    /**
     * 联接组标号
     */
    private String ljzbh;

    /**
     * "额定容量;计量单位:MW"
     */
    private Double edrl;

    /**
     * 电压比
     */
    private String dyb;

    /**
     * "额定电流(中压)；计量单位:A"
     */
    private Double eddlzy;

    /**
     * "额定电流(低压);计量单位:A"
     */
    private Double eddldy;

    /**
     * "短路阻抗(高压-中压)；计量单位:%"
     */
    private Double dlzkgyzy;

    /**
     * "短路阻抗(高压-低压);计量单位:%"
     */
    private Double dlzkgydy;

    /**
     * "短路阻抗(中压-低压);计量单位:%"
     */
    private Double dlzkzydy;

    /**
     * "空载电流；计量单位:%"
     */
    private Double kzdl;

    /**
     * "空载损耗;计量单位:kW"
     */
    private Double kzsh;

    /**
     * 绝缘耐热等级
     */
    private String jynrdj;

    /**
     * 防污等级
     */
    private String fwdj;

    /**
     * "最大短路电流;计量单位:kA"
     */
    private Double zddldl;

    /**
     * "额定频率；计量单位:Hz"
     */
    private Double edpl;

    /**
     * 额定电压(网侧)kV
     */
    private String eddywcv;

    /**
     * 额定电压(阀侧Y绕组)kV
     */
    private String eddyfcyrzv;

    /**
     * 额定电压(阀侧△绕组)kV
     */
    private String eddyfcrzv;

    /**
     * "额定电流(网侧)；计量单位:A"
     */
    private Double eddlwc;

    /**
     * "额定电流(阀侧Y绕组)；计量单位:A"
     */
    private Double eddlfcyrz;

    /**
     * 额定电流(阀侧△绕组)(A)
     */
    private Double eddlfcrza;

    /**
     * 有载分接头调节调压档数(最高档位/最低档位)
     */
    private String yzfjtdjdydszgdwzddw;

    /**
     * "换流变压器最高抽头线电压;计量单位:kV"
     */
    private Double hlbyqzgctxdy;

    /**
     * "换流变压器最低抽头线电压；计量单位:kV"
     */
    private Double hlbyqzdctxdy;

    /**
     * 换流变压器抽头级数
     */
    private Integer hlbyqctjs;

    /**
     * "漏抗；计量单位:kW"
     */
    private Double lk;

    /**
     * 备 注
     */
    private String bz;

    /**
     * 登记时间
     */
    private LocalDateTime djsj;

    /**
     * 设备主人
     */
    private String sbzr;

    /**
     * 运行单位名称
     */
    private String ywdwmc;

    /**
     * 所属地市名称
     */
    private String ssdsmc;

    /**
     * 设备主人名称
     */
    private String sbzrmc;

    /**
     * 资产单位名称
     */
    private String zcdwmc;

    /**
     * 维护班组名称
     */
    private String whbzmc;

    /**
     * 分接头累计调整次数
     */
    private Integer fjtljdzcs;

    /**
     * 负载损耗
     */
    private Double fzsh;

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
     * 实物ID
     */
    private String swid;

    /**
     * 匹配时间
     */
    private LocalDateTime ppsj;

    /**
     * 匹配失败原因
     */
    private String ppsbyy;

    /**
     * 码类型
     */
    private String mlx;

    /**
     * 打印备注
     */
    private String jdbz;

    /**
     * 打印次数
     */
    private Integer dycs;

    /**
     * 是否有实物:(01:实际现场有实物,02:实际现场无实物)
     */
    private String sfysw;

    /**
     * 匹配状态:(01:未匹配,02:匹配成功,03:匹配失败)
     */
    private String sfpp;

    /**
     * 是否打印
     */
    private String sfjd;

    /**
     * 台账来源（1:pc端,2:app）
     */
    private String tzly;


}
