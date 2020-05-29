package com.axy.intelligentcontrolplatform.sys.controller;


import com.axy.intelligentcontrolplatform.basic.dto.MessageBean;
import com.axy.intelligentcontrolplatform.sys.entity.Menu;
import com.axy.intelligentcontrolplatform.sys.entity.User;
import com.axy.intelligentcontrolplatform.sys.requestParam.MenuParam;
import com.axy.intelligentcontrolplatform.sys.service.IMenuService;
import com.axy.intelligentcontrolplatform.sys.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 * 菜单管理 前端控制器
 * </p>
 *
 * @author yct
 * @since 2020-04-29
 */
@RestController
@RequestMapping("/sys/menu")
public class MenuController {
    private IMenuService menuService;
    private MenuController(IMenuService menuService){
        this.menuService = menuService;
    }
    @Autowired
    private IUserService userService;
    @GetMapping("GET/menu/current-user")
    public MessageBean getSysMenuList(){
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String name = authentication.getName();
        User user = userService.getUser(name);
        return  menuService.getCurrentUserMenu(user.getRoleIdStr());
    }

    @PostMapping("POST/menu")
    public MessageBean addOverHaulUnit(Menu menu){
        return menuService.addMenu(menu);
    }

    @DeleteMapping("DELETE/menu")
    public MessageBean deleteOverHaulUnit(Long id){
        return menuService.deleteMenu(id);
    }

    @PutMapping("PUT/menu")
    public MessageBean putOverHaulUnit(Menu menu){
        return menuService.putMenu(menu);
    }

    @GetMapping("GET/menus")
    public MessageBean getMenus(MenuParam menuParam){
        return menuService.getMenus(menuParam);
    }



}
