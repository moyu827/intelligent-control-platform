package com.axy.intelligentcontrolplatform.basic.requestParam;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;

@Data
public class PageParam {
    @TableField(exist = false)
    private Integer currentPage;
    @TableField(exist = false)
    private Integer pageSize;
}
