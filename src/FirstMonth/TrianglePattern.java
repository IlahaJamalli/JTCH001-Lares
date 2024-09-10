package FirstMonth;

public class TrianglePattern {
    public static void main(String[] args) {

        for(int i=0; i<=4; i++){

            for (int j = 0; j <=i ; j++) {
                System.out.print("  ");
            }

            for (int k = i; k<=4; k++) {
                System.out.print("* ");
            }

            for (int m = i; m<4; m++) {
                System.out.print("* ");
            }

            System.out.println();
        }
//        for(int i=0; i<=4; i++){
//
//            for (int j = 0; j <=i ; j++) {
//                System.out.print("  ");
//            }
//
//            for (int k = i; k<=4; k++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

   }
}
