package SecondMonth;

public class WaterVehicle extends Vehicle{
    String hullType;
    int enginePower;

    public WaterVehicle(String make, String model, int year, int topSpeed, String hullType, int enginePower) {
        super(make, model, year, topSpeed);
        this.hullType = hullType;
        this.enginePower = enginePower;
    }

    @Override
    public void accelerate() {
        super.accelerate();
        System.out.println("The boat accelerates");
    }

    @Override
    public void brake() {
        super.brake();
        System.out.println("The boat slows down gradually.");
    }

    public void sail(){
        System.out.println("The boat cuts through the waves gracefully.");
        System.out.println("The sailboat catches the wind and glides across the water.");
    }
    public void dock(){
        System.out.println("The boat is secured at the dock.");
        System.out.println("The yacht is expertly maneuvered into the slip.");
    }
}
