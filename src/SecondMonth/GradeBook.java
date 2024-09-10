package SecondMonth;

public class GradeBook {
    StudentClass[] student;
    int studentNum;

    public void addStudent(int studentId, String name){
        if(studentNum<student.length){
            studentNum++;
            System.out.println("New student added!");
        }  else {
            System.out.println("You can not add new student");
        }
    }
    public void removeStudent(int studentId, String name){

    }
}
