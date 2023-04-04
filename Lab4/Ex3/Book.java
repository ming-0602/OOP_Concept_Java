package Ex3;

public class Book {
    private String title;
    private double price;
    private String ISBN;
    private int pages;

//Constructor
    public Book(String title, double price, String isbn, int pages) {
        this.title = title;
        this.price = price;
        this.ISBN = isbn;
        this.pages = pages;
    }

    public Book(){
        this.title = "Title Not Availble";
        this.price = 0.00;
        this.ISBN = "ISBN Not Available";
        this.pages = 0;



    }

    @Override
    public String toString(){
        return getPrice() + "\n" + getPages() + "\n" + getISBN() + "\n" + getTitle();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }
}
