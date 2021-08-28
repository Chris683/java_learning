import utils.JdbcUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * @author Chris
 * @create 2021-08-28-14:26
 */
public class select {
    public static void main(String[] args) throws Exception {
        Connection connection=null;
        PreparedStatement statement=null;
        ResultSet resultSet=null;
        try {
            connection= JdbcUtils.getConnection();
            //？占位符代替参数
            String sql="SELECT * FROM users WHERE id =?";
            //和Statement的区别！！！！！！！！！
            statement=connection.prepareStatement(sql);// 预编译SQL，先写sql,然后不执行
            //手动给参数赋值
            statement.setInt(1,1);

            resultSet= statement.executeQuery();//返回结果集

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
