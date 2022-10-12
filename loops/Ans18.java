package language.Java.loops;
import java.util.Scanner;

public class Ans18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
       


        int one = 0;
        int two = 0;
        int three = 0;
        int four = 0;
        int five = 0;
        int six = 0;
        int seven = 0;
        int eight = 0;
        int nine = 0;
        int zero = 0;
  
        while (number>0){
            int lastnumber =number%10;
            
            switch (lastnumber) {
                case 1:
                     one += 1;
                    break;
                case 2: 
                     two += 1;
                    break;
                    
                case 3: 
                     three += 1;
                    break;
                case 4: 
                 four += 1;
                break;
                case 5: 
                 five += 1;
                break;
                case 6: 
                 six += 1;
                break;
                case 7: 
                 seven += 1;
                break;
                case 8: 
                 eight += 1;
                break;
                case 9: 
                 nine += 1;
                break;
                case 0: 
                 zero += 1;
                break;
            }

            number/=10;

           
        }
    
        System.out.println(" one  "+one );
        System.out.println(" two "+two );
        System.out.println(" three "+three );
        System.out.println(" four "+four );
        System.out.println(" five "+five );
        System.out.println(" six "+six );
        System.out.println(" seven "+seven );
        System.out.println(" eight "+ eight);
        System.out.println(" nine "+ nine);
        System.out.println("  zero"+zero );
       
    
    }}