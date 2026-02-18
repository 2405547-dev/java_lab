package Day_4;

import java.util.Scanner;

abstract class Student {
    int rollno;
    int regno;

    Student() {
    }

    void getInput() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Roll No: ");
        rollno = sc.nextInt();

        System.out.print("Enter Reg No: ");
        regno = sc.nextInt();
    }

    abstract void course();

    void display() {
        System.out.println("Roll No: " + rollno);
        System.out.println("Reg No: " + regno);
        course();   // Calls subclass implementation
    }
}

class Kirtiam extends Student {

    Kirtiam() {
        super();
    }

    void course() {
        System.out.println("Course: B.Tech - Computer Science & Engineering");
    }
}

public class Prog_4_2 {
    public static void main(String[] args) {

        Student st = new Kirtiam();   // Polymorphism

        st.getInput();
        st.display();
    }
}

