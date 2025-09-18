package se.iths.axel.library;

import java.util.ArrayList;
import java.util.List;

public class Borrower {
    private String username;
    private String password;
    private String name;
    private List<Book> books;
    //private Loan loans;

    public Borrower(String username, String password, String name) {
        this.username = username;
        this.password = password;
        this.name = name;
        new ArrayList<>();
        //this.loans = loans;
    }

    public String getName() {
        return name;
    }

    public String getUsername() {
        return username;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void login(String usernameAttempt, String passwordAttempt) {

        if (usernameAttempt.equals(this.username) && passwordAttempt.equals(this.password)) {
            System.out.println("Welcome");
        }
    }


}
