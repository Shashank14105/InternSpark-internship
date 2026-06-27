package com.shashank.bookmanagementapi.service;

import com.shashank.bookmanagementapi.dto.BookDTO;
import com.shashank.bookmanagementapi.entity.Book;
import com.shashank.bookmanagementapi.exception.BookNotFoundException;
import com.shashank.bookmanagementapi.repository.BookRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Optional;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class BookServiceTest {

    @Mock
    private BookRepository repository;

    @InjectMocks
    private BookService service;

    private Book book;
    private BookDTO dto;

    @BeforeEach
    void setUp() {

        MockitoAnnotations.openMocks(this);

        book = new Book(1L,
                "9780134685991",
                "Effective Java",
                "Joshua Bloch",
                416);

        dto = new BookDTO();

        dto.setIsbn("9780134685991");
        dto.setTitle("Effective Java");
        dto.setAuthor("Joshua Bloch");
        dto.setPages(416);
    }

    @Test
    void testCreateBook() {

        when(repository.save(any(Book.class))).thenReturn(book);

        Book savedBook = service.createBook(dto);

        assertNotNull(savedBook);
        assertEquals("Effective Java", savedBook.getTitle());

        verify(repository, times(1)).save(any(Book.class));
    }

    @Test
    void testGetAllBooks() {

        when(repository.findAll()).thenReturn(Arrays.asList(book));

        List<Book> books = service.getAllBooks();

        assertEquals(1, books.size());
        assertEquals("Joshua Bloch", books.get(0).getAuthor());

        verify(repository, times(1)).findAll();
    }

    @Test
    void testGetBookById() {

        when(repository.findById(1L)).thenReturn(Optional.of(book));

        Book foundBook = service.getBookById(1L);

        assertNotNull(foundBook);
        assertEquals("Effective Java", foundBook.getTitle());

        verify(repository).findById(1L);
    }

    @Test
    void testUpdateBook() {

        when(repository.findById(1L)).thenReturn(Optional.of(book));
        when(repository.save(any(Book.class))).thenReturn(book);

        Book updatedBook = service.updateBook(1L, dto);

        assertEquals("Effective Java", updatedBook.getTitle());

        verify(repository).findById(1L);
        verify(repository).save(any(Book.class));
    }

    @Test
    void testDeleteBook() {

        when(repository.findById(1L)).thenReturn(Optional.of(book));

        service.deleteBook(1L);

        verify(repository).findById(1L);
        verify(repository).delete(book);
    }

    @Test
    void testBookNotFound() {

        when(repository.findById(10L)).thenReturn(Optional.empty());

        assertThrows(BookNotFoundException.class,
                () -> service.getBookById(10L));

        verify(repository).findById(10L);
    }
}