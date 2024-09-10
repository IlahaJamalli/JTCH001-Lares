package ThirdMonth.MainLessons.Lesson24.Task3;

import java.util.Comparator;

public class BookTitleAuthorComparator implements Comparator<Book> {
    @Override
    public int compare(Book b1, Book b2) {
        int titleCompare = b1.getTitle().compareTo(b2.getTitle());
        if (titleCompare != 0) {
            return titleCompare;
        }
        return b1.getAuthor().compareTo(b2.getAuthor());
    }
    }

