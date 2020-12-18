package signUpLogin;//package signUpLogin;
//
//import javafx.application.Application;
//import javafx.scene.Parent;
//import javafx.scene.Scene;
//import javafx.stage.Stage;
//
//public class Main extends Application{
//    public Stage primaryStage;
//
//
//    @Override
//    public void start(Stage stage) throws Exception {
//        Parent root;
//        root=;
//        primaryStage.setTitle("sign in");
//        primaryStage.setScene(new Scene(root,200,175));
//        primaryStage.show();
//    }
//    public static void main(String[]args){ launch(args);
//    }
//
//
//}
import java.util.HashMap;
import java.util.Map;
import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;
import static spark.Spark.*;
public class Main {
    public static void main(String[] args) {


        staticFileLocation("/public");
        get("/", (request, response) -> {
            Map<String, Object> model = new HashMap<String, Object>();
            model.put("userLogin", Login.all());
            model.put("usersignup", SignUp.all());
            return new ModelAndView(model, "index.hbs");
        }, new HandlebarsTemplateEngine());

        get("/animal/new", (request, response) -> {
            Map<String, Object> model = new HashMap<>();
            return new ModelAndView(model, "animal-form.hbs");
        }, new HandlebarsTemplateEngine());

        post("/animal/new", (request, response) -> {
            Map<String, Object> model = new HashMap<String, Object>();
            String userNAme = request.queryParams("userNAme");
            String name = request.queryParams("name");
            String password = request.queryParams("password");
            Login login = new Login(userNAme,password);
            login.save();
            SignUp signUp = new SignUp(name,userNAme,password);
            signUp.save();
            return new ModelAndView(model, "animal.hbs");
        }, new HandlebarsTemplateEngine());

        get("/endangeredAnimal/new", (request, response) -> {
            Map<String, Object> model = new HashMap<>();
            return new ModelAndView(model, "endangered-form.hbs");
        }, new HandlebarsTemplateEngine());

        post("/endangeredAnimal/new", (request, response) -> {
            Map<String, Object> model = new HashMap<>();
            String name = request.queryParams("name");
            String health = request.queryParams("health");
            String age = request.queryParams("age");
            String ranger_name = request.queryParams("ranger_name");
            String location = request.queryParams("location");
            SignUp signUp = new SignUp(name,health,age);
            signUp.save();
            return new ModelAndView(model, "endangered.hbs");
        }, new HandlebarsTemplateEngine());

        get("/recorded", (request, response) -> {
            Map<String, Object> model = new HashMap<>();
            model.put("allAnimals", Login.all());
            model.put("endangered", SignUp.all());
            return new ModelAndView(model, "recorded.hbs");
        }, new HandlebarsTemplateEngine());



    }
}
