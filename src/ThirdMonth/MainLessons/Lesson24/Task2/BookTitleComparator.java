package ThirdMonth.MainLessons.Lesson24.Task2;
import java.util.*;

public class BookTitleComparator implements Comparator<Book>{


    @Override
    public int compare(Book o1, Book o2) {
        return o1.getAuthor().compareTo(o2.getAuthor());
    }
}
