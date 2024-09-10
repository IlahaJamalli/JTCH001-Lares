package ThirdMonth.MentorLessons.Lesson23.Task2;

import java.util.ArrayList;
import java.util.List;

public class Playlist<T extends Playable> {
    List<T> lists = new ArrayList<>();

    public void addToList(T playable) {
        lists.add(playable);
    }

    public void printDetails() {
        for (T list : lists) {
            System.out.println(list.getDetails());
        }
    }
}
