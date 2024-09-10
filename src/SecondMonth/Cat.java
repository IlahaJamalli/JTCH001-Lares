package SecondMonth;

public class Cat extends Pet {
    String furColor;

    public Cat(String name, int age, int weight, String furColor) {
        super(name, age, weight);
        this.furColor = furColor;
    }

    public void meow(){
        System.out.println(getName() + " is meowing.");
    }

    @Override
    public void makeSound() {
        meow();
    }
}
