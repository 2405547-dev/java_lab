package Day_7;

import java.util.Scanner;
class NegativeNumberException extends Exception{
}
class Exception_Demo3 {
    static void ProcessInput(int num) throws NegativeNumberException {
        if (num < 0) {
            throw new NegativeNumberException();
        } else {
            System.out.println("Double value:" + num * 2);
        }
    }

    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the number:");
        int num=scanner.nextInt();
        try{
            ProcessInput(num);
        }
        catch(NegativeNumberException e){
            System.out.println("Caught the exception");
            System.out.println("Exception occurred "+ e);
        }
    }
}