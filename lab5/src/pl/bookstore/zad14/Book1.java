package pl.bookstore.zad14;

public class Book1 {
    private String title;
    private String author;
    private int publicationYear;
    private String publisher;
    private int numberOfPages;

    public Book1(String title,String author, int publicationYear, String publisher, int numberOfPages){

        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
        this.publisher = publisher;
        this.numberOfPages = numberOfPages;
    }
    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public int getPublicationYear() {
        return publicationYear;
    }
    public String getPublisher() {
        return publisher;
    }
    public int getNumberOfPages() {
        return numberOfPages;
    }


    public void setTitle(String newTitle) {
        title = newTitle;
    }
    public void setAuthor(String newAuthor) {
        author = newAuthor;
    }
    public void setPublicationYear(int newPublicationYear) {
        publicationYear = newPublicationYear;
    }
    public void setPublisher(String newPublisher) {
        publisher = newPublisher;
    }
    public void setNewNumberOfPages(int newNumberOfPages) {
        numberOfPages = newNumberOfPages;
    }




    public void showInformation(){
        System.out.println("title:"+title);
        System.out.println("author:"+author);
        System.out.println("publicationYear:"+publicationYear);
        System.out.println("publisher:"+publisher);
        System.out.println("numberOfPages:"+numberOfPages);
    }

}

/*
*  Dodaj metody dostępowe (gettery i settery) oraz metodę showInformation(),
która wyświetla informacje o książce.*/