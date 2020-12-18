package signUpLogin;

import org.sql2o.*;

import java.util.List;

public class SignUp implements SignUpInt {

    private String name;
    private String userNAme;
    private int id;
    private String password;
    private String confirmPassword;

    public SignUp (String name, String userNAme, String password) {
        this.name = name;
        this.userNAme =userNAme;
        this.password = password;
    }
    public String getName() {
        return name;
    }
    public int getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    @Override
    public boolean equals(Object otherUSer) {
        if (!(otherUSer instanceof SignUp )) {
            return false;
        } else {
            SignUp newEndangeredAnimal = (SignUp ) otherUSer;
            return this.getName().equals(newEndangeredAnimal.getName())&&this.getPassword().equals(newEndangeredAnimal.getPassword())&&this.getConfirmPassword().equals(newEndangeredAnimal.getConfirmPassword());

        }
    }

//    @Override
    public void save() {
        try (Connection con = DB.sql2o.open()) {
            String sql = "INSERT INTO endangered_animals (name,health,age) VALUES (:name,:health,:age)";
            this.id = (int) con.createQuery(sql, true)
                    .addParameter("name", this.name)
                    .addParameter("password", this.password)
                    .addParameter("age", this.confirmPassword)
                    .executeUpdate()
                    .getKey();
        }

    }
    public static List<SignUp > all() {
        String sql = "SELECT * FROM endangered_animals";
        try (Connection con = DB.sql2o.open()) {
            return con.createQuery(sql).executeAndFetch(SignUp .class);
        }
    }

}
