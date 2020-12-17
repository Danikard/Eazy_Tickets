package signUpLogin;
import java.sql.Connection;
import java.sql.DriverManager;

public class Db {
    public Connection databaseLink;
    public getConnection (){
        String databaseName ="demo_db";
        String databaseUserName="user";
        String databasePassword="password";
        String url="jdbc:mysql://localhost"+ databaseName;
        try{
            class.forName("com.mysql.cj.jbbc.driver");
            databaseLink= DriverManager.getConnection(url,databaseUserName,databasePassword);

        }catch (Exception e){
            e.printStackTrace();
            e.getCause();
        }
        return databaseLink;
    }

    public connection getConnection() {
    }
}
