package SecondMonth;

public class Vehicle {
    //make, model, year, topSpeed
    String make;
    String model;
    int year;
    int topSpeed;

    public Vehicle(String model, String make , int year, int topSpeed) {
        this.model = model;
        this.make = make;
        this.year = year;
        this.topSpeed = topSpeed;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public void accelerate(){
        //System.out.println(getModel() + " " + getMake()+  " accelerates.");
    }
    public void brake(){
        //System.out.println(getModel()+ " " + getMake()+ " brakes.");
    }

    public static void main(String[] args) {
        GroundVehicle car=new GroundVehicle("Porsche", "Panamera", 2022, 168 , 4, "V8 Engines");
        AirVehicle plane=new AirVehicle("Boeing", "747", 2018, 900, 68, 50000);
        WaterVehicle boat = new WaterVehicle("Yamaha", "242X", 2021, 50, "Fiberglass", 360);

        System.out.println();
        car.accelerate();
        car.brake();
        car.drive();
        car.park();
        System.out.println();

        plane.accelerate();
        plane.brake();
        plane.land();
        plane.takeOff();
        System.out.println();

        boat.accelerate();
        boat.brake();
        boat.dock();
        boat.sail();

    }

}
