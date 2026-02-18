package Day_5;

import java.util.Scanner;

interface Employee {
    void getDetails();
}

interface Manager extends Employee {
    void getDeptDetails();
}

class Head implements Manager {

    int empId;
    String empName;
    String deptId;
    String deptName;

    Scanner sc = new Scanner(System.in);

    public void getDetails() {
        System.out.print("Enter Employee Id: ");
        empId = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Employee Name: ");
        empName = sc.nextLine();
    }

    public void getDeptDetails() {
        System.out.print("Enter Department Id: ");
        deptId = sc.nextLine();

        System.out.print("Enter Department Name: ");
        deptName = sc.nextLine();
    }

    void display() {
        System.out.println("\nEmployee Id:- " + empId);
        System.out.println("Employee Name:- " + empName);
        System.out.println("Department Id:- " + deptId);
        System.out.println("Department Name:- " + deptName);
    }
}

class Prog_5_3 {
    public static void main(String[] args) {
        Head h = new Head();
        h.getDetails();
        h.getDeptDetails();
        h.display();
    }
}
