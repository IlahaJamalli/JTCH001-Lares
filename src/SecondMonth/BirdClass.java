package SecondMonth;

public class BirdClass extends Animal{
    double wingSpan;

    public BirdClass(String name, int age, String sound, double wingSpan) {
        super(name, age, sound);
        this.wingSpan = wingSpan;
    }

    public double getWingSpan() {
        return wingSpan;
    }

    public void setWingSpan(double wingSpan) {
        this.wingSpan = wingSpan;
    }
    @Override
    public void animalSound() {
        System.out.println(sound);
    }
    public void fly(){
        System.out.println("Wingspan of " + getName() + "is "+ getWingSpan());
    }
}
