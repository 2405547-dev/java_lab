import java.util.Scanner;
class Account{
    String acc_no;
    double balance;
    Scanner scanner=new Scanner(System.in);
    void Input(){
        System.out.print("Enter account no:");
        this.acc_no=scanner.next();
        System.out.print("Enter balance:");
        this.balance=scanner.nextDouble();
    }
    void Display(){
        System.out.println("Account no:"+acc_no);
        System.out.println("Balance:"+ balance);
    }
}
class Person extends Account{
    String name;
    long aadhar_no;
    void Input(){
        super.Input();
        System.out.print("Enter name:");
        this.name=scanner.next();
        System.out.print("Enter aadhar no:");
        this.aadhar_no=scanner.nextLong();
    }
    void Display(){
        super.Display();
        System.out.println("Name:" +name);
        System.out.println("Aadhar no:"+ aadhar_no);
    }
}
class Prog_3_3 {
    public static void main(String[] args) {
        Person[] p = new Person[3];
        System.out.println("Enter account of 3 person");
        for (int i = 0; i < 3; i++) {
            System.out.println("Person:"+ (i + 1));
            p[i] = new Person();
            p[i].Input();
        }
        System.out.println("Details of 3 person");
        for(int i=0;i<3;i++){
            p[i].Display();
        }
    }
}
