package oop.oop1.oop4;

class RegularPolygon {
    int n;
    double side;
    double x;
    double y;

    RegularPolygon(){
        n = 3;
        side = 1;
        x = 0;
        y = 0;
    }
    RegularPolygon(int n, double side) {
        this.n = n;
        this.side = side;
        this.x = 0;
        this.y = 0;
    }

    RegularPolygon(int n, double side, double x, double y) {
        this.n = n;
        this.side = side;
        this.x = x;
        this.y = y;
    }
    double getPerimeter() {
        return n * side;
    }

    double getArea() {
        return (n * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / n));
    }

}
