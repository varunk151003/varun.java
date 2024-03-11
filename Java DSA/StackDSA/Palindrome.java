package StackDSA;

import java.util.*;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        if (isPalindrome(input)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
        scanner.close();
    }

    public static boolean isPalindrome(String str) {
        Stack<Character> stack = new Stack<>();
        int length = str.length();
        int mid = length / 2;

        for (int i = 0; i < mid; i++) {
            stack.push(str.charAt(i));
        }

        int startIndex;
        if (length % 2 == 0) {
            startIndex = mid;
        } else {
            startIndex = mid + 1;
        }

        for (int i = startIndex; i < length; i++) {
            if (stack.isEmpty() || stack.pop() != str.charAt(i)) {
                return false;
            }
        }

        return true;
    }
}
