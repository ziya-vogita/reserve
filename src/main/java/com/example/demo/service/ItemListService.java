package com.example.demo.service;

import com.example.demo.entity.Book;
import com.example.demo.entity.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemListService {
    private final BookRepository bookRepository;

    @Autowired
    public ItemListService(BookRepository bookRepository){

        this.bookRepository = bookRepository;
    }



}
