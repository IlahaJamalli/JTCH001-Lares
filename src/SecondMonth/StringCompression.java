package SecondMonth;

import java.util.Scanner;

public class StringCompression {

    public static void main(String[] args) {
        System.out.println("Give a string:  ");
        Scanner scan= new Scanner(System.in);
        String input= scan.nextLine();

        char[] charArray=input.toCharArray();
        int cnt=1;
        String str="";

        for (int i = 0; i < charArray.length-1; i++) {
            if(charArray[i]==charArray[i+1]){
                cnt++;
            } else{
                str+=charArray[i]+String.valueOf(cnt);
                cnt=1;
            }
        }

        str+=charArray[charArray.length-1]+String.valueOf(cnt);
        if(str.length()<input.length()){
            System.out.println(str);
        } else{
            System.out.println(input);
        }
    }
}
