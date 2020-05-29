package com.axy.intelligentcontrolplatform.sys.mapper;

import com.axy.intelligentcontrolplatform.basic.dto.MessageBean;
import com.axy.intelligentcontrolplatform.sys.entity.Menu;
import com.axy.intelligentcontrolplatform.sys.requestParam.MenuParam;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * <p>
 * 菜单管理 Mapper 接口
 * </p>
 *
 * @author yct
 * @since 2020-04-29
 */
@Repository
public interface MenuMapper extends BaseMapper<Menu> {
    /**
     * 获取当前登录人的菜单
     * @param roleIdStr
     * @return
     */
    List<Menu> getCurrentUserMenu(String roleIdStr);


    List<Menu> getMenus(MenuParam menuParam);

}
