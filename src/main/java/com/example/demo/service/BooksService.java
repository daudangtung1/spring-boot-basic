package com.example.demo.service;
import java.util.ArrayList;
import java.util.List;

import com.example.demo.repository.BooksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.model.Books;
import org.springframework.stereotype.Service;

@Service
public class BooksService {
    @Autowired
    BooksRepository booksRepository;

    public List<Books> getAllBooks()
    {
        List<Books> books = new ArrayList<Books>();
        booksRepository.findAll().forEach(books1 -> books.add(books1));
        return books;
    }

    public Books getBooksById(int id)
    {
        return booksRepository.findById(id).get();
    }

    public void saveOrUpdate(Books books)
    {
        booksRepository.save(books);
    }

    public void detele(int id)
    {
        booksRepository.deleteById(id);
    }

    public void update(Books books, int bookid)
    {
        booksRepository.save(books);
    }
}
