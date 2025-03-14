package exercises4_4;

public class TestMain {
    public static void main(String[] args) {

        Point p = new Point(2, 3);
        System.out.println("Point: " + p);

        MovablePoint mp = new MovablePoint(2, 3, 1, 1);
        System.out.println("Before move: " + mp);
        mp.move();
        System.out.println("After move: " + mp);
    }
}
