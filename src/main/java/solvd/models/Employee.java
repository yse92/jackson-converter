package solvd.models;

import java.lang.reflect.Field;

public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private String position;
    private float salary;

    public Employee(int id, String firstName, String lastName, String position, float salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
        this.salary = salary;
    }

    public Employee() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        Field[] fields = this.getClass().getDeclaredFields();
        String res = "{";
        try {
            for (Field field : fields) {
                res += field.getName() + " : " + field.get(this) + ", ";
            }
            res += "}";
        } catch (Exception e) {
            e.printStackTrace();
        }
        return res;
    }
}
