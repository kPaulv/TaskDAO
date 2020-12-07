package com.kiselev.library.model.entity;

import com.kiselev.library.util.BookIdGenerator;

import java.util.Set;

public class Book {
    private int id;
    private String name;
    private Set<String> authors;
    private String publisher;
    private int year;
    private int pageAmount;
    private double price;
    private BookType type;

    public Book() {

    }

    public Book(String name, Set<String> authors, String publisher, int year, int pageAmount, double price,
                BookType type) {
        this.id = BookIdGenerator.createNewId();
        this.name = name;
        this.authors = authors;
        this.publisher = publisher;
        this.year = year;
        this.pageAmount = pageAmount;
        this.price = price;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public Set<String> getAuthors() {
        return authors;
    }

    public String getName() {
        return name;
    }

    public String getPublisher() {
        return publisher;
    }

    public int getYear() {
        return year;
    }

    public int getPageAmount() {
        return pageAmount;
    }

    public double getPrice() {
        return price;
    }

    public BookType getType() {
        return type;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthors(Set<String> authors) {
        this.authors = authors;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setPageAmount(int pageAmount) {
        this.pageAmount = pageAmount;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setType(BookType type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Book book = (Book) o;

        if (id != book.id) return false;
        if (year != book.year) return false;
        if (pageAmount != book.pageAmount) return false;
        if (Double.compare(book.price, price) != 0) return false;
        if (name != null ? !name.equals(book.name) : book.name != null) return false;
        if (authors != null ? !authors.equals(book.authors) : book.authors != null) return false;
        if (publisher != null ? !publisher.equals(book.publisher) : book.publisher != null) return false;
        return type == book.type;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (authors != null ? authors.hashCode() : 0);
        result = 31 * result + (publisher != null ? publisher.hashCode() : 0);
        result = 31 * result + year;
        result = 31 * result + pageAmount;
        temp = Double.doubleToLongBits(price);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (type != null ? type.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Book{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", authors=").append(authors);
        sb.append(", publisher='").append(publisher).append('\'');
        sb.append(", year=").append(year);
        sb.append(", pageAmount=").append(pageAmount);
        sb.append(", price=").append(price);
        sb.append(", type=").append(type);
        sb.append('}');
        return sb.toString();
    }
}
