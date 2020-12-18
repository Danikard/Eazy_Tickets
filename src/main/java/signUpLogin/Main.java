package signUpLogin;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application{
    public Stage primaryStage;


    @Override
    public void start(Stage stage) throws Exception {
        Parent root;
        root=;
        primaryStage.setTitle("sign in");
        primaryStage.setScene(new Scene(root,200,175));
        primaryStage.show();
    }
    public static void main(String[]args){ launch(args);
    }


}

