package QAMP.OOP.zadaca6.Zadatak1;

public class Book {
    private String title;
    private long ISBN;
    private String author;

    public Book (final String title, final long ISBN, final String author){
        this. title = title;
        this.ISBN = ISBN;
        this.author = author;
    }

    public String getTitle (){
       return this.title;
    }

    public long getISBN (){
        return this.ISBN;
    }

    public String getAuthor (){
        return this.author;
    }

    public String toString (){
        return this.title + ", " + this.author + " (" + this.ISBN + ")";
    }
}
