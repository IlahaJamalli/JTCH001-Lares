package SecondMonth;

public class Dog extends Pet {
    String breed;

    public Dog(String name, int age, int weight, String breed) {
        super(name, age, weight);
        this.breed = breed;
    }

    public void bark(){
        System.out.println(getName() + " is barking.");
    }

    @Override
    public void makeSound() {
        bark();
    }
}
