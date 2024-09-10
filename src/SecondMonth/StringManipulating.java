package SecondMonth;

import java.util.Arrays;
import java.util.Scanner;

public class StringManipulating {
    public static void main(String[] args) {
        String input="LTC Lab Java Backend Course";
        System.out.println(input);
        //int length = input.replace(" ", "").length();
        System.out.println(input.replace(" ", "").length());
        System.out.println(input.toUpperCase());
        System.out.println(input.toLowerCase());
        System.out.println(input.startsWith("A"));
        System.out.println(input.endsWith("Z"));
        System.out.println(input.replace("e", "E"));
        System.out.println(Arrays.toString(input.split(" ")));
        System.out.println(input.indexOf("o"));
        System.out.println(input.substring(5, 10));
        System.out.println(input.trim());

    }
}
