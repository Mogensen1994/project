
public class DieselCar extends AFuelCar {
    boolean hasParticulateFilter;

    public DieselCar(String registrationNumber, String make, String model, int numberOfDoors, int kmPrLitre, boolean hasParticulateFilter) {
        super(registrationNumber, make, model, numberOfDoors, kmPrLitre);
        this.hasParticulateFilter = hasParticulateFilter;
    }

    public int getRegistrationFee() {
        int baseFee = 0;

        if (kmPrLitre >= 20 && kmPrLitre <= 50) {
            baseFee = 330 + 130;
        } else if (kmPrLitre >= 15 && kmPrLitre <= 20) {
            baseFee = 1050 + 1390;
        } else if (kmPrLitre >= 10 && kmPrLitre < 15) {
            baseFee = 2340 + 1850;
        } else if (kmPrLitre >= 5 && kmPrLitre < 10) {
            baseFee = 5500 + 2770;
        } else {
            baseFee = 10470 + 15260;
        }

        if (!hasParticulateFilter) {
            baseFee += 1000;
        }

        return baseFee;

    }

    @Override
    public String getFuelType() {
        return "Diesel";
    }

    @Override
    public String toString() {
        return super.toString() + "\nhasParticulateFilter :" + hasParticulateFilter;

    }
}


