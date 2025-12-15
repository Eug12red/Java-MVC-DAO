package dao;

import model.Patient;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Implémentation JDBC du DAO Patient.
 */
public class PatientDAOImpl implements PatientDAO {

    @Override
    public void save(Patient patient) {
        String sql = "INSERT INTO patients(name, email, phone, birthdate) VALUES (?, ?, ?, ?)";

        try (Connection c = DatabaseConnection.getConnection();
             PreparedStatement ps = c.prepareStatement(sql)) {

            ps.setString(1, patient.getName());
            ps.setString(2, patient.getEmail());
            ps.setString(3, patient.getPhone());
            ps.setString(4, patient.getBirthDate().toString());
            ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Patient> findAll() {
        List<Patient> patients = new ArrayList<>();
        String sql = "SELECT * FROM patients";

        try (Connection c = DatabaseConnection.getConnection();
             Statement st = c.createStatement();
             ResultSet rs = st.executeQuery(sql)) {

            while (rs.next()) {
                patients.add(new Patient(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("email"),
                        rs.getString("phone"),
                        LocalDate.parse(rs.getString("birthdate"))
                ));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return patients;
    }
}
