package org.example.DAO;

import org.example.Patients;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Time;

@Repository
public class PatientsDAO {

    @Autowired
    private Connection connection;

    public void insertPatients(Patients patient) throws SQLException {
        String query = "INSERT INTO patients(first_name, last_name, date_of_birth, gender, phone_number, email) VALUES (?,?,?,?,?,?)";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1, patient.getFirst_name());
        preparedStatement.setString(2, patient.getLast_name());
        preparedStatement.setDate(3, patient.getDate_of_birth());
        preparedStatement.setString(4, patient.getGender());
        preparedStatement.setString(5, patient.getPhone_number());
        preparedStatement.setString(6, patient.getEmail());
        preparedStatement.executeUpdate();
    }
}
