package ThirdMonth.MentorLessons.Lesson25.Task2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students=new ArrayList<>();
        students.add(new Student("Jala", 85));
        students.add(new Student("Laman", 90));
        students.add(new Student("Ugur", 85));
        students.add(new Student("Ilaha", 95));
        students.add(new Student("Elmin", 70));

        Collections.sort(students);
        System.out.print(students);
        System.out.println();
        Collections.sort(students, new DescendingOrder());
        System.out.print(students);
        System.out.println();
        Collections.sort(students, new AscendingOrder());
        System.out.print(students);
        System.out.println();
    }
}
