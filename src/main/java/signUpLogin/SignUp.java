package signUpLogin;
import java.util.List;
import org.sql2o.*;
import javafx.scene.control.PasswordField;



public class SignUp implements SignUpInt {
    private String name;
    private int id;

    public SignUp(String name) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    @Override
    public boolean equals(Object otherAnimal) {
        if (!(otherAnimal instanceof SignUp)) {
            return false;
        } else {
            SignUp newUser = (SignUp) otherUser;
            return this.getName().equals(newUser.getName());

        }
    }

    @Override
    public void save() {
        try (Connection con = Db.sql2o.open()) {
            String sql = "INSERT INTO animals (name) VALUES (:name)";
            this.id = (int) con.createQuery(sql, true)
                    .addParameter("name", this.name)
                    .executeUpdate()
                    .getKey();
        }
    }

    public static List<SignUp> all() {
        String sql = "SELECT * FROM animals";
        try (Connection con = Db.sql2o.open()) {
            return con.createQuery(sql).executeAndFetch(SignUp.class);
        }
    }
}