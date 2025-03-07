package oop5;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Kiriting a,b,c: ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        QuadraticEquation equation = new QuadraticEquation(a,b,c);
        double discriminant = equation.getDiscriminant();

        if (discriminant > 0) {
            System.out.printf("Root 1: %.2f%n",equation.getRoot1());
            System.out.printf("Root 2: %.2f%n",equation.getRoot2());
        } else if (discriminant == 0) {
            System.out.printf("Root 1: %.2f%n",equation.getRoot1());
        } else {
            System.out.println("The equation has no roots.");
        }
    }
}
