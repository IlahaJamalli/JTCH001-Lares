public class Car {
    public static void main(String[] args) {
        String[][] car=new String[3][2];

        car[0][0]="Porsche";
        car[0][1]="2020";

        car[1][0]="BMW";
        car[1][1]="2021";

        car[2][0]="Audi";
        car[2][1]="2023";


        for (int i = 0; i < car.length; i++) {
            System.out.println("Parking Space " + (i + 1) + ": CAR: " + car[i][0] + ", Year: " + car[i][1]);
        }
        // 00 01
        // 10 11
        // 20 21


    }
}
