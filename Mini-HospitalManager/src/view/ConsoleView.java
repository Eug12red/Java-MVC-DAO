package view;

import model.Patient;
import java.util.List;

/*
 Vue console (I/O utilisateur).
 */
public class ConsoleView {

    public void displayPatients(List<Patient> patients) {
        patients.forEach(p ->
                System.out.println(p.getName() + " | " + p.getEmail())
        );
    }

    public void showMessage(String message) {
        System.out.println(message);
    }
}
