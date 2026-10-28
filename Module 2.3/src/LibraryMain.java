public class LibraryMain {
    public static void main(String[] args) {
        Book book1 = new Book("Introduction to Java Programming", "John Smith", 2020);
        Book book2 = new Book("Data Structures and Algorithms", "Jane Doe", 2018);
        Book book3 = new Book("The Art of Fiction", "Alice Johnson", 2019);

        Library library = new Library();

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        library.displayBooks();
        System.out.println();
        library.findBooksByAuthor("Jane Doe");
        System.out.println();

        library.borrowBook("The Art of Fiction");
        library.displayBooks();

        library.returnBook(book3);
        library.displayBooks();

        System.out.println("Is Data Structures and Algorithms available? " + library.isBookAvailable("Data Structures and Algorithms"));
        System.out.println("Is Python Basics available? " + library.isBookAvailable("Python Basics"));

        book1.setRating(4.5);
        book1.addReview("Very helpful for beginners.");
        book1.addReview("Clear examples.");
        System.out.println("Rating: " + book1.getRating());
        System.out.println("Reviews: " + book1.getReviews());

        book2.setRating(3.5);
        System.out.println("Average rating: " + library.getAverageBookRating());


        book2.addReview("Great explanations.");
        book2.addReview("Good for exam prep.");
        book2.addReview("Very detailed.");
        Book winner = library.getMostReviewedBook();
        System.out.println("Most reviewed book: " + winner.getTitle());


        User alice = new User("Alice", 20);
        User bob = new User("Bob", 25);
        library.addUser(alice);
        library.addUser(bob);
        library.listUsers();

        alice.borrowBook(library, "The Art of Fiction");
        System.out.println("Alice has " + alice.getBorrowedBooks().size() + " borrowed book(s).");
        library.displayBooks();

        alice.returnBook(library, book3);
        library.displayBooks();

        User found = library.findUser("Bob");
        System.out.println("Found user: " + found.getName());

        library.removeUser("Bob");
        library.listUsers();
    }
}