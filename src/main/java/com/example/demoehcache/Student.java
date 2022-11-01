package com.example.demoehcache;

public class Student {
    private Integer id;
    private String lastname;
    private String firstname;
    private String level;
    private String gender;
    private String email;

    public Student(Integer id, String lastname, String firstname, String level, String gender, String email) {
        this.id = id;
        this.lastname = lastname;
        this.firstname = firstname;
        this.level = level;
        this.gender = gender;
        this.email = email;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Student [ " +
                "id=" + id +
                ", lastname='" + lastname + '\'' +
                ", firstname='" + firstname + '\'' +
                ", level='" + level + '\'' +
                ", gender='" + gender + '\'' +
                ", email='" + email + '\'' +
                ']';
    }
}
