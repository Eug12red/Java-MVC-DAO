package model;

import java.time.LocalDate;

/*
 Représente un patient de l'hôpital.
 */
public class Patient {

    private int id;
    private String name;
    private String email;
    private String phone;
    private LocalDate birthDate;

    public Patient(int id, String name, String email, String phone, LocalDate birthDate) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.birthDate = birthDate;
    }

    public Patient(String name, String email, String phone, LocalDate birthDate) {
        this(0, name, email, phone, birthDate);
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public String getEmail() { return email; }
    public String getPhone() { return phone; }
    public LocalDate getBirthDate() { return birthDate; }
}
