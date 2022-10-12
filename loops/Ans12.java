package language.Java.loops;

import java.util.Scanner;

public class Ans12 {
    public static void main(String[] args) {
        // 12. Write a C program to find sum of first and last digit of a number
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int count = 0;
        int number1 =number;
        int firstNo = number%10;
        System.out.println("first no is "+firstNo);

        while (!(number1 == 0)) {
           count++;
           number1 = number1/10;
            }
     
            for (int i = 1; i < count ; i++) {
                number = number/10;
            }
         int lastNo = number;
         System.out.println("last no is "+lastNo);

         System.out.println("sum is "+(lastNo+firstNo));
    }
}
