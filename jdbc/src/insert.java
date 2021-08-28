import utils.JdbcUtils;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * @author Chris
 * @create 2021-08-28-14:08
 */
public class insert {
    public static void main(String[] args) throws Exception {
        Connection connection=null;
        PreparedStatement statement=null;
        ResultSet resultSet=null;
        try {
            connection= JdbcUtils.getConnection();
            //？占位符代替参数
            String sql="insert into users(id,name,password,email,birthday)" +
                    "values(?,?,?,?,?);";
            //和Statement的区别！！！！！！！！！
            statement=connection.prepareStatement(sql);// 预编译SQL，先写sql,然后不执行
            //手动给参数赋值
            statement.setInt(1,99);
            statement.setString(2,"hhh");
            statement.setString(3,"12312313");
            statement.setString(4,"15612318@qq.com");
            statement.setDate(5,new java.sql.Date(new Date(1234).getTime()));

            int i=statement.executeUpdate();
            if (i>0){
                System.out.println("插入成功！");
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            JdbcUtils.release(connection,statement,resultSet);
        }
    }

}
