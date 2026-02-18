import java.util.Scanner;
class Account {
    static int accno = 1000;
    int id;
    String name, type;
    double balance;

    Account(String n, String t, double b) {
        accno++;
        id = accno;
        name = n;
        type = t;
        balance = b;
    }

    void check() {
        System.out.println("AccNo: " + id +
                " Name: " + name +
                " Type: " + type +
                " Balance: Rs " + balance);
    }

    void deposit(double a) {
        balance = balance + a;
    }

    void withdraw(double a) {
        System.out.println("Withdraw method not defined for base Account");
    }
}

class StandardAccount extends Account {

    StandardAccount(String n, double b) {
        super(n, "Standard", b);
    }

    void withdraw(double a) {
        if (a <= 100000 && a <= balance) {
            balance = balance - a;
        }
        else if (a <= 500000 && (a + a * 0.0005) <= balance) {
            balance = balance - (a + a * 0.0005);
        }
        else {
            System.out.println("Standard limit / Insufficient balance");
        }
    }
}

class PremiumAccount extends Account {

    PremiumAccount(String n, double b) {
        super(n, "Premium", b);
    }

    void withdraw(double a) {
        if (a <= 1000000 && a <= balance) {
            balance = balance - a;
        }
        else {
            System.out.println("Premium limit / Insufficient balance");
        }
    }
}

public class Prog_4_1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Account acc;

        System.out.println("1. Standard  2. Premium");
        int ch = sc.nextInt();
        sc.nextLine();

        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Balance: ");
        double balance = sc.nextDouble();

        if (ch == 1)
            acc = new StandardAccount(name, balance);
        else
            acc = new PremiumAccount(name, balance);

        acc.check();

        System.out.print("Enter deposit amount: ");
        double d = sc.nextDouble();
        acc.deposit(d);

        System.out.print("Enter withdraw amount: ");
        double w = sc.nextDouble();
        acc.withdraw(w);

        acc.check();

        sc.close();
    }
}
