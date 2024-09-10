package SecondMonth;

public class Car extends VehicleClass {
int numDoors;

    public Car(String make, String model, int numDoors) {
        super(make, model);
        this.numDoors = numDoors;
    }
}
