package Task3;


import java.util.ArrayList;
import java.util.List;

public class LMS {
    private List<Book> storage = new ArrayList<Book>();

    public void addBook(Book book) {
        storage.add(book);
    }

    public boolean removeBook(Book book) {
        for (int i = 0; i < storage.size(); i++) {
            Book b = storage.get(i);
            if (b.getTitle().equals(book.getTitle()) && b.getAuthor().equals(book.getAuthor())) {
                storage.remove(i);
                return true;
            }
        }
        return false;
    }

    public void printStorage() {
        if (storage.isEmpty()) {
            System.out.println("The storage is empty");
        } else {
            for (Book b : storage) {
                System.out.println(b.getAuthor() + ", " + b.getTitle());
                System.out.println();
            }
        }
    }
}
