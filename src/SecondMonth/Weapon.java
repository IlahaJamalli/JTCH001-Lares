package SecondMonth;

public class Weapon {

    public void attack(){
        System.out.println("Performing a basic attack.");
    }

    public void attack(int damage){
        System.out.println("Performing a regular attack with damage: " + damage );
    }

    public void attack(double criticalMultiplier){
    System.out.println("Performing a critical attack with a damage multiplier of: " + criticalMultiplier );
    }

    public void attack(String specialMove){
        System.out.println("Performing a special attack: " + specialMove);
    }

    public static void main(String[] args) {
        Weapon sword=new Weapon();
        Weapon bow=new Weapon();

        System.out.println("Sword attacks:");
        sword.attack();
        sword.attack(50);
        sword.attack(2.5);
        sword.attack("Slash");
        System.out.println();
        System.out.println("Bow attacks:");
        bow.attack();
        bow.attack(30);
        bow.attack(3.0);
        bow.attack("Arrow Storm");


    }
}
