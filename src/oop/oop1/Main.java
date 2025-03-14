package oop.oop1;

public class Main {
    public static void main(String[] args) {

        Rectangle rect1 = new Rectangle(4, 40);
        Rectangle rect2 = new Rectangle(3.5, 35.9);

        System.out.println("Rectangle 1:");
        System.out.println("Kengligi: " + rect1.width);
        System.out.println("Balandligi: " + rect1.height);
        System.out.println("Yuzi: " + rect1.getArea());
        System.out.println("Perimeteri: " + rect1.getPerimeter());

        System.out.println("\nRectangle 2:");
        System.out.println("Kengligi: " + rect2.width);
        System.out.println("Balandligi: " + rect2.height);
        System.out.println("Yuzi: " + rect2.getArea());
        System.out.println("Perimeteri: " + rect2.getPerimeter());
    }
}
