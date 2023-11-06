package pl.bookstore.zad14;

public class TestBook1 {
    public static void main(String[] args){
        Book1 book = new Book1("Witcher last wish","A. Sapkowski", 2001,"SuperNowa",180);


        System.out.println("Title: " + book.getTitle());
        System.out.println("Author: " + book.getAuthor());

        book.setTitle("Sword of Destiny");
        System.out.println("Updated Title: " + book.getTitle());

        book.showInformation();
    }
}
