package com.kiselev.library.model.dao.impl;

import com.kiselev.library.exception.DaoException;
import com.kiselev.library.model.dao.BookDao;
import com.kiselev.library.model.dao.storage.BookWarehouse;
import com.kiselev.library.model.entity.Book;
import com.kiselev.library.model.entity.BookType;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class BookDaoImpl implements BookDao {

    @Override
    public void addBook(Book book) throws DaoException {
        if(contains(book)) {
            throw new DaoException("This book already exists.");
        }
        BookWarehouse.getInstance().add(book);
    }

    @Override
    public List<Book> findAll() {
        return BookWarehouse.getInstance().getBooks();
    }

    @Override
    public Optional<Book> findById(int id) {
        Book bookById = BookWarehouse.getInstance().getBookById(id);
        return Optional.ofNullable(bookById);
    }

    @Override
    public List<Book> findByType(BookType type) {
        List<Book> booksSearched = new ArrayList<>();
        List<Book> totalBooks = BookWarehouse.getInstance().getBooks();
        BookType typeSearched;
        for (Book item : totalBooks) {
            typeSearched = item.getType();
            if (typeSearched == type) {
                booksSearched.add(item);
            }
        }
        return booksSearched;
    }

    @Override
    public List<Book> findByYear(int year) {
        List<Book> booksSearched = new ArrayList<>();
        List<Book> totalBooks = BookWarehouse.getInstance().getBooks();
        int tempYear;
        for (Book item : totalBooks) {
            tempYear = item.getYear();
            if (tempYear == year) {
                booksSearched.add(item);
            }
        }
        return booksSearched;
    }

    @Override
    public boolean contains(Book book) {
        List<Book> books = findAll();
        boolean contains = false;
        for(Book item : books) {
            if(item.equals(book)) {
                contains = true;
                break;
            }
        }
        return contains;
    }

    @Override
    public void delete(Book book) throws DaoException {
        if(!contains(book)) {
            throw new DaoException("Cannot delete book, because it doesn't exist.");
        }
        BookWarehouse.getInstance().remove(book);
    }

    @Override
    public void updatePrice(Book book, double price) throws DaoException {
        if(!contains(book)) {
            throw new DaoException("Cannot update book price, because it doesn't exist.");
        }
        List<Book> books = BookWarehouse.getInstance().getBooks();
        books.get(book.getId()).setPrice(price);
        BookWarehouse.getInstance().setBooks(books);
    }
}
