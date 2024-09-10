package SecondMonth;

public class Animal {
    String name;
    int age;
    String sound;

    public Animal(String name, int age, String sound) {
        this.name = name;
        this.age = age;
        this.sound = sound;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }
    public void animalSound(){
        System.out.println("Sound of "+getName()+ " is "+ sound);
    }

    public static void main(String[] args) {
        Mammal leon=new Mammal("Leon", 17, "jgsl", "yellow");
        BirdClass eagle=new BirdClass("eagle", 5, "fmnj", 2);
        Aquatic dolphin=new Aquatic("dolphin", 7, "jhgf", 38);

        leon.giveBirth();
        leon.animalSound();
        System.out.println();

        eagle.fly();
        eagle.animalSound();
        System.out.println();

        dolphin.swim();
        dolphin.animalSound();
    }
}
