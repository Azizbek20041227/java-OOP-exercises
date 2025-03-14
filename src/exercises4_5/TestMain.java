package exercises4_5;

public class TestMain {
    public static void main(String[] args) {

        Shape s1 = new Circle( "blue", false, 5.5);
        System.out.println(s1);

        Circle c1 = new Circle(3.0);
        System.out.println(c1);
        System.out.println("Area: " + c1.getArea());
        System.out.println("Perimeter: " + c1.getPerimeter());

        Rectangle r1 = new Rectangle("yellow", true,2.0, 4.0);
        System.out.println(r1);
        System.out.println("Area: " + r1.getArea());
        System.out.println("Perimeter: " + r1.getPerimeter());

        Square sq1 = new Square(3.0);
        System.out.println(sq1);
    }
}
