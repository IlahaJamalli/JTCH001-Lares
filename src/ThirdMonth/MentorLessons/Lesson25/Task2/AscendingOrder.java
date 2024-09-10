package ThirdMonth.MentorLessons.Lesson25.Task2;

import java.util.Comparator;

class AscendingOrder implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        int gradeCompare = Integer.compare(o2.getGrade(), o1.getGrade());
        if (gradeCompare != 0) {
            return gradeCompare;
        } else {
            return Integer.compare(o1.getGrade(), o2.getGrade());
        }
    }
}
