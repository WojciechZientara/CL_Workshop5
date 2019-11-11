package pl.coderslab.service;

import org.springframework.stereotype.Service;
import pl.coderslab.model.Book;

import java.util.ArrayList;
import java.util.List;

@Service
public class MemoryBookService {

    private List<Book> allBooks;

    public MemoryBookService() {
        allBooks = new ArrayList<>();
        allBooks.add(new Book(1L, "9788324631766", "Thinking in Java", "Bruce Eckel",
                "Helion", "programming"));
        allBooks.add(new Book(2L, "9788324627738", "Rusz glowa, Java.",
                "Sierra Kathy, Bates Bert", "Helion", "programming"));
        allBooks.add(new Book(3L, "9780130819338", "Java 2. Podstawy",
                "Cay Horstmann, Gary Cornell", "Helion", "programming"));
    }

    public List<Book> getAllBooks() {
        return allBooks;
    }

    public void setAllBooks(List<Book> allBooks) {
        this.allBooks = allBooks;
    }

    public void createBook(Book book) {
        allBooks.add(book);
    }

    public Book getBook(long bookId) {
        return allBooks.get(Integer.parseInt(String.valueOf(bookId)));
    }

    public void updateBook(Book book) {
        int bookId = Integer.parseInt(String.valueOf(book.getId()));
        allBooks.set(bookId, book);
    }

    public Book deleteBook(long bookId) {
        return allBooks.remove(Integer.parseInt(String.valueOf(bookId)));
    }
}
