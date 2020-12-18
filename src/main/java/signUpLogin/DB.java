package signUpLogin;
import org.sql2o.Sql2o;

public class DB {
    public static Sql2o sql2o = new Sql2o("jdbc:postgresql://localhost:5432/wildlife_tracker", "karambizi", "12345");
}







//package signUpLogin;
//import java.sql.Connection;
//import java.sql.DriverManager;
//
//public class DB {
//    public Connection databaseLink;
//    public Connection getConnection (){
//        String databaseName ="demo_db";
//        String databaseUserName="user";
//        String databasePassword="password";
//        String url="jdbc:mysql://localhost"+ databaseName;
//        try{
//            Class.forName("com.mysql.cj.jbbc.driver");
//            databaseLink= DriverManager.getConnection(url,databaseUserName,databasePassword);
//
//        }catch (Exception e){
//            e.printStackTrace();
//            e.getCause();
//        }
//        return databaseLink;
//    }
//
//
//}
