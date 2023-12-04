package org.example.models;

import org.example.enums.BookGenre;

public class Book {
    private String title;
    private  String author;
    private String book_id;
    private int quantity;
    BookGenre bookGenre;



    public Book(String title, String author, String book_id, int quantity, BookGenre bookGenre) {
        this.title = title;
        this.author = author;
        this.book_id = book_id;
        this.quantity = quantity;
        this.bookGenre = bookGenre;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getBook_id() {
        return book_id;
    }

    public void setBook_id(String book_id) {
        this.book_id = book_id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public BookGenre getBookGenre() {
        return bookGenre;
    }

    public void setBookGenre(BookGenre bookGenre) {
        this.bookGenre = bookGenre;
    }

    @Override
    public String toString() {
        return "Books{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", book_id='" + book_id + '\'' +
                ", quantity=" + quantity +
                ", bookGenre=" + bookGenre +
                '\n';
    }
}
