package SecondMonth;

import java.util.Arrays;

public class Library {
    String libraryName;
    String address;
    Book[] books;
    int bookCount;


    public Library(String libraryName, String address) {
        this.libraryName = libraryName;
        this.address = address;
        this.books = new Book[10];
        this.bookCount=0;
    }

    public String getLibraryName() {
        return libraryName;
    }

    public void setLibraryName(String libraryName) {
        this.libraryName = libraryName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Book[] getBook() {
        return books;
    }

    public void setBook(Book[] book) {
        this.books = books;
    }
    public void addBook(Book book){
        if(bookCount<books.length){
            books[bookCount]=book;
            bookCount++;
        } else {
            System.out.println("Library is full");
        }
}
    public void removeBook(String isbn) {
        for (int i = 0; i < bookCount; i++) {
            if (books[i].getIsbn().equals(isbn)) {
                books[i] = books[bookCount - 1];
                books[bookCount - 1] = null;
                bookCount--;


                return;
            }
        }
        System.out.println("Book with ISBN " + isbn + " not found.");
    }
    public Book findBook(String isbn){
        for (int i = 0; i < bookCount; i++) {
            if (books[i].getIsbn().equals(isbn)) {
                return books[i];
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "Library{" +
                "libraryName='" + libraryName + '\'' +
                ", address='" + address + '\'' +
                ", books=" + Arrays.toString(books) +
                ", bookCount=" + bookCount +
                '}';
    }

    public static void main(String[] args) {
        Library lib=new Library("Kitabxana", "56");
        Book book1=new Book("1234", "Harry Potter 1", "J.K Rowling", "Scholastic Corporation", 1997, 1200000 );
        Book book2=new Book("1234", "Harry Potter 2", "J.K Rowling", "Scholastic Corporation", 1998, 7700000 );
        Book book3=new Book("1234", "Harry Potter 3", "J.K Rowling", "Scholastic Corporation", 1999, 6500000 );

//        lib.addBook(book1);
//        lib.addBook(book2);
//        lib.addBook(book3);
        lib.removeBook(String.valueOf(book1));
        System.out.println(lib);
    }
}

