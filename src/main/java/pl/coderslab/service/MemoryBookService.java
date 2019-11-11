package pl.coderslab.service;

import org.springframework.stereotype.Service;
import pl.coderslab.model.Book;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class MemoryBookService {

    private long nextId = 4L;
    private Map<Long, Book> allBooks;
//    private List<Book> allBooks;

    public MemoryBookService() {
//        allBooks = new ArrayList<>();
        allBooks = new HashMap<>();
        allBooks.put (1L, new Book(1L, "9788324631766", "Thinking in Java", "Bruce Eckel",
                "Helion", "programming"));
        allBooks.put(2L, new Book(2L, "9788324627738", "Rusz glowa, Java.",
                "Sierra Kathy, Bates Bert", "Helion", "programming"));
        allBooks.put(3L, new Book(3L, "9780130819338", "Java 2. Podstawy",
                "Cay Horstmann, Gary Cornell", "Helion", "programming"));
//        allBooks.add (new Book(1L, "9788324631766", "Thinking in Java", "Bruce Eckel",
//                "Helion", "programming"));
//        allBooks.add(new Book(2L, "9788324627738", "Rusz glowa, Java.",
//                "Sierra Kathy, Bates Bert", "Helion", "programming"));
//        allBooks.add(new Book(3L, "9780130819338", "Java 2. Podstawy",
//                "Cay Horstmann, Gary Cornell", "Helion", "programming"));
    }

//    public List<Book> getAllBooks() {
//        return allBooks;
//    }
//
//    public void createBook(Book book) {
//        allBooks.add(book);
//        this.nextId++;
//    }
//
//    public Book getBook(long bookId) {
//        allBooks.
//        return allBooks.get(Integer.parseInt(String.valueOf(bookId - 1)));
//    }
//
//    public void updateBook(Book book) {
//        int bookId = Integer.parseInt(String.valueOf(book.getId() - 1));
//        allBooks.set(bookId, book);
//    }
//
//    public Book deleteBook(long bookId) {
//        return allBooks.remove(Integer.parseInt(String.valueOf(bookId - 1)));
//    }
//
//    public long getNextId() {
//        return nextId;
//    }

    public List<Book> getAllBooks() {
        List<Book> listOfBooks = new ArrayList<Book>(allBooks.values());
        return listOfBooks;
    }

    public void createBook(Book book) {
        allBooks.put(book.getId(), book);
        nextId++;
    }

    public Book getBook(long bookId) {
        return allBooks.get(bookId);
    }

    public void updateBook(Book book) {
        allBooks.put(book.getId(), book);
    }

    public Book deleteBook(long bookId) {
        return allBooks.remove(bookId);
    }

    public long getNextId() {
        return nextId;
    }

}
