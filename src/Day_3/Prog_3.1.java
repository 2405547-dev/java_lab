import java.util.Scanner;
class TwoD {
    double length;
    double breadth;
    int square = 40;

    TwoD(double length,double breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    double sCost(){
        return length*breadth*square;
    }
}
class ThreeD extends TwoD{
    double height;
    int cubic=60;
    ThreeD(double length,double breadth,double height){
        super(length,breadth);
        this.height=height;
    }
    double bCost(){
        return length*breadth*height*cubic;
    }
}
class Prog_3.1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter length:");
        double length = scanner.nextFloat();
        System.out.print("Enter breadth:");
        double breadth = scanner.nextFloat();
        TwoD sheet = new TwoD(length, breadth);
        System.out.print("Enter height:");
        double height = scanner.nextFloat();
        ThreeD box = new ThreeD(length, breadth, height);
        System.out.println("Cost of plastic sheet:"+ sheet.sCost());
        System.out.println("Cost of plastic box:"+ box.bCost());
    }
}
