package SecondMonth;

import java.util.Scanner;

public class EmployeeApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Choose 1 for adding 2 for total employees 3 for total salary 4 for exiting program");

        while(true){
            System.out.println("Please enter your choice: ");
            int choice= scan.nextInt();
            if(choice==1){
                System.out.println("Add Employee Id: ");
                int employeeId= scan.nextInt();
                System.out.println("Enter name: ");
                String name= scan.next();
                System.out.println("Add salary: ");
                double salary= scan.nextDouble();
                Employee employee=new Employee(employeeId, name, salary);
                System.out.println("Employee added");
            } else if (choice==2) {
                System.out.println(Employee.getTotalEmployees());
            } else if (choice==3) {
                System.out.println(Employee.getTotalSalary());
            } else if(choice==4){
                System.out.println("Exiting"); break;
            } else {
                System.out.println(" Invalid choice");
            }
        }

    }
}
