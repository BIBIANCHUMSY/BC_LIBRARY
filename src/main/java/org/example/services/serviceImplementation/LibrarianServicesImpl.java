package org.example.services.serviceImplementation;

import org.example.comparator.UserComparator;
import org.example.enums.Role;
import org.example.models.Book;
import org.example.models.Library;
import org.example.models.User;
import org.example.services.LibrarianServices;


import java.util.List;
import java.util.Optional;


public class LibrarianServicesImpl implements LibrarianServices {


    @Override
    public void addBookToInventory(Library library, Book book) {
        library.getBookList().add(book);

    }


    @Override
    public String issueBook( Library library, User user,Book book) {
        List<User> fifioList = library.getFifoList();
        List<Book> bookList = library.getBookList();

        if (user.getRole() == Role.LIBRARIAN) {
            return "You are not Authorized";
        }

        if (bookList.isEmpty()) {
            return "All book copies are not available";
        }

        Book availableBook = bookList.get(0);

        if (availableBook.getQuantity() <= 0) {
            return "All book copies have been collected";
        }

        if (bookList.stream().anyMatch(b -> b.getQuantity() <= 0)) {
            return "Book collected";
        }

        if (fifioList.stream().anyMatch(user1 -> true)) {
            return user.getName() + " borrowed " + book.getTitle();
        }

        return "Book borrowed";

//    List<User> fifioList = library.getFifoList();
//    List<Book> bookList = library.getBookList();
//
//    if(user.getRole().equals(Role.LIBRARIAN)){
//        return " You are not Authorized ";
//    }
//    if (bookList.isEmpty()) {
//        return "All book copies are not available";
//    }
//     Book availableBook = bookList.get(0);
//    if (availableBook.getQuantity()<=0){
//        return "All book copies have been collected ";
//    }
//       for( Book b: bookList){
//           if (b.getQuantity()<=0){
//               return "Book  collected";
//           }
//           for ( User user1: fifioList){
//               String result = "borrowed ";
//               return user.getName() + " "+ result + book.getTitle();
//           }
//       }
//        return "Book borrowed";

    }
    @Override
    public String IssueBookByPriority(Library library) {
        System.out.println(library.getUserQueue());
        UserComparator request = library.getUserQueue().peek();
        assert request != null;
        User user1 = request.getUser();
        User user = request.getUser();
        User user3 = request.getUser();
        Book book = request.getBook();
        if (book.getQuantity() <= 0){
            return "Book " + book.getTitle() + " is not available";
        }
        library.getUserQueue().poll();
        book.setQuantity(book.getQuantity() - 1);
        return  "Book " + book.getTitle()+ " is assigned out to "+ user1.getName();
    }
}
