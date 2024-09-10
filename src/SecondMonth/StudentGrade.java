package SecondMonth;

import java.util.Scanner;

public class StudentGrade {
    String name;
    int age;
    int grade;

    public void getGrade() {
        Scanner scan= new Scanner(System.in);
        System.out.println("Please enter your name: ");
        name= scan.next();
        System.out.println("Please enter your age: ");
        age=scan.nextInt();
        System.out.println("Please enter your grade: ");
        grade = scan.nextInt();


        System.out.println("Student name: "+name);
        System.out.println("Student age: "+age);
        System.out.println("Student grade: "+grade);

        if(grade<=100 && grade>=91){
            System.out.println("A");
        } else if(grade<=90 && grade>=81){
            System.out.println("B");
        } else if(grade<=80 && grade>=71){
            System.out.println("C");
        } else if (grade<=70 && grade>=61) {
            System.out.println("D");
        } else if (grade<=60 && grade>=0) {
            System.out.println("F");
        } else{
            System.out.println("ERROR");
        }

    }

    public static void main(String[] args) {
        StudentGrade student= new StudentGrade( );
        student.getGrade();
    }
}
