package newtest.newton.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class vanpool_user {

    @Id
    @GeneratedValue
    @Column(name = "User_id")
    private Integer id;
    @Column(name = "User_FirstName")
    private String User_FirstName;
    @Column(name = "User_LastName")
    private String User_LastName;
    @Column(name = "User_Email")
    private String User_Email;
    @Column(name = "User_ZipCode")
    private String User_ZipCode;
    @Column(name = "User_Phone")
    private String User_Phone;
    @Column(name = "User_Sex")
    private String User_Sex;
    @Column(name = "Date_Created")
    private String Date_Created;
    @Column(name = "User_Adress_street")
    private String User_Adress_street;
    @Column(name = "User_Adress_city")
    private String User_Adress_city;
    @Column(name = "User_Adress_state")
    private String User_Adress_state;
    @Column(name = "User_BirthDate")
    private String User_BirthDate;

    public vanpool_user() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUser_FirstName() {
        return User_FirstName;
    }

    public void setUser_FirstName(String user_FirstName) {
        User_FirstName = user_FirstName;
    }

    public String getUser_LastName() {
        return User_LastName;
    }

    public void setUser_LastName(String user_LastName) {
        User_LastName = user_LastName;
    }

    public String getUser_Email() {
        return User_Email;
    }

    public void setUser_Email(String user_Email) {
        User_Email = user_Email;
    }

    public String getUser_ZipCode() {
        return User_ZipCode;
    }

    public void setUser_ZipCode(String user_ZipCode) {
        User_ZipCode = user_ZipCode;
    }

    public String getUser_PhoneNumber() {
        return User_Phone;
    }

    public void setUser_PhoneNumber(String user_Phone) {
        User_Phone = user_Phone;
    }

    public String getUser_Sex() {
        return User_Sex;
    }

    public void setUser_Sex(String user_Sex) {
        User_Sex = user_Sex;
    }

    public String getDate_Created() {
        return Date_Created;
    }

    public void setDate_Created(String date_Created) {
        Date_Created = date_Created;
    }

    public String getUser_Adress_street() {
        return User_Adress_street;
    }

    public void setUser_Adress_street(String user_Adress_street) {
        User_Adress_street = user_Adress_street;
    }

    public String getUser_Adress_city() {
        return User_Adress_city;
    }

    public void setUser_Adress_city(String user_Adress_city) {
        User_Adress_city = user_Adress_city;
    }

    public String getUser_Adress_state() {
        return User_Adress_state;
    }

    public void setUser_Adress_state(String user_Adress_state) {
        User_Adress_state = user_Adress_state;
    }

    public String getUser_BirthDate() {
        return User_BirthDate;
    }

    public void setUser_BirthDate(String user_BirthDate) {
        User_BirthDate = user_BirthDate;
    }
}
