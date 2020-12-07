package com.kiselev.library.model.dao;

import com.kiselev.library.exception.DaoException;
import com.kiselev.library.model.entity.Book;
import com.kiselev.library.model.entity.BookType;

import java.util.List;
import java.util.Optional;

public interface BookDao {
    void addBook(Book book) throws DaoException;

    List<Book> findAll();

    Optional<Book> findById(int id);

    List<Book> findByType(BookType type);

    List<Book> findByYear(int year);

    boolean contains(Book book);

    void delete(Book book) throws DaoException;

    void updatePrice(Book book, double price) throws DaoException;
}
