package signUpLogin;

//public class Main {
//}
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application{

    @Override
    public void start(Stage stage) throws Exception {
        primaryStage.setTitle("sign in");
        primaryStage.setScene(new Scene(root,200,175));
        primaryStage.show();
    }
    public static void main(String[]args){ launch(args);
    }


}

