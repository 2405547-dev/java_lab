package Day_7;
import java.util.Scanner;

class Exception_Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[4];

        System.out.println("Enter 5 numbers (array size is 4):");

        try {
            for (int i = 0; i < 5; i++) {
                arr[i] = sc.nextInt();
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught: " + e);
        }

        sc.close();
    }
}
