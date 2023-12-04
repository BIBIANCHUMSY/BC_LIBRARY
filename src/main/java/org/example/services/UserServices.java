package org.example.services;

import org.example.models.Book;
import org.example.models.Library;
import org.example.models.User;

import java.util.List;

public interface UserServices {

    String joinQueue(User person, Library library);
     String borrowBooks(User person, Book book, Library library);

     String returnBooks(User person, Book book, Library library);
 public List<User> borrowFifo(User user, Library library);
    void borrowBook(User user, Book book, Library library);
}
