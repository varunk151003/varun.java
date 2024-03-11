package StackDSA;

import java.util.Scanner;

public class StackOperation {

    static int i = 0;

    static Scanner sc = new Scanner(System.in);

    static void push(int n, int[] arr) {
        if (i >= arr.length) {
            System.out.println("The Stack is full");
        } else {
            arr[i] = n;
            i++;
        }
    }

    static void peek(int arr[]) {
        if (i > 0) {
            System.out.println(arr[i - 1]);
        } else {
            System.out.println("The stack is Empty");
        }
    }

    static void pop(int n, int arr[]) {
        if (i > 0) {
            arr[i - 1] = 0;
            i--;
        } else {
            System.out.println("The stack is Empty");
        }
    }

    static void display(int arr[]) {
        for (int j = 0; j < i; j++) {
            System.out.print(arr[j] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int[] stk = new int[10];
        push(3, stk);
        push(5, stk);
        push(7, stk);

        pop(1, stk);
        display(stk);
    }

}
