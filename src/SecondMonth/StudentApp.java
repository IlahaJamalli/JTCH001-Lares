package SecondMonth;

import java.util.Scanner;

public class StudentApp {
    public static void main(String[] args) {
        Student[] students = new Student[10];
        int count = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("1 for adding, 2 for student details by ID, 3 for updating student details by ID, 4 for exiting program");
        while (true) {
            System.out.println("Enter your choice: ");
            int choice = scan.nextInt();
            if (choice == 1) {
                System.out.println("Add Student Id: ");
                int studentId = scan.nextInt();
                System.out.println("Enter name: ");
                String name = scan.next();
                System.out.println("Enter age: ");
                int age = scan.nextInt();
                System.out.println("Enter grade: ");
                int grade = scan.nextInt();
                Student student = new Student(studentId, name, age, grade);
                students[count] = student;
                count++;

            } else if (choice == 2) {
                System.out.print("Enter Student ID to view details: ");
                int id= scan.nextInt();
                for (int i = 0; i < count; i++) {
                    if(students[i].getStudentId()==id){
                        students[i].displayDetails();
                    }
                }
            } else if (choice==3) {
                System.out.print("Enter Student ID to update details: ");
                int id= scan.nextInt();
                for (int i = 0; i < count; i++) {
                    if(students[i].getStudentId()==id){
                        System.out.println("Enter new name: ");
                        String name= scan.next();
                        System.out.println("Enter new age: ");
                        int age= scan.nextInt();
                        System.out.println("Enter grade");
                        int grade= scan.nextInt();

                    students[i].setName(name);
                    students[i].setAge(age);
                    students[i].setGrade(grade);
                        System.out.println(name);
                        System.out.println(age);
                        System.out.println(grade);
                    }
                }
        } else if (choice == 4) {
                System.out.println("Exiting the program.");
                break;
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
    }
    }
}
