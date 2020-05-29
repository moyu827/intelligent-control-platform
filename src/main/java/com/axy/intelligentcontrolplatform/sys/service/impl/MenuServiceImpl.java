package com.axy.intelligentcontrolplatform.sys.service.impl;

import com.axy.intelligentcontrolplatform.basic.dto.MessageBean;
import com.axy.intelligentcontrolplatform.basic.utils.IdGenerator;
import com.axy.intelligentcontrolplatform.basic.utils.QueryWrapperUtils;
import com.axy.intelligentcontrolplatform.sys.entity.Menu;
import com.axy.intelligentcontrolplatform.sys.entity.OverhaulUnit;
import com.axy.intelligentcontrolplatform.sys.mapper.MenuMapper;
import com.axy.intelligentcontrolplatform.sys.requestParam.MenuParam;
import com.axy.intelligentcontrolplatform.sys.service.IMenuService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * <p>
 * 菜单管理 服务实现类
 * </p>
 *
 * @author yct
 * @since 2020-04-29
 */
@Service
public class MenuServiceImpl extends ServiceImpl<MenuMapper, Menu> implements IMenuService {
    @Autowired
    private MenuMapper menuMapper;

    @Override
    public MessageBean getCurrentUserMenu(String roleIdStr) {
        MessageBean messageBean = new MessageBean();
        if(null != roleIdStr && !"".equals(roleIdStr)){
            List<Menu> list = menuMapper.getCurrentUserMenu(roleIdStr);
            for (Menu menu : list) {
                Long menuId = menu.getMenuId();
                List<Menu> childList = new ArrayList<>();
                for (Menu other : list) {
                    Long parentId = other.getParentId();
                    if (menuId.equals(parentId)) {
                        childList.add(other);
                    }
                }
                menu.setList(childList);
            }
            Iterator<Menu> iterator = list.iterator();
            while (iterator.hasNext()) {
                Menu next = iterator.next();
                Long parentId = next.getParentId();
                if (parentId != 0) {
                    iterator.remove();
                }
            }
            messageBean.setTotal(list.size());
            messageBean.setMessage("获取成功");
            messageBean.setRows(list);
            messageBean.setStatus("success");
        }
        return messageBean;
    }

    @Override
    public MessageBean addMenu(Menu menu) {
        QueryWrapper<Menu> queryWrapper = QueryWrapperUtils.getQueryWrapper(Menu.class);
        queryWrapper.eq("name",menu.getName());
        queryWrapper.eq("type",menu.getType());
        List<Menu> list = this.list(queryWrapper);
        if(list.size() > 0){
            MessageBean messageBean = new MessageBean();
            messageBean.setStatus("fail");
            messageBean.setMessage("已存在相同名称的菜单");
            return messageBean;
        }
        IdGenerator idGenerator = new IdGenerator();
        menu.setMenuId(idGenerator.nextId());
        this.save(menu);
        return MessageBean.postSuccessMessageBean();
    }

    @Override
    public MessageBean deleteMenu(Long id) {
        this.removeById(id);
        return MessageBean.deleteSuccessMessageBean();
    }

    @Override
    public MessageBean putMenu(Menu menu) {
        this.updateById(menu);
        return MessageBean.putSuccessMessageBean();
    }


    @Override
    public MessageBean getMenus(MenuParam menuParam) {
        List<Menu> list = menuMapper.getMenus(menuParam);
        return MessageBean.getListSuccessMessageBean(list.size(),list);
    }

}
