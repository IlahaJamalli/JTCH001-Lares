package SecondMonth;

public class GroundVehicle extends Vehicle {
    int numWheels;
    String engineType;

    public GroundVehicle(String make, String model, int year, int topSpeed, int numWheels, String engineType) {
        super(make, model, year, topSpeed);
        this.numWheels = numWheels;
        this.engineType = engineType;
    }

    @Override
    public void accelerate() {
        super.accelerate();
        System.out.println("The car accelerates quickly.");
    }

    @Override
    public void brake() {
        super.brake();
        System.out.println("The car comes to a smooth stop.");
    }

    public void drive(){
        System.out.println(getModel() +" smoothly navigates the road.");
        System.out.println(getModel() +" weaves through traffic.");
    }
    public void park(){
        System.out.println( getModel() + " effortlessly parks in the spot.");
        System.out.println("The boat is securely docked at the pier.");
    }
}
