package ch.hearc.ig.odi.testgit;

import java.util.ArrayList;
import java.util.List;

public class Enterprise {

    private String name;
    private List<Person> employees;

    public Enterprise(String name, List<Person> employees) {
        this.name = name;
        this.employees = employees;
    }

    public Enterprise() {
        this.employees = new ArrayList<Person>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Person> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Person> employees) {
        this.employees = employees;
    }
}
