import java.util.Scanner;
class Rectangle {
    double length;
    double breadth;
    double area;
    double perimeter;
    Rectangle(float length, float breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    void read() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter length: ");
        length = scanner.nextDouble();
        System.out.print("Enter breadth: ");
        breadth = scanner.nextDouble();
    }
    void Area() {
        area = length * breadth;
    }
    void Perimeter() {
        perimeter = 2 * (length + breadth);
    }
    void display() {
        System.out.println("Area of Rectangle = " + area);
        System.out.println("Perimeter of Rectangle = " + perimeter);
    }
}
public class Prog_2.4{
    public static void main(String[] args) {
        Rectangle r = new Rectangle(0,0);
        r.read();
        r.Area();
        r.Perimeter();
        r.display();
    }
}

