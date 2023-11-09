import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;

public class FleetOfCars {
    private ArrayList<Car> cars = new ArrayList<>();

    public void addCar(Car car) {
        cars.add(car);
    }

    public int getTotalRegistrationFeeForFleet() {
        int totalFee = 0;

        for (Car car : cars) {
            totalFee += car.getRegistrationFee();
        }

        return totalFee;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Fleet of Cars:\n");

        for (Car car : cars) {
            sb.append(car.toString()).append("\n\n");
        }

        return sb.toString();
    }
}


