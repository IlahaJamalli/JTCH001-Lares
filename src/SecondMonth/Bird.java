package SecondMonth;

public class Bird extends Pet{

    int wingspan;

    public Bird(String name, int age, int weight, int wingspan) {
        super(name, age, weight);
        this.wingspan = wingspan;
    }

    public void fly(){
        System.out.println(getName() + " is flying.");
    }

    public void  chirp(){
        System.out.println(getName() + " is chirping.");
    }

    @Override
    public void makeSound() {
        chirp();
    }
}
