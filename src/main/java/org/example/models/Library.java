package org.example.models;

import org.example.comparator.UserComparator;

import java.util.*;

public class Library {

    List<Book> bookList;
    PriorityQueue<UserComparator> userQueue;


    private List<User> fifoList;

    public Library(List<Book> bookList, PriorityQueue<User> userQueue) {
        this.bookList = bookList;
        this.userQueue = new PriorityQueue<>();
        this.fifoList = new ArrayList<>();

    }



    public Library() {
        this.bookList = new LinkedList<>();
        this.userQueue = new PriorityQueue<>();
        this.fifoList = new ArrayList<>();
    }

    public List<Book> getBookList() {
        return bookList;
    }

    public void setBookList(List<Book> bookList) {
        this.bookList = bookList;
    }

    public Queue<UserComparator> getUserQueue() {
        return userQueue;
    }

    public void setUserQueue(PriorityQueue<UserComparator> userQueue) {
        this.userQueue = userQueue;
    }

    public List<User> getFifoList() {
        return fifoList;
    }

    public void setFifoList(List<User> fifoList) {
        this.fifoList = fifoList;
    }

    @Override
    public String toString() {
        return "Library{" +
                "bookList=" + bookList +
                ", personQueue=" + userQueue +
                '}';
    }
}