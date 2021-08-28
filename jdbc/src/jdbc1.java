import java.sql.*;

/**
 * @author Chris
 * @create 2021-08-28-11:16
 */
public class jdbc1 {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // 1 加载驱动
        Class.forName("com.mysql.jdbc.Driver");//固定写法

        // 2. 用户信息和url
        String url = "jdbc:mysql://localhost:3306/jdbcstudy?useUnicode=true&characterEncoding=utf8&useSSL=false";
        String username = "root";
        String password = "9683";

        // 3. 链接成功，数据据库对象
        Connection connection = DriverManager.getConnection(url, username, password);

        // 4.执行SQL的对象 statement 执行sql对象
        Statement statement = connection.createStatement();

        //5. 执行SQL的对象取执行SQL，可能存在结果，查看返回结果
        String sql = "SELECT * FROM users";
        ResultSet resultSet = statement.executeQuery(sql);//返回结果集

        while (resultSet.next()){
            System.out.println("id="+resultSet.getObject("id"));
            System.out.println("name"+ resultSet.getObject("name"));
           // System.out.println("age="+resultSet.getObject("age"));
        }

        // 6释放链接
        resultSet.close();
        statement.close();
        connection.close();

    }

}