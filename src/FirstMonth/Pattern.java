package FirstMonth;

public class Pattern {
    public static void main(String[] args) {
//        for (int i = 0; i <= 4; i++) {
//
//            for (int j = 4; j >=i; j--) {
//                System.out.print("*");
//            }
//
//            for (int k = 0; k <= 2*i; k++) {
//                System.out.print(" ");
//            }
//
//            System.out.println();
//        }
        for(int i=1; i<=5; i++){ //rows
            for(int j=i; j<=5; j++ ){ //columns
                System.out.print("  ");
            }
            for(int k=1; k<i; k++ ){ //columns
                System.out.print("* ");
            }
            for(int m=1; m<=i; m++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}