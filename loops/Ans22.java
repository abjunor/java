package language.Java.loops;
import java.util.Scanner;

public class Ans22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        while (number>0) {
            
        if (number==2) { System.out.println("2");break;}
       
        else if (number%2 == 0) {        number/=2 ;    
            System.out.print("2 * ");
        } 

        else if (number==3) { System.out.println("3");break;}

        else if (number%3 ==0) {        number/=3 ;
            System.out.print("3 * ");
        } 
        
        else if (number==5) { System.out.println("5");break;}
        else if (number%5 ==0){     number/=5 ;

            System.out.print("5 * ");
        }
        
        else if (number == 1){break;}
        else{   System.out.print("It is a prime no"); break;}
        
         }
        
    }
}
