package Day_6;

import java.util.Scanner;
class University {
    String universityName;
    String location;
    Scanner scanner = new Scanner(System.in);

    void uniDetails() {
        System.out.print("Enter university name:");
        universityName = scanner.nextLine();
        System.out.print("Enter location:");
        location = scanner.nextLine();
    }

    class Department {
        String deptName;
        String hodName;

        void deptDetails() {
            System.out.print("Enter department name:");
            deptName = scanner.nextLine();
            System.out.print("Enter HOD name:");
            hodName = scanner.nextLine();
        }

        void display() {
            System.out.println("University name:" + universityName);
            System.out.println("Location:" + location);
            System.out.println("Department name:" + deptName);
            System.out.println("HOD name:" + hodName);
        }
    }
}
public class Universitydetail{
    public static void main(String[] args){
        University u=new University();
        u.uniDetails();
        University.Department d=u.new Department();
        d.deptDetails();
        d.display();
    }
}


