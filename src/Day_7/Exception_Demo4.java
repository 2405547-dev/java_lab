package Day_7;

import java.util.Scanner;
class HrsException extends Exception {
}
class MinException extends Exception {
}
class SecException extends Exception {
}
class Time {
     static void getTime() throws CheckArgument, MinException, SecException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter hours: ");
        int hours = sc.nextInt();
        if (hours < 0 || hours > 24) {
            throw new CheckArgument();
        }
        System.out.print("Enter minutes: ");
        int minutes = sc.nextInt();
        if (minutes < 0 || minutes > 60) {
            throw new MinException();
        }
        System.out.print("Enter seconds: ");
        int seconds = sc.nextInt();
        if (seconds < 0 || seconds > 60) {
            throw new SecException();
        }
        System.out.println("Correct Time -> " + hours + ":" + minutes + ":" + seconds);
    }
}
class TimeDemo {
    public static void main(String[] args) {
        try {
            Time.getTime();
        } catch (CheckArgument e) {
            System.out.println("Invalid Hours");
        } catch (MinException e) {
            System.out.println("Invalid Minutes");
        } catch (SecException e) {
            System.out.println("Invalid Seconds");
        }
    }
}
