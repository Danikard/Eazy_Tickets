package signUpLogin;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import java.io.File;
import java.sql.Connection;
import java.util.ResourceBundle;
import java.net.URL;
public class Login {
    private TextField usernameTextField;
    private PasswordField enterPasswordField;
    private Label loginMassageLabel;

    public void loginButtonOnAction(ActionEvent event) {

        if (usernameTextField.getText().isEmpty() == false && enterPasswordField.getText().isEmpty() == false) {
            loginMassageLabel.setText("tried login");


        } else {
            loginMassageLabel.setText("tried login");
        }

    }

    public void validateLogin(){
     Db connectNow =new Db();
     Connection connectDB= connectNow.getConnection();
     try{

     }catch (Exception e){
         e.printStackTrace();
         e.getCause();
     }

    }
}
