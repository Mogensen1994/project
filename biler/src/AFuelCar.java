

public abstract class AFuelCar extends ACar {
    protected int kmPrLitre;

    public AFuelCar(String registrationNumber, String make, String model, int numberOfDoors, int kmPrLitre) {
        super(registrationNumber, make, model, numberOfDoors);
        this.kmPrLitre = kmPrLitre;
    }

    public int getKmPrLitre() {
        return kmPrLitre;
    }

    public abstract String getFuelType();

    public String toString() {
        return super.toString() + "\nkmPrLitre :" + kmPrLitre + "\nFuelType :" + getFuelType();
    }
}