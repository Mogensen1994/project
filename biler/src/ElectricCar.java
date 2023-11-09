public class ElectricCar extends ACar {
    private int batteryCapacityKWh;
    private int maxRangeKm;
    private int whPerKm;

    public ElectricCar(String registrationNumber, String make, String model, int numberOfDoors, int batteryCapacityKWh, int maxRangeKm, int whPerKm) {
        super(registrationNumber, make, model, numberOfDoors);
        this.batteryCapacityKWh = batteryCapacityKWh;
        this.maxRangeKm = maxRangeKm;
        this.whPerKm = whPerKm;
    }

    public int getBatteryCapacityKWh() {
        return batteryCapacityKWh;
    }

    public int getMaxRangeKm() {
        return maxRangeKm;
    }

    public int getWhPerKm() {
        return whPerKm;
    }

    public double getKmPrLitre() {
        double kmPerLitre = 100 / (whPerKm / 91.25);
        return kmPerLitre;
    }


    public int getRegistrationFee() {
        int baseFee = 0;

        if (getKmPrLitre() >= 20 && getKmPrLitre() <= 50) {
            baseFee = 330;
        } else if (getKmPrLitre() >= 15 && getKmPrLitre() <= 20) {
            baseFee = 1050;
        } else if (getKmPrLitre() >= 10 && getKmPrLitre() < 15) {
            baseFee = 2340;
        } else if (getKmPrLitre() >= 5 && getKmPrLitre() < 10) {
            baseFee = 5500;
        } else if (getKmPrLitre() < 5 && getKmPrLitre() > 0) {
            baseFee = 10470;
        }

        return baseFee;
    }

    @Override
    public String toString() {
        return super.toString()+ "BatteryCapacityKWh :" + getBatteryCapacityKWh()+ "\n"+ "MaxRangeKm :" + getMaxRangeKm()+"\n" +"WhPerKm :" + getWhPerKm();
    }
}

