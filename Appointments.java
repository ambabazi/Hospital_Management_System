package org.example;

import java.sql.Time;

public class Appointments {

    private int doctor_id;
    private int patient_id;
    private Time appointment_date;
    private String status;
    private Time created_at;

    public Appointments(int doctor_id, int patient_id, Time appointment_date, String status, Time created_at) {
        this.doctor_id = doctor_id;
        this.patient_id = patient_id;
        this.appointment_date = appointment_date;
        this.status = status;
        this.created_at = created_at;
    }

    public int getDoctor_id() {
        return doctor_id;
    }

    public void setDoctor_id(int doctor_id) {
        this.doctor_id = doctor_id;
    }

    public int getPatient_id() {
        return patient_id;
    }

    public void setPatient_id(int patient_id) {
        this.patient_id = patient_id;
    }

    public Time getAppointment_date() {
        return appointment_date;
    }

    public void setAppointment_date(Time appointment_date) {
        this.appointment_date = appointment_date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Time getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Time created_at) {
        this.created_at = created_at;
    }
}
