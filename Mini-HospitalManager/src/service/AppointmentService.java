package service;

import exception.DoctorUnavailableException;
import model.Appointment;
import model.Doctor;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
  Service métier pour les rendez-vous.
 */
public class AppointmentService {

    private List<Appointment> appointments = new ArrayList<>();

    public void createAppointment(Appointment appointment) throws DoctorUnavailableException {

        boolean conflict = appointments.stream()
                .anyMatch(a ->
                        a.getDoctor().getId() == appointment.getDoctor().getId()
                                && a.getDateTime().equals(appointment.getDateTime())
                );

        if (conflict) {
            throw new DoctorUnavailableException("Doctor not available at this time.");
        }

        appointments.add(appointment);
    }

    public List<Appointment> getAllAppointments() {
        return appointments;
    }
}
