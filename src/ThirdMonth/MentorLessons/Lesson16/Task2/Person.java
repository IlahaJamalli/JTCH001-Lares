package ThirdMonth.MentorLessons.Lesson16.Task2;

public class Person implements Swim, Walk {
    @Override
    public void swim() {
    System.out.println("People can swim");

    }

    @Override
    public void walk() {
        System.out.println("People can walk");
    }
}
