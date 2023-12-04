package org.example;



import org.example.models.Book;
import org.example.enums.Role;
import org.example.models.User;
import org.example.models.Library;
import org.example.enums.BookGenre;
import org.example.services.serviceImplementation.LibrarianServicesImpl;
import org.example.services.serviceImplementation.UserServicesImpl;

import java.util.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {









            Book book1 = new Book("Half a Yellow Sun","Chimanda Ngozi Adichie","HA100", 1, BookGenre.HISTORY);
            Book book2 = new Book("Outlander","Diana Gabaldon","OOU566",78, BookGenre.ROMANCE);
            Book book3 = new Book("You Never Know with Woman","James Hardley Chase","YON283",21, BookGenre.THRILLER);
            Book book4 = new Book("The Da vinci Code","Dan Brown","DA893", 104, BookGenre.CRIME_AND_MYSTERY);
            //List<Books> newBooks = new ArrayList<>();
            Library library = new Library();


            LibrarianServicesImpl librarianServices = new LibrarianServicesImpl();
            librarianServices.addBookToInventory(library, book1);
            librarianServices.addBookToInventory(library, book2);
            librarianServices.addBookToInventory(library, book3);
            librarianServices.addBookToInventory(library, book4);
            System.out.println(library.getBookList());



            System.out.println("=====================");

            User user1 = new User("Taiwo", "0803456789",Role.JUNIOR_STUDENT);
            User user2 =new User("Ada","0987654432",Role.SENIOR_STUDENT);
            User user3 = new User("Tony", "081457888", Role.LIBRARIAN);
            User user = new User("Amaka","08256677", Role.TEACHER);



            System.out.println("=====================");





//        library.getFifoList().add(user2);
            library.getFifoList().add(user2);
            library.getFifoList().add(user1);
            library.getFifoList().add(user);
            library.getFifoList().add(user3);


            System.out.println(librarianServices.issueBook(library, user2, book3));



//            System.out.println("sdfghjkjfdsdfhjkkjfds    "+library.getBookList());



//



//        System.out.println(userQueue);
//        List<User>fifoList = new ArrayList<>();
        List<Book> bookList = new LinkedList<>();
        library.setBookList(bookList);
//        library.setFifoList(fifoList);

        LibrarianServicesImpl librarianServices1 = new LibrarianServicesImpl();
        librarianServices1.issueBook(library,user2, book2);
        librarianServices1.issueBook(library,user, book3);
        System.out.println("******");

      //  System.out.println(librarianServices1.IssueBookByPriority(library));

        UserServicesImpl userServices = new UserServicesImpl();
        userServices.borrowFifo(user,library);
        System.out.println("========================");
        userServices.borrowFifo(user2,library);
        System.out.println(library.getFifoList().toString());

        userServices.borrowBook(user,book1,library);
        userServices.borrowBook(user1,book1,library);
        userServices.borrowBook(user2,book1,library);
        System.out.println("Issuing book ===========");

        System.out.println(librarianServices.IssueBookByPriority(library));








        // List<Books> booksList = new ArrayList<>();
//            newBooks.add(books1);
//            newBooks.add(books2);
//            newBooks.add(books3);
//            newBooks.add(books4);
//            library.setBookList(newBooks);

      //  System.out.println(newBooks);


      //  userComparator personComparator = new userComparator();


//Books books = new Books("The Da vinci Code","Dan Brown","DA896", 104, BookGenre.CRIME_AND_MYSTERY);


User person1 = new User("Onyeka", "0812222223", Role.SENIOR_STUDENT);
        UserServicesImpl personServices = new UserServicesImpl();
        String test = personServices.borrowBooks(user2, book2, library);
        System.out.println("====================");
        System.out.println(test);


      //  PersonServicesImpl personServices1 = new PersonServicesImpl();
       // personServices1.borrowBooks(person1,books3,library);





        }
    }