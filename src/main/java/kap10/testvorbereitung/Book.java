package kap10.testvorbereitung;

import java.util.Comparator;
import java.util.Objects;

public class Book implements Comparable<Book> {
    private String title;
    private String author;
    private double price;

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(title, book.title);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(title);
    }

    @Override
    public int compareTo(Book o) {
        return this.title.compareTo(o.title);
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public static void main(String[] args) {
        Book b1 = new Book("a", "a" , 100);
        Book b2 = new Book("ac", "b" , 100);

        System.out.println(b1.compareTo(b1));
        System.out.println(b1.compareTo(b2));
        System.out.println(b2.compareTo(b1));
    }
}
