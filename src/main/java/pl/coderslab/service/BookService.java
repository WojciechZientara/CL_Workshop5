package pl.coderslab.service;

import pl.coderslab.model.Book;
import java.util.List;

public interface BookService {

    public List<Book> getAllBooks();

    public void createBook(Book book);

    public Book getBook(long bookId);

    public void updateBook(Book book);

    public Book deleteBook(long bookId);

    public long getNextId();

}
