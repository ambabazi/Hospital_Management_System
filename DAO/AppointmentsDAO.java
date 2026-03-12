package org.example.DAO;


import org.example.Appointments;
import org.example.Doctors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@Repository
public class AppointmentsDAO {

    @Autowired
    private Connection connection;

    public void insertAppointments(Appointments appointment) throws SQLException {
        String query = "INSERT INTO appointments(doctor_id, patient_id, appointment_date, status) VALUES (?,?,?,?)";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setInt(1, appointment.getDoctor_id());
        preparedStatement.setInt(2, appointment.getPatient_id());
        preparedStatement.setDate(3, appointment.getAppointment_date());
        preparedStatement.setString(4, appointment.getStatus());
        preparedStatement.executeUpdate();
    }

}
