package ThirdMonth.MentorLessons.Lesson20;

import java.util.Scanner;

public class StringBuilderOperation {
    private static String reverseWords(String text) { // Hello my name is Ilaha
        String[] words = text.split(" ");
        StringBuilder reversed = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]);
            if (i != 0) {
                reversed.append(" ");
            }
        }
        return reversed.toString();
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        StringBuilder sentence = new StringBuilder(scan.nextLine());

        int uppercaseCount = 0;
        int lowercaseCount = 0;
        int digitCount = 0;
        int specialCharCount = 0;

        for (int i = 0; i < sentence.length(); i++) {
            char character = sentence.charAt(i);

            if (Character.isUpperCase(character)) {
                uppercaseCount++;
            }
            if (Character.isLowerCase(character)) {
                lowercaseCount++;
            }
            if (Character.isDigit(character)) {
                digitCount++;
            } else {
                specialCharCount++;
            }
        }
        System.out.println("uppercaseCount is " + uppercaseCount);
        System.out.println("lowercaseCount is " + lowercaseCount);
        System.out.println("digitCount is " + digitCount);
        System.out.println("specialCharCount is " + specialCharCount);
        System.out.println(reverseWords("Hello World"));
    }
}
