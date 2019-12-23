package com.example.demo.serviceimpl;

import com.example.demo.dto.TreeNode;
import com.example.demo.mapper.DemoMapper;
import com.example.demo.mapper.MenuMapper;
import com.example.demo.model.Menu;
import com.example.demo.model.Role;
import com.example.demo.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//    @Component
@ComponentScan(basePackages = "com.example.demo.mapper")
@Service("menuService")
    class MenuServiceImpl implements MenuService {
    @Autowired
    private MenuMapper menuMapper;
    public MenuMapper getMenuMapper() {return menuMapper; }
    @Resource
    public void setMenuMapper(MenuMapper menuMapper) {
        this.menuMapper = menuMapper;
    }

        @Override
        public List<TreeNode> find4tree() {
            List<Menu> list=menuMapper.getAllMenu();
//            List<Menu> list=(List<Menu>) hibernateTemplate.find("from Menu");
            List<TreeNode> list2= new ArrayList<TreeNode>();
            for (Iterator iterator = list.iterator(); iterator.hasNext();) {
                Menu menu = (Menu) iterator.next();
                TreeNode treeNode=new TreeNode();
                treeNode.setId(menu.getId());
                treeNode.setName(menu.getName());
                if(menu.getParent()!=null){//数据库表中收寄菜单外键一个为空在这里排除掉；
                    //根据parent找到对象，再根据对象找到ID；
                    treeNode.setpId(menu.getParent().getId());
                }
                list2.add(treeNode);
            }
            return list2;
        }

        @Transactional//如果没被拦截，切面切不到；
        public void select(Integer roleId, Integer[] menuIds) {
              Role role= menuMapper.getRole(roleId);
//            Role role=hibernateTemplate.get(Role.class, roleId);
            for (Integer mid : menuIds) {
            Menu menu =menuMapper.getMenu(mid);
//                Menu menu = hibernateTemplate.get(Menu.class, mid);
                role.getMenus().add(menu);
            }
//方法意义没有搞清楚            hibernateTemplate.update(role);
        }
    }


