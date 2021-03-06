package cn.itheima;

/*
    DBCP连接池的工具类
 */
import org.apache.commons.dbcp.BasicDataSource;
    import javax.sql.DataSource;
    import javax.xml.crypto.Data;

public class JDBCUtils02 {
    private static BasicDataSource dataSource = new BasicDataSource();

    static{
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/mybase");
        dataSource.setUsername("root");
        dataSource.setPassword("admin");
        dataSource.setInitialSize(10);
        dataSource.setMaxActive(8);
        dataSource.setMaxIdle(5);
        dataSource.setMinIdle(1);
    }

    public static DataSource getDataSource(){
        return dataSource;
    }
}
