package model;

/*
 Enum représentant les spécialités médicales.
 */
public enum Specialty {
    GENERAL(30),
    CARDIOLOGY(50),
    DERMATOLOGY(40),
    NEUROLOGY(60);

    private final double basePrice;

    Specialty(double basePrice) {
        this.basePrice = basePrice;
    }

    public double getBasePrice() {
        return basePrice;
    }
}
