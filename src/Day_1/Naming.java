import java.util.Scanner;
class Name {
    String firstname;
    String secondname;
    Name(String firstname, String secondname) {
        this.firstname = firstname;
        this.secondname = secondname;
    }
    void printLastFirst() {

        System.out.println(secondname+ " " + firstname);
    }
}
public class Naming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first name: ");
        String f = scanner.nextLine();
        System.out.print("Enter second name: ");
        String s = scanner.nextLine();
        Name name1 = new Name(f, s);
        name1.printLastFirst();
    }
}
