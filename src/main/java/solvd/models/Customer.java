package solvd.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import solvd.util.CustomDateSerializer;
import solvd.util.CustomJsonDateDeserializer;

import java.lang.reflect.Field;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Customer {
    private int id;
    private String firstName;
    private String lastName;
    private String phone;
    @JsonDeserialize(using = CustomJsonDateDeserializer.class)
    @JsonSerialize(using = CustomDateSerializer.class)
    private Date dateOfBirth;
    private Login login;

    public Customer(int id, String firstName, String lastName, String phone, Date dateOfBirth, Login login) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.login = login;
        this.dateOfBirth = dateOfBirth;
    }

    public Customer() {

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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Login getLogin() {
        return login;
    }

    public void setLogin(Login login) {
        this.login = login;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    @JsonDeserialize(using = CustomJsonDateDeserializer.class)
    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        Field[] fields = this.getClass().getDeclaredFields();
        String res = "{";
        SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");
        try {
            for (Field field : fields) {
                if (field.getName().equals("dateOfBirth")) {
                    res += field.getName() + " : " + df.format(field.get(this)) + ", ";
                } else {
                    res += field.getName() + " : " + field.get(this) + ", ";
                }
            }
            res += "}";
        } catch (Exception e) {
            e.printStackTrace();
        }
        return res;
    }
}
