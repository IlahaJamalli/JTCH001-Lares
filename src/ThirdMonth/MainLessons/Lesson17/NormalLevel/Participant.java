package ThirdMonth.MainLessons.Lesson17.NormalLevel;
import java.io.*;
import java.util.Scanner;

public class Participant {
    String name;
    int age;
    String email;
    public void displayParticipants(){
        try {
            FileReader fileReader=new FileReader("participants.txt");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }

    public static void main(String[] args) {

    }
}
