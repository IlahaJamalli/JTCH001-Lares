package FirstMonth;

public class Student {
    //studentId, name, age, and grade.
    int studentId;
    String name;
    int age;
    int grade;

    public Student(int studentId, String name, int age, int grade) {
        this.studentId = studentId;
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
    public void displayInfo(){
        System.out.println(name+" "+ age+ " "+ grade);
    }
}
