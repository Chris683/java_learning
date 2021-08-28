import utils.JdbcUtils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * @author Chris
 * @create 2021-08-28-13:30
 */
public class textDelete {
    public static void main(String[] args) throws Exception {
        Connection connection=null;
        Statement statement=null;
        ResultSet resultSet=null;
        try {
            connection= JdbcUtils.getConnection();//获取数据链接
            statement=connection.createStatement();// 获得执行SQL对象

            String sql="DELETE FROM users WHERE id=6";
            int i=statement.executeUpdate(sql);
            if (i>0){
                System.out.println("删除成功！");
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            JdbcUtils.release(connection,statement,resultSet);
        }
    }
}
