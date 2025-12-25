import java.util.Scanner;
class DayNo {
    int dayNo;
    DayNo(int dayNo) {
        this.dayNo = dayNo;
    }
    void printWeekDay() {
        switch (dayNo) {
            case 1:  System.out.println("Sunday"); break;
            case 2:  System.out.println("Monday"); break;
            case 3:  System.out.println("Tuesday"); break;
            case 4:  System.out.println("Wednesday"); break;
            case 5:  System.out.println("Thursday"); break;
            case 6:  System.out.println("Friday"); break;
            case 7:  System.out.println("Saturday"); break;
            default:
                System.out.println("Invalid");
        }
    }
}
public class Prog_1.3{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter day number:");
        int d = scanner.nextInt();
        DayNo week1 = new DayNo(d);
        week1.printWeekDay();
    }
}

