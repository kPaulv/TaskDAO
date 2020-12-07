package com.kiselev.library.model.dao.storage;

import com.kiselev.library.model.entity.Book;

import java.util.ArrayList;
import java.util.List;

public class BookWarehouse {
    private static final BookWarehouse INSTANCE = new BookWarehouse();
    private List<Book> books;

    private BookWarehouse() {
        this.books = new ArrayList<>();
    }

    public static BookWarehouse getInstance() {
        return INSTANCE;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public Book getBookById(int id) {
        for(Book book : books) {
            if(book.getId() == id) {
                return book;
            }
        }
        return null;
    }

    public void add(Book book) {
        books.add(book);
    }

    public void remove(Book book) {
        books.remove(book);
    }

}
