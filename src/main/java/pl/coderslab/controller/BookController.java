package pl.coderslab.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.coderslab.model.Book;
import pl.coderslab.service.BookService;
import java.util.List;

@RestController
public class BookController {

    @Autowired
    BookService bookService;

    @RequestMapping(value = "/books/", method = RequestMethod.GET)
    public List<Book> displayBooks() {
        return bookService.getAllBooks();
    }

    @RequestMapping(value = "/books/{bookId}", method = RequestMethod.GET)
    public Book getBook(@PathVariable int bookId) {
        return bookService.getBook(bookId);
    }

    @RequestMapping(value = "/books/", method = RequestMethod.POST)
    public void createBook(@RequestBody Book book) {
        book.setId(bookService.getNextId());
        bookService.createBook(book);
    }

    @RequestMapping(value = "/books/{bookId}", method = RequestMethod.PUT)
    public void updateBook(@RequestBody Book book, @PathVariable int bookId) {
        book.setId(bookId);
        bookService.updateBook(book);
    }

    @RequestMapping(value = "/books/{bookId}", method = RequestMethod.DELETE)
    public void deleteBook(@PathVariable int bookId) {
        bookService.deleteBook(bookId);
    }

}
