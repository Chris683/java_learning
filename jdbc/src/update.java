import utils.JdbcUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * @author Chris
 * @create 2021-08-28-14:20
 */
public class update {
    public static void main(String[] args) throws Exception {
        Connection connection=null;
        PreparedStatement statement=null;
        ResultSet resultSet=null;
        try {
            connection= JdbcUtils.getConnection();
            //？占位符代替参数
            String sql="UPDATE users SET NAME=? WHERE id=?";
            //和Statement的区别！！！！！！！！！
            statement=connection.prepareStatement(sql);// 预编译SQL，先写sql,然后不执行
            //手动给参数赋值
            statement.setString(1,"kuang4444");
            statement.setInt(2,1);


            int i=statement.executeUpdate();
            if (i>0){
                System.out.println("跟新成功！");
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            JdbcUtils.release(connection,statement,resultSet);
        }
    }
}
