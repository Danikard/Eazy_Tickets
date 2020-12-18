package signUpLogin;//package signUpLogin;
//import javafx.event.ActionEvent;
//import javafx.scene.control.PasswordField;
//import javafx.scene.control.TextField;
//import javafx.scene.control.Label;
//
//import java.sql.Connection;
//
//public class Login {
//    private TextField usernameTextField;
//    private PasswordField enterPasswordField;
//    private Label loginMassageLabel;
//
//    public void loginButtonOnAction(ActionEvent event) {
//
//        if (usernameTextField.getText().isEmpty() == false && enterPasswordField.getText().isEmpty() == false) {
//            loginMassageLabel.setText("tried login");
//
//
//        } else {
//            loginMassageLabel.setText("tried login");
//        }
//
//    }
//
//    public void validateLogin(){
//     DB connectNow =new DB();
//     Connection connectDB= connectNow.getConnection();
//     try{
//
//     }catch (Exception e){
//         e.printStackTrace();
//         e.getCause();
//     }
//
//    }
//}
import java.util.List;

import javafx.scene.control.PasswordField;
import org.sql2o.*;
import signUpLogin.SignUpInt;

public class Login implements SignUpInt {

    private String userNAme ;
    private String password;
    private int id;

    public Login(String userNAme, String password) {

        this.userNAme = userNAme;
        this.password = password;
    }

    public String getuserNAme() {
        return userNAme;
    }
    public int getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }


    @Override
    public boolean equals(Object otherUser) {
        if (!(otherUser instanceof Login)) {
            return false;
        } else {
            Login newuser = (Login) otherUser;
            return this.getuserNAme().equals(newuser.getuserNAme())&&this.getPassword().equals(newuser.getPassword());
        }
    }

//    @Override
    public void save() {
        try (Connection con = DB.sql2o.open()) {
            String sql = "INSERT INTO endangered_animals (name,password) VALUES (:name,:password)";
            this.id = (int) con.createQuery(sql, true)
                    .addParameter("name", this.userNAme)
                    .addParameter("password", this.password)
                    .executeUpdate()
                    .getKey();
        }

    }
    public static List<Login> all() {
        String sql = "SELECT * FROM endangered_animals";
        try (Connection con = DB.sql2o.open()) {
            return con.createQuery(sql).executeAndFetch(Login.class);
        }
    }

}

