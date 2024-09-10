import java.util.Scanner;

public class Library {
    public static void main(String[] args) {
        System.out.println("How many books do you want to add? ");
        Scanner scan= new Scanner(System.in);
        int numberOfBooks= scan.nextInt();

        for (int i = 0; i < numberOfBooks; i++) {
            System.out.print(" Book name " + (i+1) + ": " );
            String bookName= scan.next();
            System.out.print(" Author name " + (i+1) + ": " );
            String authorName= scan.next();
            System.out.println(bookName);
            System.out.println(authorName);


//            for (int j = 0; j < numberOfBooks/2; j++) {
//
//                System.out.println(bookName);
//                System.out.println(authorName);
//            }
        }

    }
}
