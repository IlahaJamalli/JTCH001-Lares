package ThirdMonth.MentorLessons.Lesson25.Task1;

import java.util.Comparator;

public class Role implements Comparator<Role> {
    String name;
    int minAge;
    int maxAge;

    public Role(String name, int minAge, int maxAge) {
        this.name = name;
        this.minAge = minAge;
        this.maxAge = maxAge;
    }

    public String getName() {
        return name;
    }

    public int getMinAge() {
        return minAge;
    }

    public int getMaxAge() {
        return maxAge;
    }

    @Override
    public String toString() {
        return "Role{" +
                "name='" + name + '\'' +
                ", minAge=" + minAge +
                ", maxAge=" + maxAge +
                '}';
    }


    @Override
    public int compare(Role o1, Role o2) {
        return o1.getMinAge()-o2.getMinAge();
    }
}
