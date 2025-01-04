package com.example.librarymanagement.service;

import com.example.librarymanagement.model.Book;
import com.example.librarymanagement.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class BookService {
    
    @Autowired
    private BookRepository bookRepository;
    
    public Book saveBook(Book book) {
        return bookRepository.save(book);
    }
    
    public List<Book> getAllBooks() {
        List<Book> books = new ArrayList<>();
        bookRepository.findAll().forEach(books::add);
        return books;
    }
    
    public Optional<Book> getBookById(String id) {
        return bookRepository.findById(id);
    }
    
    public void deleteBook(String id) {
        bookRepository.deleteById(id);
    }
    
    public Book updateBook(String id, Book book) {
        book.setId(id);
        return bookRepository.save(book);
    }
} 