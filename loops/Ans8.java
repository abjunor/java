package language.Java.loops;

import java.util.Scanner;

public class Ans8 {
    public static void main(String[] args) {
        // 8. Write a C program to find sum of all odd numbers between 1 to n.
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            if ((i%2)==1) {
                sum +=i;
            }
        }
        System.out.println(sum);
    }
}
