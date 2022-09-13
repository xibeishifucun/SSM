import com.mchange.v2.c3p0.ComboPooledDataSource;
import com.xibei.domain.Role;
import org.junit.Test;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.annotation.Resource;
import java.beans.PropertyVetoException;
import java.util.List;

/**
 * @author xibei
 * @version 1.0
 */
public class ProjectTest {
    @Test
    public void roleList() throws PropertyVetoException {
        JdbcTemplate jdbcTemplate = this.getDataSource();
        String sql = "select * from sys_role";
        List<Role> roleList = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Role.class));
        System.out.println(roleList);

    }
    public JdbcTemplate getDataSource() {
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        try {
            dataSource.setDriverClass("com.mysql.cj.jdbc.Driver");
        } catch (PropertyVetoException e) {
            e.printStackTrace();
        }
        dataSource.setJdbcUrl("jdbc:mysql://43.139.10.86:3306/test?useUnicode=true&characterEncoding=utf-8&serverTimezone=Asia/Shanghai&useSSL=true");
        dataSource.setUser("root");
        dataSource.setPassword("xibeijia");
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
        return jdbcTemplate;
    }
}
