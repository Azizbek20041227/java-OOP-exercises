package exercises2_2;

import java.util.Arrays;

public class Book {

    private String name;
    private Author[] authers;
    private  double price;
    private int qty = 0;

    public Book(String name, Author[] authers, double price) {
        this.name = name;
        this.authers = authers;
        this.price = price;
    }

    public Book(String name, Author[] authers, double price, int qty) {
        this.name = name;
        this.authers = authers;
        this.price = price;
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public Author[] getAuthers() {
        return authers;
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
                ", authers={Author[name= " + name +
                ", author= " + Arrays.toString(authers) +
                ", price= " + price +
                ", qty= " + qty +
                ']';
    }

    public String getAuthorNames() {
        StringBuilder names = new StringBuilder();
        for (int i = 0; i < authers.length; i++) {
            names.append(authers[i].getName());
            if (i < authers.length - 1) {
                names.append(", ");
            }
        }
        return names.toString();
    }
}
