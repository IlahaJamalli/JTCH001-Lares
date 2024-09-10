package ThirdMonth.MentorLessons.Lesson21.Task1;

public class BookStoreApp {
    public static void main(String[] args) {
        BookStore bookStore=new BookStore();
        bookStore.addBooks(new Book("1984", "George Orwell", BookCategory.FICTION, 10.4));
        bookStore.addBooks(new Book("The Name of the Wind", "Patrick Rothfuss", BookCategory.FANTASY, 12.6));

        bookStore.listBook();
        System.out.println();
        System.out.println("Searching for Science books:");
        bookStore.findBook(BookCategory.FANTASY);

    }
}
