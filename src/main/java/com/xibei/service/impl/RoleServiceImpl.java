package com.xibei.service.impl;

import com.xibei.dao.RoleDao;
import com.xibei.domain.Role;
import com.xibei.service.RoleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author xibei
 * @version 1.0
 */
@Service
public class RoleServiceImpl implements RoleService {
    @Resource
    RoleDao roleDao;
    @Override
    public List<Role> roleList() {
        return roleDao.roleList();
    }
}
