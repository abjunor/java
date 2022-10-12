package language.Java.loops;

import java.util.Scanner;

public class Ans6 {
    public static void main(String[] args) {
        // 6. Write a C program to find sum of all natural numbers between 1 to n.
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= num; i++) {
             sum +=i;
        }
        System.out.println(sum);
    }
}
