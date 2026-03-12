package org.example;

import org.w3c.dom.Text;

import java.sql.Time;

public class Medical_records {

    private int patient_id;
    private int doctor_id;
    private Text diagnosis;
    private Text treatment;
    private Time created_at;

    public Medical_records(int patient_id, int doctor_id, Text diagnosis, Text treatment, Time created_at) {
        this.patient_id = patient_id;
        this.doctor_id = doctor_id;
        this.diagnosis = diagnosis;
        this.treatment = treatment;
        this.created_at = created_at;
    }

    public int getPatient_id() {
        return patient_id;
    }

    public void setPatient_id(int patient_id) {
        this.patient_id = patient_id;
    }

    public int getDoctor_id() {
        return doctor_id;
    }

    public void setDoctor_id(int doctor_id) {
        this.doctor_id = doctor_id;
    }

    public Text getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(Text diagnosis) {
        this.diagnosis = diagnosis;
    }

    public Text getTreatment() {
        return treatment;
    }

    public void setTreatment(Text treatment) {
        this.treatment = treatment;
    }

    public Time getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Time created_at) {
        this.created_at = created_at;
    }
}
