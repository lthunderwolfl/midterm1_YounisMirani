package Task3;

public class LibraryTester {
    public static void main(String[] args) {
        LMS library = new LMS();
        Book book1 = new Book();
        book1.setTitle("Harry Potter");
        book1.setAuthor("J.K. Rowling");
        library.addBook(book1);
        Book book2 = new Book();
        book2.setTitle("Lord of the Rings");
        book2.setAuthor("J.R.R. Tolkien");
        library.addBook(book2);
        library.printStorage();
        System.out.println("Book removed: " + library.removeBook(book1));
        library.printStorage();
    }
}
