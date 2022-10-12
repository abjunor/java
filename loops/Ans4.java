package language.Java.loops;
public class Ans4 {
    public static void main(String[] args) {
        // 4. Write a C program to print all even numbers between 1 to 100. - using while loop
        int i = 2 ;
        while (1<=i && i<=100) {
            if ((i%2)==0) {
                System.out.println("even");
            }
            
            i++;
        }
        
    }
}