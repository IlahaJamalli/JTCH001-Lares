package SecondMonth;

public class Aquatic extends Animal{

    double swimmingDepth;

    public Aquatic(String name, int age, String sound, double swimmingDepth) {
        super(name, age, sound);
        this.swimmingDepth = swimmingDepth;
    }

    public double getSwimmingDepth() {
        return swimmingDepth;
    }

    public void setSwimmingDepth(double swimmingDepth) {
        this.swimmingDepth = swimmingDepth;
    }
    @Override
    public void animalSound() {
        super.animalSound();
    }
    public void swim(){
        System.out.println("Swimming depth of " + getName() + "is " + getSwimmingDepth());
    }
}
