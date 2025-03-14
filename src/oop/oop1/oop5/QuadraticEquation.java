package oop.oop1.oop5;

public class QuadraticEquation {
    double a;
    double b;
    double c;

    QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    double getDiscriminant(){
        return (b * b) - (4 * a * c);
    }
    double getRoot1(){
        double d = getDiscriminant();
        return (-b + Math.sqrt(d)) / (2 * a);
    }
    double getRoot2(){
        double d = getDiscriminant();
        return (-b - Math.sqrt(d)) / (2 * a);
    }
}
