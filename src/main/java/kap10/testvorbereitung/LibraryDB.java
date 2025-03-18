package kap10.testvorbereitung;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class LibraryDB {
    private HashSet<Book> books;

    public LibraryDB() {
        books = new HashSet<>();
    }

    public LibraryDB(ArrayList<Book> books) {
        this.books = new HashSet<>(books);
    }

    public boolean addBook(Book newBook) {
        return books.add(newBook);
    }

    public Book getByTitle(String title) {
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                return book;
            }
        }
        return null;
    }

    public boolean removeByTitle(String title) {
        Book book = getByTitle(title);
        if (book != null) {
            return books.remove(book);
        }
        return false;

        /*
        Iterator<Book> iterator = books.iterator();
        while (iterator.hasNext()) {
            Book book = iterator.next();
            if (book.getTitle().equals(title)) {
                iterator.remove();
                return true;
            }
        }
        return false;*/
    }

    public String exportBookListCSVasc() {
        String csv = "TITLE, AUTHOR, PRICE\n";

        TreeSet<Book> tree = new TreeSet<>(books);

        for (Book book : tree) {
            csv += book.getTitle() + ", " + book.getAuthor() + ", " + book.getPrice() + "\n";
        }

        return csv;
    }

    public static void main(String[] args) {
        Book b1 = new Book("a", "a" , 100);
        Book b2 = new Book("xxxx", "b" , 100);
        Book b3 = new Book("u", "b" , 100);

        LibraryDB libraryDB = new LibraryDB();
        libraryDB.addBook(b1);
        libraryDB.addBook(b2);
        libraryDB.addBook(b3);
        System.out.println(libraryDB.getByTitle("a"));
        //System.out.println(libraryDB.removeByTitle("a"));
        System.out.println(libraryDB.getByTitle("a"));

        System.out.println(libraryDB.exportBookListCSVasc());

    }
}
