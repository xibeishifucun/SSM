package com.xibei.controller.impl;

import com.xibei.controller.RoleController;
import com.xibei.domain.Role;
import com.xibei.service.RoleService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import javax.annotation.Resource;
import java.util.List;

/**
 * @author xibei
 * @version 1.0
 */
@Controller
@RequestMapping("/role")
public class RoleControllerImpl implements RoleController {
    @Resource
    RoleService roleService;
    @Override
    @RequestMapping("/list")
    public ModelAndView roleList() {
        List<Role> roleList = roleService.roleList();
        System.out.println("111");
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("roleList",roleList);
        modelAndView.setViewName("role-list");
        return modelAndView;
    }
}
