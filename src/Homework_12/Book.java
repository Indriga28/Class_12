package Homework_12;

import java.util.Objects;

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

    @Override
    public String toString() {
        return  "year=" + year +
                ", author=" + author +
                ", nameOfBook='" + nameOfBook + '\'';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return year == book.year && author.equals(book.author) && nameOfBook.equals(book.nameOfBook);
    }

    @Override
    public int hashCode() {
        return Objects.hash(year, author, nameOfBook);
    }
}
