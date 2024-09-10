package SecondMonth;

public class AirVehicle extends Vehicle {

    int wingspan;
    int enginePower;

    public AirVehicle(String make, String model, int year, int topSpeed, int wingspan, int enginePower) {
        super(make, model, year, topSpeed);
        this.wingspan = wingspan;
        this.enginePower = enginePower;
    }

    @Override
    public void accelerate() {
        super.accelerate();
        System.out.println("The plane takes off with a powerful thrust.");
    }

    @Override
    public void brake() {
        super.brake();
        System.out.println("The plane brakes");
    }

    public void takeOff(){
        System.out.println("The plane gracefully lifts off the runway.");
        System.out.println( "The helicopter hovers and ascends.");
    }

    public void land(){
        System.out.println("The plane touches down on the runway.");
        System.out.println("The helicopter gently settles on the helipad.");
    }
}
