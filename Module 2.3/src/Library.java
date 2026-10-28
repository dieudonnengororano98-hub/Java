import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();
    private ArrayList<User> users = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public void displayBooks() {
        System.out.println("Library Catalog:");
        int count = 1;
        for (Book book : books) {
            System.out.println(count + ". Title: " + book.getTitle() + ", Author: " + book.getAuthor() + ", Year: " + book.getPublicationYear());
            count++;
        }
    }

    public void findBooksByAuthor(String author) {
        System.out.println("Books by Author \"" + author + "\":");
        for (Book book : books) {
            if (book.getAuthor().equals(author)) {
                System.out.println("Title: \"" + book.getTitle() + "\", Year: " + book.getPublicationYear());
            }
        }
    }

    public void borrowBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                books.remove(book);
                System.out.println("You borrowed: " + title);
                return;
            }
        }
        System.out.println("Book not available.");
    }

    public void returnBook(Book book) {
        books.add(book);
        System.out.println("you are returned" + book.getTitle());
    }

    public boolean isBookAvailable(String title) {
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                return true;
            }
        }
        return false;
    }
    public double getAverageBookRating() {
        if (books.isEmpty()) {
            return 0;
        }
        double total = 0;
        for (Book book : books) {
            total += book.getRating();
        }
        return total / books.size();
    }


    public Book getMostReviewedBook() {
        if (books.isEmpty()) {
            return null;
        }
        Book mostReviewed = books.get(0);
        for (Book book : books) {
            if (book.getReviews().size() > mostReviewed.getReviews().size()) {
                mostReviewed = book;
            }
        }
        return mostReviewed;
    }

    public void addUser(User user) {
        users.add(user);
    }

    public User findUser(String name) {
        for (User user : users) {
            if (user.getName().equals(name)) {
                return user;
            }
        }
        return null;
    }


    public void removeUser(String name) {
        User user = findUser(name);
        if (user == null) {
            System.out.println("User not found.");
            return;
        }
        users.remove(user);
        System.out.println("Removed user: " + name);
    }

    public void listUsers() {
        System.out.println("Library Users:");
        for (User user : users) {
            System.out.println("Name: " + user.getName() + ", Age: " + user.getAge() + ", Borrowed books: " + user.getBorrowedBooks().size());
        }
    }

    public void borrowBook(User user, String title) {
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                books.remove(book);
                user.getBorrowedBooks().add(book);
                System.out.println(user.getName() + " borrowed: " + title);
                return;
            }
        }
        System.out.println("Book not available.");
    }

    public void returnBook(User user, Book book) {
        if (user.getBorrowedBooks().contains(book)) {
            user.getBorrowedBooks().remove(book);
            books.add(book);
            System.out.println(user.getName() + " returned: " + book.getTitle());
        } else {
            System.out.println(user.getName() + " did not borrow this book.");
        }
    }


}
