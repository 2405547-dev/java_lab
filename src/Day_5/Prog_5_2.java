package Day_5;
import java.util.Scanner;
interface Employee {
    void earnings();
    void deductions();
    void bonus();
}
abstract class Manager implements Employee {
    double basic, da, hra, pf;
    Manager(double basic) {
        this.basic = basic;
    }

    public void earnings() {
        da = 0.80 * basic;
        hra = 0.15 * basic;
        double totalEarnings = basic + da + hra;
        System.out.println("Earnings - " + totalEarnings);
    }

    public void deductions() {
        pf = 0.12 * basic;
        System.out.println("Deduction - " + pf);
    }
}

class Substaff extends Manager {

    Substaff(double basic) {
        super(basic);
    }

    public void bonus() {
        double bonusAmt = 0.50 * basic;
        System.out.println("Bonus - " + bonusAmt);
    }
}

class Prog_5_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Basic Salary: ");
        double basic = sc.nextDouble();

        Substaff s = new Substaff(basic);

        s.earnings();
        s.deductions();
        s.bonus();

        sc.close();
    }
}

