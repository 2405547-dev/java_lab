import java.util.Scanner;
class Student{
    String name;
    int rollno;
    String section;
    String branch;
    Student(String name,int rollno,String section,String branch){
        this.name=name;
        this.rollno=rollno;
        this.section=section;
        this.branch=branch;
    }
}

public class Prog_1.1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Name: ");
        String name = scan.nextLine();
        System.out.print("Enter Roll No: ");
        int rollno = scan.nextInt();
        scan.nextLine();
        System.out.print("Enter Section: ");
        String section = scan.nextLine();
        System.out.print("Enter Branch: ");
        String branch = scan.nextLine();
        Student student1= new Student(name, rollno, section, branch);
        System.out.println("Name: " + student1.name);
        System.out.println("Roll No: " + student1.rollno);
        System.out.println("Section: " + student1.section);
        System.out.println("Branch: " + student1.branch);
        scan.close();
    }
}

