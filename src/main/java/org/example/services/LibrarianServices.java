package org.example.services;

import org.example.models.Book;
import org.example.models.Library;
import org.example.models.User;

public interface LibrarianServices {

    public void addBookToInventory(Library library, Book book);

    String issueBook( Library library, User user, Book book);
    String IssueBookByPriority(Library library);

}
