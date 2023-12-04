package org.example.comparator;

import org.example.enums.Role;
import org.example.models.Book;
import org.example.models.User;
import java.util.Comparator;

public class UserComparator implements Comparable<UserComparator> {
    private User user;
    private Book book;
    private Role role;

    public UserComparator() {
    }

    public UserComparator(User user, Book book, Role role) {
        this.user = user;
        this.book = book;
        this.role = role;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    @Override

    public int compareTo(UserComparator o2) {
        if (this.user.getRole() == Role.TEACHER && o2.user.getRole() == Role.SENIOR_STUDENT) {
            return -1;
        } else if (this.user.getRole() == Role.TEACHER && o2.user.getRole() == Role.JUNIOR_STUDENT) {
            return -1;
        } else if (this.user.getRole() == Role.SENIOR_STUDENT && o2.user.getRole() == Role.TEACHER) {
            return 1;
        } else if (this.user.getRole() == Role.SENIOR_STUDENT && o2.user.getRole() == Role.JUNIOR_STUDENT) {
            return -1;
        } else if (this.user.getRole() == Role.JUNIOR_STUDENT && o2.user.getRole() == Role.TEACHER) {
            return 1;
        } else if (this.user.getRole() == Role.JUNIOR_STUDENT && o2.user.getRole() == Role.SENIOR_STUDENT) {
            return 1;
        } else if (this.user.getRole() == o2.user.getRole()) {
            return 0;
        } else {
            return 0;

        }
    }


}
