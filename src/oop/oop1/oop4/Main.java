package oop.oop1.oop4;

public class Main {
    public static void main(String[] args) {
        RegularPolygon polygon1 = new RegularPolygon();
        RegularPolygon polygon2 = new RegularPolygon(6, 4);
        RegularPolygon polygon3 = new RegularPolygon(10, 4, 5.6, 7.8);

        System.out.printf("Polygon 1 - Perimeter: = %.2f, Area: = %.2f%n", polygon1.getPerimeter(),polygon1.getArea());
        System.out.printf("Polygon 2 - Perimeter: = %.2f, Area: = %.2f%n", polygon2.getPerimeter(),polygon2.getArea());
        System.out.printf("Polygon 3 - Perimeter: = %.2f, Area: = %.2f%n", polygon3.getPerimeter(),polygon3.getArea());


    }
}
