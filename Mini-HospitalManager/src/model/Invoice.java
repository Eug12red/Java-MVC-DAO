package model;

/*
  Représente une facture médicale.
 */
public class Invoice {

    private int id;
    private Appointment appointment;
    private double amount;

    public Invoice(Appointment appointment) {
        this.appointment = appointment;
        this.amount = appointment.getDoctor()
                .getSpecialty()
                .getBasePrice();
    }

    public double getAmount() {
        return amount;
    }
}
