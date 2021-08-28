import utils.JdbcUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * @author Chris
 * @create 2021-08-28-14:35
 */
public class sqlzhuru {
    public static void main(String[] args) {
        //login2("lisi","123456");
        login2("'or'1=1","123456");
    }


    public static void login(String username,String password) {
        Connection connection=null;
        PreparedStatement statement=null;
        ResultSet resultSet=null;
        try {
            connection= JdbcUtils.getConnection();
            //？占位符代替参数
            String sql="SELECT * FROM users WHERE NAME =? AND PASSWORD = ?";
            //和Statement的区别！！！！！！！！！
            statement=connection.prepareStatement(sql);// 预编译SQL，先写sql,然后不执行
            //手动给参数赋值
            statement.setString(1,username);
            statement.setString(2,password);

            resultSet= statement.executeQuery();//返回结果集

            while (resultSet.next()){
                System.out.println(resultSet.getString("NAME"));
            }


        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                JdbcUtils.release(connection,statement,resultSet);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }


    public static void login2(String username,String password){
        Connection connection=null;
        Statement statement=null;
        ResultSet resultSet=null;
        try {
            connection= JdbcUtils.getConnection();//获取数据链接
            statement=connection.createStatement();// 获得执行SQL对象

            String sql="SELECT * FROM users WHERE NAME ='"+username+"' AND PASSWORD ='"+password+"'";

            resultSet= statement.executeQuery(sql);//返回结果集

            while (resultSet.next()){
                System.out.println(resultSet.getString("NAME"));
            }

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                JdbcUtils.release(connection,statement,resultSet);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
