package org.example;

import org.example.DAO.DoctorsDAO;
import org.example.DAO.PatientsDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;

@Service
public class HospitalServices {

    @Autowired
    private PatientsDAO patientsDAO;
    @Autowired
    private DoctorsDAO doctorsDAO;


    public void savePatient(Patients patient) throws SQLException {
        patientsDAO.insertPatients(patient);
    }

    public void saveDoctor(Doctors doctors) throws SQLException {
        doctorsDAO.insertDoctors(doctors);
    }
}