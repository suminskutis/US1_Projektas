package lt.asinica.entities;

import java.io.Serializable;

/**
 * Created by p998dzz on 2016.02.15.
 */
public class Person implements Serializable {
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
