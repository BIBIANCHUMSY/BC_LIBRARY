package org.example.models;

import org.example.enums.Role;

import java.util.Comparator;

public class User implements Comparator<User>{
    private String name;
    private String phoneNo;
    private Role role;

    public User(String name, String phoneNo, Role role) {
        this.name = name;
        this.phoneNo = phoneNo;
        this.role = role;
    }

    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", phpneNo='" + phoneNo + '\'' +
                ", role=" + role +
                '}';
    }


    @Override
    public int compare(User o1, User o2) {
        if (o1.getRole() == Role.TEACHER && o2.getRole() == Role.SENIOR_STUDENT) {
            return -1;
        } else if (o1.getRole() == Role.TEACHER && o2.getRole() == Role.JUNIOR_STUDENT) {
            return -1;
        } else if (o1.getRole() == Role.SENIOR_STUDENT && o2.getRole() == Role.TEACHER) {
            return 1;
        } else if (o1.getRole() == Role.SENIOR_STUDENT && o2.getRole() == Role.JUNIOR_STUDENT) {
            return -1;
        } else if (o1.getRole() == Role.JUNIOR_STUDENT && o2.getRole() == Role.TEACHER) {
            return 1;
        } else if (o1.getRole() == Role.JUNIOR_STUDENT && o2.getRole() == Role.SENIOR_STUDENT) {
            return 1;
        } else if (o1.getRole() == o2.getRole()) {
            return 0;
        } else {
            return 0;

        }
    }
//    @Override
//    public int compare(User o1, User o2) {
//        if (o1.getRole() == Role.TEACHER && o2.getRole() == Role.SENIOR_STUDENT) {
//            return -1;
//        } else if (o1.getRole() == Role.TEACHER && o2.getRole() == Role.JUNIOR_STUDENT) {
//            return -1;
//        } else if (o1.getRole() == Role.SENIOR_STUDENT && o2.getRole() == Role.TEACHER) {
//            return 1;
//        } else if (o1.getRole() == Role.SENIOR_STUDENT && o2.getRole() == Role.JUNIOR_STUDENT) {
//            return -1;
//        } else if (o1.getRole() == Role.JUNIOR_STUDENT && o2.getRole() == Role.TEACHER) {
//            return 1;
//        } else if (o1.getRole() == Role.JUNIOR_STUDENT && o2.getRole() == Role.SENIOR_STUDENT) {
//            return 1;
//        } else if (o1.getRole() == o2.getRole()) {
//            return 0;
//        } else {
//            return 0;
//        }
//    }

}
