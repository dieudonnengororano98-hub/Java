package system;

import model.Book;
import model.LibraryMember;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books = new ArrayList<>();
    private List<LibraryMember> members = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public void addMember(LibraryMember member) {
        members.add(member);
    }

    public void borrowBook(LibraryMember member, Book book) {
        if (!books.contains(book)) {
            System.out.println(book.getTitle() + " is not available.");
            return;
        }
        if (book.isReserved() && !member.hasReservedBook(book)) {
            System.out.println(book.getTitle() + " is reserved by another member.");
            return;
        }
        books.remove(book);
        member.addBorrowedBook(book);
        if (member.hasReservedBook(book)) {
            book.setReserved(false);
            member.removeReservedBook(book);
        }
        System.out.println(member.getName() + " borrowed " + book.getTitle() + ".");
    }

    public void returnBook(LibraryMember member, Book book) {
        if (member.hasBorrowedBook(book)) {
            member.removeBorrowedBook(book);
            books.add(book);
            System.out.println(member.getName() + " returned " + book.getTitle() + ".");
        } else {
            System.out.println(member.getName() + " has not borrowed " + book.getTitle() + ".");
        }
    }

    public void reserveBook(LibraryMember member, Book book) {
        if (!book.isReserved()) {
            book.setReserved(true);
            member.addReservedBook(book);
            System.out.println("Book reserved successfully.");
        } else {
            System.out.println("Book is already reserved.");
        }
    }

    public void cancelReservation(LibraryMember member, Book book) {
        if (book.isReserved() && member.hasReservedBook(book)) {
            book.setReserved(false);
            member.removeReservedBook(book);
            System.out.println("Reservation canceled successfully.");
        } else {
            System.out.println("Book was not reserved by this member.");
        }
    }

    public void displayReservedBooks(LibraryMember member) {
        System.out.println("Reserved books for " + member.getName() + ":");
        for (Book book : member.getReservedBooks()) {
            System.out.println(book.getTitle());
        }
    }
}