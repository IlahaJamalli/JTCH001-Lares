package FirstMonth;

import java.util.Scanner;

public class StudentApp {
    public static void main(String[] args) {
        Student[] students=new Student[10];
        int cnt=0;
        Scanner scan=new Scanner(System.in);
        System.out.println("1 for adding, 2 for student details by ID, 3 for updating student details by ID, 4 for exiting program");
        while (true){
            int choice= scan.nextInt();
            if(choice==1){
                System.out.println("Add Student Id: ");
                int studentId = scan.nextInt();
                System.out.println("Add name: ");
                String name= scan.next();
                System.out.println("Add age: ");
                int age= scan.nextInt();
                System.out.println("Add grade: ");
                int grade= scan.nextInt();
                Student student=new Student(studentId, name, age, grade);
                students[cnt]=student;
                cnt++;
            } else if (choice==2) {
                int id= scan.nextInt();
                for (int i = 0; i < cnt; i++) {
                    if(students[i].getStudentId()==id){
                        students[i].displayInfo();
                    }
                }
            } else if (choice==3) {
                int id= scan.nextInt();
                for (int i = 0; i < cnt; i++) {
                    if(students[i].getStudentId()==id){
                        
                    }
                }
            }
        }

    }


}
