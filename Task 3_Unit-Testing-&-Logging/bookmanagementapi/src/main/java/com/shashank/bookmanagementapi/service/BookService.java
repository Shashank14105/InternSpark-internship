package com.shashank.bookmanagementapi.service;

import com.shashank.bookmanagementapi.dto.BookDTO;
import com.shashank.bookmanagementapi.entity.Book;
import com.shashank.bookmanagementapi.repository.BookRepository;
import org.springframework.stereotype.Service;
import com.shashank.bookmanagementapi.exception.BookNotFoundException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.List;

@Service
public class BookService {

    private static final Logger logger =
            LoggerFactory.getLogger(BookService.class);

    private final BookRepository repository;

    public BookService(BookRepository repository) {
        this.repository = repository;
    }

    public Book createBook(BookDTO dto) {
        logger.info("Creating a new book: {}", dto.getTitle());

        Book book = new Book();

        book.setIsbn(dto.getIsbn());
        book.setTitle(dto.getTitle());
        book.setAuthor(dto.getAuthor());
        book.setPages(dto.getPages());

        return repository.save(book);
    }

    public List<Book> getAllBooks() {
        logger.info("Fetching all books");
        return repository.findAll();
    }

    public Book getBookById(Long id) {

        logger.info("Fetching book with ID: {}", id);

        return repository.findById(id)
                .orElseThrow(() -> {

                    logger.error("Book not found with ID: {}", id);

                    return new BookNotFoundException("Book not found");
                });
    }

    public Book updateBook(Long id, BookDTO dto) {

        logger.info("Updating book with ID: {}", id);

        Book book = repository.findById(id)
                .orElseThrow(() -> new BookNotFoundException("Book not found"));

        book.setIsbn(dto.getIsbn());
        book.setTitle(dto.getTitle());
        book.setAuthor(dto.getAuthor());
        book.setPages(dto.getPages());

        Book updatedBook = repository.save(book);

        logger.info("Book updated successfully");

        return updatedBook;
    }

    public void deleteBook(Long id) {

        Book book = repository.findById(id)
                .orElseThrow(() -> new BookNotFoundException("Book not found"));

        repository.delete(book);

        logger.info("Book deleted successfully");
    }


}