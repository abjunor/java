import java.util.*;
public class BackspaceString {
    public static boolean backspaceCompare(String s, String t) {
        System.out.println(nettstring(s));
        System.out.println(nettstring(t));
        return true;
    }

    public static String nettstring(String s){
        StringBuffer nett=new StringBuffer();
       Stack<Character>stack=new Stack<>();
    //    for(int i=s.length()-1;i>=0;i--){
    //        stack.push(s.charAt((i)));
    //    }

    for(int i=0;i<s.length();i++){
        // stack.push(s.charAt((i)));
        if(s.charAt(i)=='#'){
            if(!stack.isEmpty()){
                stack.pop();
                // System.out.println(stack.pop());
                 continue;
            }
        }
        stack.push(s.charAt(i));
    }
    System.out.println(stack);
    String res1 = "";
        // String res2 = "";
        while(!stack.isEmpty())
            res1 += stack.pop();
     return res1;
    // return null;

    }

    public static void main(String[] args) {
        backspaceCompare("ab#c","ad#c");
    }

}
