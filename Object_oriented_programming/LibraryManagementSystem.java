package Object_oriented_programming;

import java.util.*;

// Class to represent individual books
class Book {
    private String bookId;
    private String title;
    private String author;
    private String genre;
    private boolean isAvailable;

    public Book(String bookId, String title, String author, String genre) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.isAvailable = true;
    }

    public String getBookId() {
        return bookId;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getGenre() {
        return genre;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void issueBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("Object_oriented_programming.Book issued successfully.");
        } else {
            System.out.println("Object_oriented_programming.Book is not available.");
        }
    }

    public void returnBook() {
        isAvailable = true;
        System.out.println("Object_oriented_programming.Book returned successfully.");
    }

    public void displayDetails() {
        System.out.println("Object_oriented_programming.Book ID: " + bookId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Genre: " + genre);
        System.out.println("Available: " + (isAvailable ? "Yes" : "No"));
    }
}

// Class to represent library members
class Member {
    private String memberId;
    private String name;
    private String membershipType;
    private List<Book> borrowedBooks;

    public Member(String memberId, String name, String membershipType) {
        this.memberId = memberId;
        this.name = name;
        this.membershipType = membershipType;
        this.borrowedBooks = new ArrayList<>();
    }

    public String getMemberId() {
        return memberId;
    }

    public String getName() {
        return name;
    }

    public void borrowBook(Book book) {
        if (borrowedBooks.size() < 3 && book.isAvailable()) {
            borrowedBooks.add(book);
            book.issueBook();
        } else {
            System.out.println("Cannot borrow book. Limit reached or book not available.");
        }
    }

    public void returnBook(Book book) {
        if (borrowedBooks.remove(book)) {
            book.returnBook();
        } else {
            System.out.println("This book was not borrowed by the member.");
        }
    }

    public void viewBorrowedBooks() {
        if (borrowedBooks.isEmpty()) {
            System.out.println("No books borrowed.");
        } else {
            System.out.println("Borrowed Books:");
            for (Book book : borrowedBooks) {
                book.displayDetails();
            }
        }
    }
}

// Class to represent librarians
class Librarian {
    private String librarianId;
    private String name;
    private String assignedSection;

    public Librarian(String librarianId, String name, String assignedSection) {
        this.librarianId = librarianId;
        this.name = name;
        this.assignedSection = assignedSection;
    }

    public void addBook(List<Book> books, Book book) {
        books.add(book);
        System.out.println("Object_oriented_programming.Book added successfully.");
    }

    public void removeBook(List<Book> books, Book book) {
        if (books.remove(book)) {
            System.out.println("Object_oriented_programming.Book removed successfully.");
        } else {
            System.out.println("Object_oriented_programming.Book not found in the collection.");
        }
    }

    public void viewAllBooks(List<Book> books) {
        System.out.println("All Books in the Object_oriented_programming.Library:");
        for (Book book : books) {
            book.displayDetails();
        }
    }
}

// Class to manage the library
class Library {
    private List<Book> books;
    private List<Member> members;

    public Library() {
        books = new ArrayList<>();
        members = new ArrayList<>();
    }

    public void addMember(Member member) {
        members.add(member);
        System.out.println("Object_oriented_programming.Member added successfully.");
    }

    public void removeMember(Member member) {
        if (members.remove(member)) {
            System.out.println("Object_oriented_programming.Member removed successfully.");
        } else {
            System.out.println("Object_oriented_programming.Member not found.");
        }
    }

    public void searchBook(String query) {
        System.out.println("Search Results:");
        for (Book book : books) {
            if (book.getTitle().contains(query) || book.getAuthor().contains(query) || book.getGenre().contains(query)) {
                book.displayDetails();
            }
        }
    }

    public void manageTransactions(Member member, Book book, boolean isBorrowing) {
        if (isBorrowing) {
            member.borrowBook(book);
        } else {
            member.returnBook(book);
        }
    }

    public List<Book> getBooks() {
        return books;
    }

    public List<Member> getMembers() {
        return members;
    }
}

// Main class to test the system
public class LibraryManagementSystem {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Object_oriented_programming.Library Management System!");
        System.out.println("You are the librarian. Let's manage the library.");

        while (true) {
            System.out.println("\nChoose an action:");
            System.out.println("1. Add a Object_oriented_programming.Book");
            System.out.println("2. Remove a Object_oriented_programming.Book");
            System.out.println("3. View All Books");
            System.out.println("4. Add a Object_oriented_programming.Member");
            System.out.println("5. Remove a Object_oriented_programming.Member");
            System.out.println("6. Search for a Object_oriented_programming.Book");
            System.out.println("7. Manage Transactions");
            System.out.println("8. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.println("Enter book details (ID, Title, Author, Genre):");
                    String bookId = scanner.nextLine();
                    String title = scanner.nextLine();
                    String author = scanner.nextLine();
                    String genre = scanner.nextLine();
                    library.getBooks().add(new Book(bookId, title, author, genre));
                    System.out.println("Object_oriented_programming.Book added successfully.");
                    break;

                case 2:
                    System.out.println("Enter the ID of the book to remove:");
                    bookId = scanner.nextLine();
                    library.getBooks().removeIf(book -> book.getBookId().equals(bookId));
                    System.out.println("Object_oriented_programming.Book removed if it existed.");
                    break;

                case 3:
                    System.out.println("All Books in the Object_oriented_programming.Library:");
                    for (Book book : library.getBooks()) {
                        book.displayDetails();
                    }
                    break;

                case 4:
                    System.out.println("Enter member details (ID, Name, Membership Type):");
                    String memberId = scanner.nextLine();
                    String name = scanner.nextLine();
                    String membershipType = scanner.nextLine();
                    library.addMember(new Member(memberId, name, membershipType));
                    break;

                case 5:
                    System.out.println("Enter the ID of the member to remove:");
                    memberId = scanner.nextLine();
                    library.getMembers().removeIf(member -> member.getMemberId().equals(memberId));
                    System.out.println("Object_oriented_programming.Member removed if they existed.");
                    break;

                case 6:
                    System.out.println("Enter search query (Title, Author, Genre):");
                    String query = scanner.nextLine();
                    library.searchBook(query);
                    break;

                case 7:
                    System.out.println("Enter Object_oriented_programming.Member ID:");
                    memberId = scanner.nextLine();
                    Member member = library.getMembers().stream()
                            .filter(m -> m.getMemberId().equals(memberId))
                            .findFirst()
                            .orElse(null);

                    if (member == null) {
                        System.out.println("Object_oriented_programming.Member not found.");
                        break;
                    }

                    System.out.println("Enter Object_oriented_programming.Book ID:");
                    bookId = scanner.nextLine();
                    Book book = library.getBooks().stream()
                            .filter(b -> b.getBookId().equals(bookId))
                            .findFirst()
                            .orElse(null);

                    if (book == null) {
                        System.out.println("Object_oriented_programming.Book not found.");
                        break;
                    }

                    System.out.println("1. Borrow Object_oriented_programming.Book\n2. Return Object_oriented_programming.Book");
                    int action = scanner.nextInt();
                    scanner.nextLine();

                    if (action == 1) {
                        library.manageTransactions(member, book, true);
                    } else if (action == 2) {
                        library.manageTransactions(member, book, false);
                    } else {
                        System.out.println("Invalid action.");
                    }
                    break;

                case 8:
                    System.out.println("Exiting the system. Goodbye!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
