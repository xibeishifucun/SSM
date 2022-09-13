package com.xibei.utils;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.jdbc.core.JdbcTemplate;

import java.beans.PropertyVetoException;

/**
 * @author xibei
 * @version 1.0
 */
public class JdbcUtils {
    public static JdbcTemplate getDataSource() {
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        try {
            dataSource.setDriverClass("com.mysql.cj.jdbc.Driver");
            dataSource.setJdbcUrl("jdbc:mysql://43.139.10.86:3306/test?useUnicode=true&characterEncoding=utf-8&serverTimezone=Asia/Shanghai&useSSL=true");
            dataSource.setUser("root");
            dataSource.setPassword("xibeijia");
        } catch (PropertyVetoException e) {
            e.printStackTrace();
        }
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
        return jdbcTemplate;
    }
}
