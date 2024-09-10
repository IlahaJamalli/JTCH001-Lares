package ThirdMonth.MentorLessons.Lesson20;
import java.util.Scanner;
public class Ceaser {
    public static String encrypt(String text, int key){
        StringBuilder encryptedText = new StringBuilder();
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        for (char c : text.toLowerCase().toCharArray()) {
            if (Character.isLetter(c)) {
                int newIndex = alphabet.indexOf(c) + key;
                if (newIndex >= alphabet.length()) {
                    newIndex = newIndex - alphabet.length();
                }
                encryptedText.append(alphabet.toCharArray()[newIndex]);
            } else {
                encryptedText.append(c);
            }
        }

        return encryptedText.toString();
    }
    public static String decrypt(String encryptedText, int key) {
        StringBuilder decryptedText = new StringBuilder();
        String alphabet = "abcdefghijklmnopqrstuvwxyz";

        for (char c : encryptedText.toLowerCase().toCharArray()) {
            if (Character.isLetter(c)) {
                int newIndex = alphabet.indexOf(c) - key;
                if (newIndex < 0) {
                    newIndex = newIndex + alphabet.length();
                }
                decryptedText.append(alphabet.toCharArray()[newIndex]);
            } else {
                decryptedText.append(c);
            }
        }


        return decryptedText.toString();
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a text to encrypt : ");
        String text = scan.nextLine();
        System.out.println("Enter a key");
        int key = scan.nextInt();
        scan.nextLine();

        System.out.println(encrypt(text, key));
        System.out.println(decrypt(encrypt(text, key), key));

    }
}
