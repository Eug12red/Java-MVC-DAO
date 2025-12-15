package controller;

import dao.PatientDAO;
import dao.PatientDAOImpl;
import model.Patient;

import java.time.LocalDate;
import java.util.List;

/**
 * Contrôleur pour les patients.
 */
public class PatientController {

    private PatientDAO patientDAO = new PatientDAOImpl();

    public void createPatient(String name, String email, String phone, LocalDate birthDate) {
        Patient patient = new Patient(name, email, phone, birthDate);
        patientDAO.save(patient);
    }

    public List<Patient> getAllPatients() {
        return patientDAO.findAll();
    }
}
