package Ex1;

public class Book {
    private String title;
    private double price;
    private String ISBN;
    private int pages;
    private static int count;
    private int ID;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    private static void incrementCount(){
        count++;
    }

    //Constructor
    //    public Book(String title, double price, String isbn, int pages) {
    //        this.title = title;
    //        this.price = price;
    //        this.ISBN = isbn;
    //        this.pages = pages;
    //    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Book.count = count;
    }

    public Book(String title, double price, String isbn, int pages){
        setPrice(price);
        setTitle(title);
        setISBN(isbn);
        setPages(pages);
        incrementCount();
        setID(count);
    }



    public Book(){
        this.title = "Title Not Availble";
        this.price = 0.00;
        this.ISBN = "ISBN Not Available";
        this.pages = 0;
    }

    @Override
    public String toString(){
        return getPrice() + "\n" + getPages() + "\n" + getISBN() + "\n" + getTitle() + "\n" + getID();
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
