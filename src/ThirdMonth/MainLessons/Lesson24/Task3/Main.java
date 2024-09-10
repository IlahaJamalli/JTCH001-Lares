package ThirdMonth.MainLessons.Lesson24.Task3;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        books.add(new Book("BAA", "ZDK"));
        books.add(new Book("BAA", "KFDJNF"));
        books.add(new Book("DSW", "MFDN"));
        books.add(new Book("ZAS", "SBDB"));
        books.add(new Book("CVD", "ADDS"));

        Collections.sort(books, new BookTitleAuthorComparator());

        for (Book book : books) {
            System.out.println(book);
        }
    }
}
