import controller.PatientController;
import view.ConsoleView;

import java.time.LocalDate;

/**
  Point d'entrée de l'application.
 */
public class Main {

    public static void main(String[] args) {

        PatientController controller = new PatientController();
        ConsoleView view = new ConsoleView();

        controller.createPatient(
                "John Doe",
                "john@mail.com",
                "0470000000",
                LocalDate.of(1995, 5, 12)
        );

        view.displayPatients(controller.getAllPatients());
    }
}
