package Advance_Java;

import java.util.ArrayList;
         /*
        Create a library management system which is capable of issuing books to the students.
        Book should have info like:
        1. Book name
        2. Book Author
        3. Issued to
        4. Issued on
        User should be able to add books, return issued books, issue books
        Assume that all the users are registered with their names in the central database
         */

class Book {
    String name, author;

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    public String toString() {
        return "Book:" + " name = '" + name + '\'' + ", author : " + author + '\n';

    }
}

class MyLibrary {

    public ArrayList<Book> books;

    public MyLibrary(ArrayList<Book> books) {
        this.books = books;
    }

    public void addBook(Book book) {
        System.out.println("The book '" + book.name + "', by " + book.author + " has been added to the library");
        this.books.add(book);
    }

    public void issueBook(Book book, String issued_to) {
        System.out.println("The book '" + book.name + "', by " + book.author + " has been Issued Successfully to : " + issued_to);
        this.books.remove(book);

    }

    public void returnBook(Book b) {
        System.out.println("The book has been returned successfully");
        this.books.add(b);
    }


}

public class Java_Exercise_7 {
    public static void main(String[] args) {
        ArrayList<Book> bk = new ArrayList<>();
        Book b1 = new Book("Ikigai", "Héctor García and Francesc Miralles");
        bk.add(b1);

        Book b2 = new Book("Atomic Habits", "James Clear");
        bk.add(b2);

        Book b3 = new Book("The Psychology of Money", "Morgan Housel");
        bk.add(b3);

        Book b4 = new Book("Everything Is F*cked", "Mark Manson");
        bk.add(b4);

        MyLibrary l = new MyLibrary(bk);
        l.addBook(new Book("Subtle art", "Mark Manson"));
        System.out.println(l.books);
        l.issueBook(b3, "Harsh");
        System.out.println(l.books);
        l.returnBook(b3);
        System.out.println(l.books);


    }
}
