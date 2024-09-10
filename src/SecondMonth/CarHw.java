package SecondMonth;

public class CarHw {
    String make;
    String model;
    int year;
    double mil;

    public CarHw(String make, String model, int year, double mil){
        this.make=make;
        this.model=model;
        this.year=year;
        this.mil=mil;
    }

    public void milCalculate(){
        System.out.println((mil*1.6) + "km");

    }
    public void carAge(){
        System.out.println(2024-year);
    }

    public static void main(String[] args) {

        CarHw car=new CarHw("Ford", "Fusion", 2019, 56200.5);
        System.out.println("Car1: ");
        System.out.println("Ford");
        System.out.println("Fusion");
        System.out.println("2019");
        System.out.println("56200.5");
        System.out.println();

        car.carAge();
        car.milCalculate();

    }
}
