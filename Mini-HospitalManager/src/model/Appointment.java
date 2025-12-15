package model;

import java.time.LocalDateTime;

/*
 Représente un rendez-vous médical.
 */
public class Appointment {

    private int id;
    private Patient patient;
    private Doctor doctor;
    private LocalDateTime dateTime;

    public Appointment(int id, Patient patient, Doctor doctor, LocalDateTime dateTime) {
        this.id = id;
        this.patient = patient;
        this.doctor = doctor;
        this.dateTime = dateTime;
    }

    public Appointment(Patient patient, Doctor doctor, LocalDateTime dateTime) {
        this(0, patient, doctor, dateTime);
    }

    public int getId() { return id; }
    public Patient getPatient() { return patient; }
    public Doctor getDoctor() { return doctor; }
    public LocalDateTime getDateTime() { return dateTime; }
}
