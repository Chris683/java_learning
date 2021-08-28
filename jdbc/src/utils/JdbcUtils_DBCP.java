package utils;


import org.apache.commons.dbcp.BasicDataSourceFactory;

import javax.sql.DataSource;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;


/**
 * @author Chris
 * @create 2021-08-28-15:35
 */
public class JdbcUtils_DBCP {
    private static DataSource dataSource=null;

    static {
        try {
            InputStream in = JdbcUtils.class.getClassLoader().getResourceAsStream("dbcpconfig.properties");
            Properties properties=new Properties();
            assert in != null;
            properties.load(in);

            //创建数据源 工厂模式→创建
            dataSource= BasicDataSourceFactory.createDataSource(properties);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    //获取连接
    public static Connection getConnection() throws Exception {
        return dataSource.getConnection();
    }

    //施放资源
    public  static void release(Connection connection, Statement statement, ResultSet resultSet) throws Exception {
        if (resultSet != null) {
            resultSet.close();
        }
        if (statement != null) {
            statement.close();
        }
        if (connection != null) {
            connection.close();
        }

    }

}
