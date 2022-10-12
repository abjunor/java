package language.Java.loops;

import java.util.Scanner;

public class Ans2 {
    public static void main(String[] args) {
        // 2. Write a C program to print all natural numbers in reverse (from n to 1). - using while loop
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n>1) {
           

            System.out.println(n--);
            
        }
        System.out.println(n);
    }
}
