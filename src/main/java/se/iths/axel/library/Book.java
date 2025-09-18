package se.iths.axel.library;

//Hej Axel vgd?
public class Book {
    private String title;
    private int isbn;
    private Author author;

    public Book(String title, int isbn, Author author) {
        this.title = title;
        this.isbn = isbn;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public int getIsbn() {
        return isbn;
    }

    public Author getAuthor() {
        return author;
    }
    

}
