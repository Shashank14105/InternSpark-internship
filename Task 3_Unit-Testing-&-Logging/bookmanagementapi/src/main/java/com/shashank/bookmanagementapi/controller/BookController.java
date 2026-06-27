package com.shashank.bookmanagementapi.controller;
import com.shashank.bookmanagementapi.dto.BookDTO;
import com.shashank.bookmanagementapi.entity.Book;
import com.shashank.bookmanagementapi.service.BookService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {
    private final BookService service;

    private static final Logger logger =
            LoggerFactory.getLogger(BookController.class);

    public BookController(BookService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<Book> createBook(@Valid @RequestBody BookDTO dto) {

        logger.info("POST request received to create book: {}", dto.getTitle());
        Book savedBook = service.createBook(dto);

        return new ResponseEntity<>(savedBook, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Book>> getAllBooks() {

        logger.info("GET request received to fetch all books");
        return ResponseEntity.ok(service.getAllBooks());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Book> getBookById(@PathVariable Long id) {

        logger.info("GET request received for book ID: {}", id);
        return ResponseEntity.ok(service.getBookById(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Book> updateBook(
            @PathVariable Long id,
            @Valid @RequestBody BookDTO dto) {
        logger.info("PUT request received to update book ID: {}", id);
        return ResponseEntity.ok(
                service.updateBook(id, dto)
        );
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteBook(@PathVariable Long id) {
        logger.info("DELETE request received to delete book ID: {}", id);
        service.deleteBook(id);

        return ResponseEntity.noContent().build();
    }

}


