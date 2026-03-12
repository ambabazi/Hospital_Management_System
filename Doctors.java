package org.example;

import java.sql.Time;

public class Doctors {

    private String first_name;
    private String last_name;
    private String speciality;
    private String phone_number;
    private String email;
    private Time created_at;

    public Doctors(String first_name, String last_name, String speciality, String phone_number, String email, Time created_at) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.speciality = speciality;
        this.phone_number = phone_number;
        this.email = email;
        this.created_at = created_at;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Time getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Time created_at) {
        this.created_at = created_at;
    }
}
