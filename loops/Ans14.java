package language.Java.loops;

import java.util.Scanner;

public class Ans14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int number = sc.nextInt();
        int sum = 0;
        while (number > 0) {
           int last = number%10;
           number = number/10;
           sum = sum +last;
        }
        System.out.println("the sum of digits of a number is "+sum);
    }
}
