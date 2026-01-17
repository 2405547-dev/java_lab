import java.util.Scanner;
class Grade {
    int mark;

    Grade(int mark) {

        this.mark = mark;
    }

    void printGrade() {
        if (mark >= 90)
            System.out.println("Grade: O");
        else if (mark >= 80)
            System.out.println("Grade: E");
        else if (mark >= 70)
            System.out.println("Grade: A");
        else if (mark >= 60)
            System.out.println("Grade: B");
        else
            System.out.println("Grade: C");
    }
}
public class Prog_1_2{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter marks: ");
        int m = scanner.nextInt();

        Grade grade1 = new Grade(m);
        grade1.printGrade();
    }
}



