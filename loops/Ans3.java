package language.Java.loops;
public class Ans3 {
    public static void main(String[] args) {
        // 3. Write a C program to print all alphabets from a to z. - using while loop
        int a = 97  ;
        int z = 122;
        int letter = 97 ;
        while (a<=letter & letter <= z) { 
            
            char numToLetter = (char) letter;
            System.out.println(numToLetter);
            letter = (int)numToLetter;
            letter++;
        }

    }
}
