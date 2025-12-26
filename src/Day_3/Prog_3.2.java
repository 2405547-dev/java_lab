import java.util.Scanner;
class Plate{
    double length;
    double width;
    Plate(double length,double width){
        this.length=length;
        this.width=width;
        System.out.println("Plate dimensions");
        System.out.println("Length:"+ length +" Width:"+ width);
    }
}
class Box extends Plate{
    double height;
    Box(double length,double width,double height){
        super(length,width);
        this.height=height;
        System.out.println("Box dimensions");
        System.out.println("Height:"+ height);
    }
}
class Woodbox extends Box{
    double thick;
    Woodbox(double length,double width,double height,double thick){
        super(length,width,height);
        this.thick=thick;
        System.out.println("Woodbox dimensions");
        System.out.println("Thick:"+ thick);
    }
}
class Prog_3.2{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter length:");
        float length=scanner.nextFloat();
        System.out.print("Enter width:");
        float width=scanner.nextFloat();
        System.out.print("Enter height:");
        float height=scanner.nextFloat();
        System.out.print("Enter thick:");
        float thick=scanner.nextFloat();
        Woodbox w=new Woodbox(length,width,height,thick);
        scanner.close();
    }
}
