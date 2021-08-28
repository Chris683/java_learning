import utils.JdbcUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * @author Chris
 * @create 2021-08-28-15:13
 */
public class shiWu {
    public static void main(String[] args) throws Exception {
        Connection connection=null;
        PreparedStatement statement=null;
        ResultSet resultSet=null;
        try{
            connection= JdbcUtils.getConnection();
            connection.setAutoCommit(false);//关闭自动提交 开启事务

            String sql1="update account set money=money-100 where name='A'";
            statement=connection.prepareStatement(sql1);
            statement.executeUpdate();
            //int i=1/0;


            String sql2="update account set money=money+100 where name='B'";
            statement=connection.prepareStatement(sql2);
            statement.executeUpdate();

            //业务完毕提交事务
            connection.commit();
            System.out.println("成功");

        }catch (Exception e){
            e.printStackTrace();
            //如果失败则回滚
            connection.rollback();
        }finally {
            JdbcUtils.release(connection,statement,resultSet);
        }
    }
}
