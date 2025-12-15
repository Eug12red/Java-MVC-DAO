package model;

/*
  Représente un médecin.
 */
public class Doctor {

    private int id;
    private String name;
    private Specialty specialty;

    public Doctor(int id, String name, Specialty specialty) {
        this.id = id;
        this.name = name;
        this.specialty = specialty;
    }

    public Doctor(String name, Specialty specialty) {
        this(0, name, specialty);
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public Specialty getSpecialty() { return specialty; }
}
