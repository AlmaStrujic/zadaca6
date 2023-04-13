package QAMP.OOP.zadaca6.Zadatak1;

import java.util.ArrayList;
import java.util.List;

public class Bookshelf {
    final List<Book> bookList;

    public Bookshelf() {
        this.bookList = new ArrayList<>();
    }

    public void addBook(Book book) {
        this.bookList.add(book);
    }

    public boolean containsBook(String title) {
        for (Book book : bookList) {
            if (book.getTitle().equals(title)) {
                return true;
            }
        }
        return false;
    }

    public boolean containsBook(Long ISBN) {
        for (Book book : bookList) {
            if (book.getISBN() == ISBN) {
                return true;
            }
        }
        return false;
    }

    public void printBookshelf(){
        for (Book book : bookList){
            System.out.println(book.toString());
            }
    }
}


