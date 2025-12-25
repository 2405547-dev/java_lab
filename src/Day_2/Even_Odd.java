import java.util.Scanner;
class Counter {
    int evencount = 0;
    int oddcount = 0;
    Counter(int[] numbers) {
        for (int i = 0; i < 10; i++) {
            if (numbers[i] % 2 == 0)
                evencount++;
            else
                oddcount++;
        }
    }
}
public class Even_Odd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];

        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < 10; i++) {
            numbers[i] = scanner.nextInt();
        }
        Counter counter = new Counter(numbers);
        System.out.println("Even numbers: " + counter.evencount);
        System.out.println("Odd numbers: " + counter.oddcount);
    }
}
