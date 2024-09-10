package ThirdMonth.MentorLessons.Lesson21.Task1;

public class BookStore {

    Book[] books= new Book[10];
    int bookCount=0;
    public void addBooks(Book book){
        if(bookCount<books.length){
            books[bookCount]=book;
            bookCount++;
        } else{
            System.out.println("Library is full");
        }
    }
    public void listBook(){
        if(bookCount==0){
            System.out.println("There is no book listed");
        } else{
            for (int i = 0; i < bookCount; i++) {
                System.out.println("Listed books: "+ books[i]);
            }
        }
    }

    public void findBook(BookCategory category){
        for (int i = 0; i < bookCount; i++) {
            if(books[i].getCategory()==category){
                System.out.println("found book is "+books[i]);
            }
        }
    }
}
