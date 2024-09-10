package ThirdMonth.MentorLessons.Lesson25.Task1;

import java.util.Comparator;

public class Actor implements Comparator<Actor> {
    String name;
    int age;
    int actingSkill;

    public Actor(String name, int age, int actingSkill) {
        this.name = name;
        this.age = age;
        this.actingSkill = actingSkill;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getActingSkill() {
        return actingSkill;
    }

    @Override
    public String toString() {
        return "Actor{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", actingSkill='" + actingSkill + '\'' +
                '}';
    }

    @Override
    public int compare(Actor o1, Actor o2) {
        return o1.getActingSkill()-o2.getActingSkill();
    }
}
