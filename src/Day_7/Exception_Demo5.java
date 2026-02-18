package Day_7;

import java.util.Scanner;
class CheckArgument extends Exception {
}
class ArgumentDemo {
    static void processInput() throws CheckArgument {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[4];
        System.out.println("Enter 4 numbers:");
        for (int i = 0; i < 4; i++) {
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < 4; i++) {
            sum += arr[i] * arr[i];
        }
        System.out.println("Output: " + sum);
    }
    public static void main(String[] args) {
        try {
            processInput();
        } catch (CheckArgument e) {
            System.out.println("Exception occurred - CheckArgument");
        }
    }
}
