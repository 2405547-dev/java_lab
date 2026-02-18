package Day_8;

import java.util.Scanner;

public class StringDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the string:");
        String name = scanner.next();

        System.out.println("Case changed:" + name.toUpperCase());
        System.out.println("Case changed:" + name);
        StringBuffer sb = new StringBuffer(name);
        String reversed = sb.reverse().toString();
        System.out.println("Reversed string:" + reversed);
        System.out.println("String inserted:" + sb.insert(3, "Java"));
        System.out.println("Uppercase characters:" + name.toUpperCase());
        System.out.println("Lowercase characters:" + name.toLowerCase());
        int pos = name.indexOf("J");
        if (pos != -1) {
            System.out.println("Substring found at index: " + pos);
        } else {
            System.out.println("Substring not found");
        }
        if (name.equals(reversed)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a palindrome");
        }
        name = name.trim();
        int words = 1;
        int vowels = 0, consonants = 0;
        for (int i = 0; i < name.length(); i++) {
            char ch = Character.toLowerCase(name.charAt(i));
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                vowels++;
            else if (ch != ' ')
                consonants++;
            if (ch == ' ')
                words++;
        }
        System.out.println("Words: " + words);
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }
}
