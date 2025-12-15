package dao;

import model.Patient;
import java.util.List;

/*
  Interface DAO pour les patients.
 */
public interface PatientDAO {
    void save(Patient patient);
    List<Patient> findAll();
}
