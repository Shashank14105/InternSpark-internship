package com.shashank.bookmanagementapi.service;

import com.shashank.bookmanagementapi.dto.BookDTO;
import com.shashank.bookmanagementapi.entity.Book;
import com.shashank.bookmanagementapi.repository.BookRepository;
import org.springframework.stereotype.Service;
import com.shashank.bookmanagementapi.exception.BookNotFoundException;

import java.util.List;

@Service
public class BookService {

    private final BookRepository repository;

    public BookService(BookRepository repository) {
        this.repository = repository;
    }

    public Book createBook(BookDTO dto) {

        Book book = new Book();

        book.setIsbn(dto.getIsbn());
        book.setTitle(dto.getTitle());
        book.setAuthor(dto.getAuthor());
        book.setPages(dto.getPages());

        return repository.save(book);
    }

    public List<Book> getAllBooks() {
        return repository.findAll();
    }

    public Book getBookById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new BookNotFoundException("Book not found"));
    }

    public Book updateBook(Long id, BookDTO dto) {

        Book book = repository.findById(id)
                .orElseThrow(() -> new BookNotFoundException("Book not found"));

        book.setIsbn(dto.getIsbn());
        book.setTitle(dto.getTitle());
        book.setAuthor(dto.getAuthor());
        book.setPages(dto.getPages());

        return repository.save(book);
    }

    public void deleteBook(Long id) {

        Book book = repository.findById(id)
                .orElseThrow(() -> new BookNotFoundException("Book not found"));

        repository.delete(book);
    }


}