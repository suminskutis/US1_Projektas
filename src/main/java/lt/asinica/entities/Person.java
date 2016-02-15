package lt.asinica.entities;

import java.io.Serializable;

/**
 * Created by p998dzz on 2016.02.15.
 */
public class Person implements Serializable {
    private String email;
    private String pass;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
}
