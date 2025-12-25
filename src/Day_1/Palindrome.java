import java.util.Scanner;

class Palindromeno {
    int number;
    Palindromeno(int number) {
        this.number = number;
    }
    boolean isPalindrome() {
        int temp = number;
        int rev = 0;

        while (temp != 0) {
            int digit = temp % 10;
            rev = rev * 10 + digit;
            temp = temp / 10;
        }

        return rev == number;
    }
}

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        Palindromeno p = new Palindromeno(num);

        if (p.isPalindrome()) {
            System.out.println(num + " is a Palindrome Number");
        } else {
            System.out.println(num + " is Not a Palindrome Number");
        }
    }
}

