package Day_6.Marketing;
import java.util.Scanner;
import General.employee;
public class sales extends employee {
    sales(int empid, String ename, double basic) {
        super(empid, ename, basic);
    }
    double tallowance() {
        return 0.05 * earnings();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the employee id and employee name:");
        int id = scanner.nextInt();
        String name = scanner.next();
        System.out.print("Enter basic salary:");
        double basic = scanner.nextDouble();
        sales sal = new sales(id, name, basic);
        double total = sal.earnings();
        System.out.println("The emp id of the employee is " + sal.empid);
        System.out.println("The total earning is " + total);
    }
}
