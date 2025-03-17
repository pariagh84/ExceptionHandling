package LibraryManagement;

import Exceptions.BookNotFoundException;
import Exceptions.EmptyLibraryException;
import Exceptions.InvalidBookException;

import java.util.ArrayList;

public class Library {

    private ArrayList<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) throws InvalidBookException {
        if (book == null) {
            throw new InvalidBookException("LibraryManagement.Book should not be null");
        }
        books.add(book);
    }

    private Book findBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                return book;
            }
        }
        return null;
    }

    public void borrowBook(String title) throws BookNotFoundException, EmptyLibraryException {
        if (books.isEmpty()) {
            throw new EmptyLibraryException("LibraryManagement.Library is empty,no books to borrow");
        }
        Book book = findBook(title);
        if (book == null) {
            throw new BookNotFoundException("LibraryManagement.Book with title " + title + " not found");
        }
        System.out.println("Successfully borrowed LibraryManagement.Book " + book.toString());
        System.out.println();
    }

    public void returnBook(String title) throws BookNotFoundException {
        Book book = findBook(title);
        if (book == null) {
            throw new BookNotFoundException("Cannot return.LibraryManagement.Book with title " + title + " not found");
        }
        System.out.println("Successfully returned LibraryManagement.Book " + book.toString());
        System.out.println();
    }

    public void listBooks() throws EmptyLibraryException {
        if (books.isEmpty()) {
            throw new EmptyLibraryException("LibraryManagement.Library is empty");
        }
        System.out.println("Books in the LibraryManagement.Library:");
        for (Book book : books) {
            System.out.println(book.toString());
            System.out.println();
        }
    }
}
