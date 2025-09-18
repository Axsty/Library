package se.iths.axel.library;

import java.time.LocalDateTime;

public class Loan {
    private LocalDateTime localDate;
    private Book book;
    private Borrower borrower;

    public Loan(Book book, Borrower borrower) {
        this.localDate = LocalDateTime.now();
        this.book = book;
        this.borrower = borrower;
    }

    public LocalDateTime getLocalDate() {
        return localDate;
    }

    public Book getBook() {
        return book;
    }

    public Borrower getBorrower() {
        return borrower;
    }

}
