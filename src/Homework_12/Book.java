package Homework_12;

public class Book {
    private int year;
    private Author author;
    private String nameOfBook;

    public Book(int year, Author author, String nameOfBook) {
        this.year = year;
        this.author = author;
        this.nameOfBook = nameOfBook;
    }

    public int getYear() {
        return year;
    }

    public Author getAuthor() {
        return author;
    }

    public String getNameOfBook() {
        return nameOfBook;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
