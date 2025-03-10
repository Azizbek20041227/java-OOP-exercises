package exercises2_1;

public class Book {

    private String name;
    private Author auther;
    private  double price;
    private int qty = 0;

    public Book(String name, Author auther, double price) {
        this.name = name;
        this.auther = auther;
        this.price = price;
    }

    public Book(String name, Author auther, double price, int qty) {
        this.name = name;
        this.auther = auther;
        this.price = price;
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public Author getAuther() {
        return auther;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        return "Book[name= " + name +
                ", auther= " + auther +
                ", price= " + price +
                ", qty= " + qty +
                ']';
    }
}
