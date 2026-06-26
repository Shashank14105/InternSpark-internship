package com.shashank.bookmanagementapi.controller;
import com.shashank.bookmanagementapi.dto.BookDTO;
import com.shashank.bookmanagementapi.entity.Book;
import com.shashank.bookmanagementapi.service.BookService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {
    private final BookService service;

    public BookController(BookService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<Book> createBook(
            @Valid @RequestBody BookDTO dto) {

        Book savedBook = service.createBook(dto);

        return new ResponseEntity<>(
                savedBook,
                HttpStatus.CREATED
        );
    }

    @GetMapping
    public ResponseEntity<List<Book>> getAllBooks() {

        return ResponseEntity.ok(
                service.getAllBooks()
        );
    }

    @GetMapping("/{id}")
    public ResponseEntity<Book> getBookById(@PathVariable Long id) {
        return ResponseEntity.ok(
                service.getBookById(id)
        );
    }

    @PutMapping("/{id}")
    public ResponseEntity<Book> updateBook(
            @PathVariable Long id,
            @Valid @RequestBody BookDTO dto) {

        return ResponseEntity.ok(
                service.updateBook(id, dto)
        );
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteBook(@PathVariable Long id) {

        service.deleteBook(id);

        return ResponseEntity.noContent().build();
    }

}


