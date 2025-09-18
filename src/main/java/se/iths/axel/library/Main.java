package se.iths.axel.library;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Borrower> borrowers = new ArrayList<>();
        List<Book> books = new ArrayList<>();
        List<Loan> loans = new ArrayList<>();

        Author author1 = new Author("JRR Tolkien");

        Book book1 = new Book("Sagan om ringen", 1, author1);
        Book book2 = new Book("Sagan om de två tornen", 2, author1);
        Book book3 = new Book("Härskarringen", 3, author1);

        books.add(book1);
        books.add(book2);
        books.add(book3);

        Borrower borrower1 = new Borrower("Svante_Kung", "Password", "Svante");
        Borrower borrower2 = new Borrower("Pelle_Kung", "Password", "Pelle");

        System.out.println("1 = Svante");
        System.out.println("2 = Pelle");

        int menu = scanner.nextInt();
        scanner.nextLine();

        Borrower currentBorrower;

        switch (menu) {
            case 1:
                currentBorrower = borrower1;
                break;
            case 2:
                currentBorrower = borrower2;
                break;
            default:
                System.out.println("Not valid");
        }

        System.out.println("Username: ");
        String usernameAttempt = scanner.nextLine();
        System.out.println("Password: ");
        String passwordAttempt = scanner.nextLine();

        borrower1.login(usernameAttempt, passwordAttempt);


        borrowers.add(borrower1);
        borrowers.add(borrower2);

        // Show books
        for (Book book : books) {
            System.out.println(book.getTitle());
        }

        // Show Borrowers
        System.out.println();
        for (Borrower borrower : borrowers) {
            System.out.println(borrower.getName());
        }


    }
}
