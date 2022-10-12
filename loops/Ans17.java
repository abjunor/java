package language.Java.loops;

import java.util.Scanner;

public class Ans17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int temp = number;
        int reverse=0,num=0;
       
        
        while (number >0) {
            
            
             num = number%10;
            
             reverse = reverse+ num;
            
            reverse *=10;
            
            number = number/10;

        }
        reverse /=10;
        number = temp;
        if (number == reverse) {
            System.out.println("it is a palindrome no");
        }
        else System.out.println("it is not a palindrome no ");
    }
}
