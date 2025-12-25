import java.util.Scanner;
class Rect {
    double length;
    double breadth;

    Rect() {
        length = 0;
        breadth = 0;
    }

    Rect(double l, double b) {
        System.out.println();
        length = l;
        breadth = b;
    }
    Rect(double side) {
        length = side;
        breadth = side;
    }

    void displayArea() {
        System.out.println("Area: " + (length * breadth));
    }
}

public class Test {
    public static void main(String[] args) {
        Rect r1 = new Rect();
        Rect r2 = new Rect(5, 3);
        Rect r3 = new Rect(4);
        r1.displayArea();
        r2.displayArea();
        r3.displayArea();
    }
}
