package SecondMonth;

public class Mammal extends Animal {
    String furColor;

    public Mammal(String name, int age, String sound, String furColor) {
        super(name, age, sound);
        this.furColor = furColor;
    }

    public String getFurColor() {
        return furColor;
    }

    public void setFurColor(String furColor) {
        this.furColor = furColor;
    }

    @Override
    public void animalSound() {
        super.animalSound();
    }

    public void giveBirth(){

        System.out.println(getName()+ " gives a birth");

    }

}
