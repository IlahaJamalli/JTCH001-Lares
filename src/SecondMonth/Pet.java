package SecondMonth;

public class Pet {
    String name;
    int age;
    int weight;

    public Pet(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getWeight() {
        return weight;
    }

    public void eat(){
        System.out.println(getName()+ " is eating.");
    }
    public void sleep(){
        System.out.println(getName()+ " is sleeping.");
    }
    public void makeSound(){
        System.out.println(getName()+ " is making sound.");
    }

    public static void main(String[] args) {
        Dog dog=new Dog("Lucky", 5, 15, "Golden Retriever");
        Cat cat=new Cat("Luna", 4, 7, "yellow");
        Bird bird=new Bird("Pigeon", 3, 1,12);

        dog.bark();
        dog.eat();
        cat.meow();
        cat.eat();
        bird.fly();
        bird.chirp();
    }
}
