package language.Java.loops;

import java.util.Scanner;

public class Ans10 {
    public static void main(String[] args) {
        // 10. Write a C program to count number of digits in a number.

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int count = 0;
       while (!(number == 0)) {
           count++;
           number = number/10;
            }
            System.out.println(count);
       }
    }