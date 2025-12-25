import java.util.Scanner;

class Student5 {
    int roll;
    String name;
    double cgpa;

    Student5(int roll, String name, double cgpa) {
        this.roll = roll;
        this.name = name;
        this.cgpa = cgpa;
    }

    void display() {
        System.out.println("Roll No: " + roll + ", Name: " + name + ", CGPA: " + cgpa);
    }
}

public class Prog_2.5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine();

        Student5 [] students = new Student5[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter details of student " + (i + 1) + ":");
            System.out.print("Roll No: ");
            int roll = sc.nextInt();
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("CGPA: ");
            double cgpa = sc.nextDouble();
            sc.nextLine();

            students[i] = new Student5(roll, name, cgpa);
        }

        System.out.println("Details of all students:");
        for (Student5 s : students) {
            s.display();
        }


        Student5 lowestCgpaStudent = students[0];
        for (int i = 1; i < n; i++) {
            if (students[i].cgpa < lowestCgpaStudent.cgpa) {
                lowestCgpaStudent = students[i];
            }
        }

        System.out.println("Student with lowest CGPA:");
        System.out.println("Name: " + lowestCgpaStudent.name + ", CGPA: " + lowestCgpaStudent.cgpa);

        sc.close();
    }
}

