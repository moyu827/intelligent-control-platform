package com.axy.intelligentcontrolplatform.sys.service;

import com.axy.intelligentcontrolplatform.basic.dto.MessageBean;
import com.axy.intelligentcontrolplatform.sys.entity.Menu;
import com.axy.intelligentcontrolplatform.sys.requestParam.MenuParam;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 菜单管理 服务类
 * </p>
 *
 * @author yct
 * @since 2020-04-29
 */
public interface IMenuService extends IService<Menu> {
    /**
     * 获取当前登录人的菜单
     *
     * @param roleIdStr
     * @return
     */
    MessageBean getCurrentUserMenu(String roleIdStr);

    /**
     * 新增
     * @param menu
     * @return
     */
    MessageBean addMenu(Menu menu);

    /**
     * 单个删除
     * @param id
     * @return
     */
    MessageBean deleteMenu(Long id);

    /**
     * 修改
     * @param menu
     * @return
     */
    MessageBean putMenu(Menu menu);

    /**
     * 根据条件获取菜单
     * @param menuParam
     * @return
     */
    MessageBean getMenus(MenuParam menuParam);

}
