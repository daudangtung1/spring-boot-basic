package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.demo.model.Books;
import com.example.demo.service.BooksService;

@RestController
public class BooksController {

    @Autowired
    BooksService booksService;

    @GetMapping("/books")
    private List<Books> getAllBooks()
    {
        return booksService.getAllBooks();
    }

    @GetMapping("/book/{bookid}")
    private Books getBooks(@PathVariable("bookid") int bookid) {
        return booksService.getBooksById(bookid);
    }

    @DeleteMapping("/book/{bookid}")
    private void deleteBook(@PathVariable("bookid") int bookid) {
        booksService.detele(bookid);
    }

    @PostMapping("/books")
    private int saveBook(@RequestBody Books books) {
        booksService.saveOrUpdate(books);
        return books.getBookid();
    }

    @PutMapping("/books")
    private Books update(@RequestBody Books books) {
        booksService.saveOrUpdate(books);
        return books;
    }
}
