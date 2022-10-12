package language.Java.loops;

import java.util.Scanner;

public class Ans15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        int temp = number;
        int product = 1 ;
        int lastnumber = 0;
        while (number >0) {
            
            lastnumber = number%10;

            product *= lastnumber;

            number/=10;
        }
       number = temp;
        System.out.println("The product of digit of  "+number+" is "+product);
        

        
    }
}
 