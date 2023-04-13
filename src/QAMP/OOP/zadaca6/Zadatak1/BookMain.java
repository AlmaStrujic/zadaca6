package QAMP.OOP.zadaca6.Zadatak1;

public class BookMain {
    public static void main(String[] args) {
        final Book book = new Book("Kite Runner", 298398499, "Khaled Hosseini");
        final Book book1 = new Book("Ana Karenina", 67665520, "L. N. Tolstoj");
        final Book book2 = new Book("Little Prince", 2023, "Antoine de Saint-Exupery");
        final Bookshelf bookshelf = new Bookshelf();

        bookshelf.addBook(book);
        bookshelf.addBook(book1);
        bookshelf.addBook(book2);
        bookshelf.printBookshelf();

        System.out.println("Is there a book called 'Little Prince' on the bookshelf: " + bookshelf.containsBook("Little Prince"));
        System.out.println("Is there a book called 'Cinderella' on the bookshelf: "+ bookshelf.containsBook("Cinderella"));

        System.out.println("Check bookshelf for ISBN 2023: "+ bookshelf.containsBook (2023L));
        System.out.println("Check bookshelf for ISBN 66666666: "+ bookshelf.containsBook (66666666L));
            }
}

