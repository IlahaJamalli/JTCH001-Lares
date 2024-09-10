package ThirdMonth.MainLessons.Lesson24.Task1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Book implements Comparable<Book>{
        String title;
        String author;
        int yearPublished;

    public Book(String title, String author, int yearPublished) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
    }

    @Override
    public int compareTo(Book o) {
        return Integer.compare(this.yearPublished, o.yearPublished);

    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", yearPublished=" + yearPublished +
                '}';
    }

    public static void main(String[] args) {
        List<Book> books=new ArrayList<>();
        books.add(new Book("Book A", "Author A", 2015));
        books.add(new Book("Book B", "Author B", 2018));
        books.add(new Book("Book C", "Author C", 2012));
        books.add(new Book("Book D", "Author D", 2020));
        books.add(new Book("Book E", "Author E", 2016));

        for (Book book: books){
            System.out.println(book);
        }
        System.out.println();
        Collections.sort(books);
        for (Book book: books){
            System.out.println(book);
        }

    }
}
