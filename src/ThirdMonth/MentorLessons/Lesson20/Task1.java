package ThirdMonth.MentorLessons.Lesson20;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        StringBuilder sentence= new StringBuilder(scan.nextLine());

        for (int i = 0; i < sentence.length(); i++) {
            if(sentence.charAt(i)=='a'){
                sentence.setCharAt(i, 'e');
            }
        }System.out.println(sentence.toString());


        StringBuilder sentence2=sentence.reverse();
        System.out.println(sentence2);
        System.out.println(sentence.append(sentence2));
    }

}
