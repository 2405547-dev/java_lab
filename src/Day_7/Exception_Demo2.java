package Day_7;

import java.util.Scanner;
public class Exception_Demo2 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a:");
        int a=scanner.nextInt();
        System.out.print("Enter b:");
        int b=scanner.nextInt();
        try{
            int div=a/b;
        }
        catch(ArithmeticException e){
            System.out.println("Math error try again");
        }
        finally{
            System.out.println("ArithmeticException caught by try-catch-finally block");
        }
    }

}
