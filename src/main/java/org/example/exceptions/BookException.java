package org.example.exceptions;

public class BookException extends Exception {

    String message;

    public BookException(String message) {
        super();
        this.message = message;
    }
}