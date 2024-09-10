package ThirdMonth.MentorLessons.Lesson20;

import java.util.Scanner;

public class CaesarCipher {

    public static String encript (String text, int key){
        StringBuilder stringBuilder=new StringBuilder();
        for (int i = 0; i < text.length(); i++) {

            char c=(char) (text.charAt(i)+ key);
            stringBuilder.append(c);
        }
        return stringBuilder.toString();
    }

    public static String decrypt (String encriptedText, int key) {
        return "";
    }

    public static void main(String[] args) {
        System.out.println(encript("A", 3));
    }
}
