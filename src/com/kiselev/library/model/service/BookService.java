package com.kiselev.library.model.service;

import com.kiselev.library.exception.ServiceException;
import com.kiselev.library.model.entity.Book;
import com.kiselev.library.model.entity.BookType;

import java.util.List;
import java.util.Optional;

public interface BookService {

    void addBook(Book book) throws ServiceException;

    List<Book> findAll();

    Optional<Book> findById(int id) throws ServiceException;

    List<Book> findByYear(int year);

    List<Book> findByType(BookType type);

    void delete(Book book) throws ServiceException;

    void update(Book book, double price) throws ServiceException;

    List<Book> findAllByAuthors();

    List<Book> findAllByPrice();

    List<Book> findAllByPublisher();

    List<Book> findAllByYear();
}
