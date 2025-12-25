import java.util.Scanner;
class Box{
    double length;
    double width;
    double height;
    Box() {
        this.length = length;
        this.width = width;
        this.height = height;
    }
    double Volume(double length,double width,double height){
        double volume=length * width * height;
        return volume;
    }
}

class Demo{
    public static void main(String[] args) {
        float l;
        float w;
        float h;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter length:");
        l = scanner.nextFloat();
        System.out.print("Enter width:");
        w=scanner.nextFloat();
        System.out.print("Enter height:");
        h = scanner.nextFloat();
        Box box1=new Box();
        System.out.print("Volume is:" +box1.Volume(l,w,h));
    }
}
