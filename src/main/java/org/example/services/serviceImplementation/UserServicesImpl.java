package org.example.services.serviceImplementation;

import org.example.comparator.UserComparator;
import org.example.models.Book;
import org.example.models.Library;
import org.example.models.User;
import org.example.services.UserServices;

import java.util.List;
import java.util.stream.Collectors;

public class UserServicesImpl implements UserServices {
    @Override
    public String joinQueue(User person, Library library) {
        return null;
    }

    @Override
    public String borrowBooks(User person, Book book, Library library) {
        boolean bookAvailable = library.getBookList()
                .stream()
                .anyMatch(libraryBook -> book.getBook_id() == libraryBook.getBook_id());

        return bookAvailable ? "THE BOOK IS AVAILABLE" : "THE BOOK IS NOT AVAILABLE";
    }


//    public String borrowBooks(User person, Book book, Library library) {
//        for (Book libraryBook : library.getBookList()){
//            if(book.getBook_id() == (libraryBook.getBook_id())){
//                return "THE BOOK IS AVAILABLE";
//            }
//        }
//        return "THE BOOK IS NOT AVAILABLE";
//    }

    @Override
    public String returnBooks(User person, Book book, Library library) {
        return null;
    }

    @Override
    public List<User> borrowFifo(User user, Library library) {
        List<User> updatedFifoList = library.getFifoList()
                .stream()
                .collect(Collectors.toList());

        updatedFifoList.add(user);

        return updatedFifoList;
    }

    
//        List<User>fifoList = library.getFifoList();
//        fifoList.add(user);
//        return fifoList;
//    }


    @Override
    public void borrowBook(User user, Book book, Library library) {
        UserComparator request = new UserComparator(user, book, user.getRole());
        library.getUserQueue().add(request);
    }
}
