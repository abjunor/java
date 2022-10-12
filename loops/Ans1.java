package language.Java.loops;
import java.util.Scanner;
public class Ans1 {

    public static void main(String[] args) {
        // 1. Write a C program to print all natural numbers from 1 to n. - using while loop
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        while (i<=n) {
            System.out.println(i++);
        }
    }
}