package language.Java.loops;

import java.util.Scanner;

public class Ans13 {
    public static void main(String[] args) {
        // 13. Write a C program to swap first and last digits of a number.

        // int n, f, l, r = 0, tmp, swap, c, d;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number:\n");
        // n = s.nextInt();
        // tmp = n;
        // l = n % 10;
        // while (n > 10) {
        //     n = n / 10;
        // }
        // f = n;
        // n = tmp / 10;
        // while (n > 10) {
        //     c = n % 10;
        //     r = r * 10 + c;
        //     n = n / 10;
        // }
        // swap = l;
        // while (r > 0) {
        //     d = r % 10;
        //     swap = swap * 10 + d;
        //     r = r / 10;
        // }
        // swap = swap * 10 + f;
        // System.out.println("After swap:" + swap);

        
        int number = s.nextInt();
        int temp = number;
        
        int lastNumber = number%10;
        System.out.println("Last Number is "+lastNumber);
        
        int count = 0;

        while (number>10) {
            count++;
            number= number/10;
        }
        int firstnumber = number;
        System.out.println("First Number is "+firstnumber);

        number = temp;
        number = number/10;
        int middleNumber =0;
         middleNumber = middleNumber + number% (int)Math.pow(10, count -1);
        System.out.println("middle number is "+middleNumber);

        int swpno = (lastNumber*(int)Math.pow(10, count)) + (middleNumber*10) + firstnumber;

        System.out.println(swpno);

    }
}
