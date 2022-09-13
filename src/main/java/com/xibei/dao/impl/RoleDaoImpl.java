package com.xibei.dao.impl;

import com.xibei.dao.RoleDao;
import com.xibei.domain.Role;
import com.xibei.utils.JdbcUtils;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.beans.PropertyVetoException;
import java.util.List;

/**
 * @author xibei
 * @version 1.0
 */
@Component
public class RoleDaoImpl implements RoleDao {
    /*@Resource
    JdbcTemplate jdbcTemplate;*/
    JdbcTemplate jdbcTemplate = JdbcUtils.getDataSource();

    @Override
    public List<Role> roleList() {
        String sql = "select * from sys_role";
        List<Role> roleList = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Role.class));
        System.out.println(roleList);
        return roleList;
    }
}
