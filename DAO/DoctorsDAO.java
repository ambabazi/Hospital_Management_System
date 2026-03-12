package org.example.DAO;

import org.example.Doctors;
import org.example.Patients;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@Repository
public class DoctorsDAO {
    @Autowired
private Connection connection;

    public void insertDoctors(Doctors doctors) throws SQLException {
        String query = "INSERT INTO doctors(first_name, last_name, specialty, phone_number, email) VALUES (?,?,?,?,?)";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1, doctors.getFirst_name());
        preparedStatement.setString(2, doctors.getLast_name());
        preparedStatement.setString(3, doctors.getSpecialty());
        preparedStatement.setString(4, doctors.getPhone_number());
        preparedStatement.setString(5, doctors.getEmail());
        preparedStatement.executeUpdate();
    }
}
