package signUpLogin;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.control.Label;

public class Login {
    private TextField usernameTextField;
    private PasswordField enterPasswordField;
    private Label loginMassageLabel;

    public Button loginButtonOnAction(ActionEvent event) {

        if (usernameTextField.getText().isBlank() == false && enterPasswordField.getText().isBlank() == false) {
            loginMassageLabel.setText("tried login");


        } else {
            loginMassageLabel.setText("tried login");
        }


    }
}
