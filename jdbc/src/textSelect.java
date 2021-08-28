import utils.JdbcUtils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * @author Chris
 * @create 2021-08-28-13:44
 */
public class textSelect {
    public static void main(String[] args) throws Exception {
        Connection connection=null;
        Statement statement=null;
        ResultSet resultSet=null;
        try {
            connection= JdbcUtils.getConnection();//获取数据链接
            statement=connection.createStatement();// 获得执行SQL对象

            String sql="SELECT * FROM users WHERE id =1";

            resultSet= statement.executeQuery(sql);//返回结果集

            while (resultSet.next()){
                System.out.println(resultSet.getString("NAME"));
            }

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            JdbcUtils.release(connection,statement,resultSet);
        }
    }
}
