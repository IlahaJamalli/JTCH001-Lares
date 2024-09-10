package SecondMonth;

class VehicleClass {
    String make;
    String model;

    public VehicleClass(String make, String model) {
        this.make = make;
        this.model = model;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
    public void display(){
        System.out.println("Make: "+ make+" Model: "+ model);
    }

    public static void main(String[] args) {
        Car car=new Car("Porsche", "Panamera", 4);
        Bike bike=new Bike("Yamaha", "YZF-R3", 2);
        car.display();
        bike.display();
    }
}