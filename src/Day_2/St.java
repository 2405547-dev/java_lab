import java.util.Scanner;
class Objectcount{
    static int count=0;
    Objectcount() {
        count++;
    }
}
class St {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter no of objects to create:");
        int num=scanner.nextInt();
        for(int i=0;i<num;i++){
            Objectcount o1=new Objectcount();
        }
        System.out.print("No of objects created: "+Objectcount.count);
    }
}