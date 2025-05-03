package Assignment_7;

public class Question_10 {
    public static void main(String []args){
        Book B=new Book();
        B.setBookId(7);
        B.setTitle("Let Us C");
        B.setPrice(478f);
        B.setAuthor("Yashavant Kanetkar");
        System.out.println("Book Id : "+B.getBookId());
        System.out.println("Title : "+B.getTitle());
        System.out.println("Price : "+B.getPrice());
        System.out.println("Author : "+B.getAuthor());
    }
}
class Book{
    private int bookId;
    private String title;
    private float price;
    private String author;

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
