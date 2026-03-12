package org.example;

import org.example.Config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.sql.Date;
import java.sql.SQLException;
import java.sql.Time;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main(String[] args) throws SQLException {


        Patients patient = new Patients("Agnes", "Mbabazi", Date.valueOf("2000-11-11"), "female", "078965492", "ambg@gmail.com");

        ApplicationContext myContext = new AnnotationConfigApplicationContext(AppConfig.class);

        HospitalServices service = myContext.getBean(HospitalServices.class);
                service.savePatient(patient);
    }
}
