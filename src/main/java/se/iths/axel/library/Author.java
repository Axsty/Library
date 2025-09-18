package se.iths.axel.library;

import java.util.ArrayList;
import java.util.List;

public class Author {
    private String name;
    List<Book> books;

    public Author(String name) {
        this.name = name;
        // this.books = books;
        new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<Book> getBooks() {
        return books;
    }
}
