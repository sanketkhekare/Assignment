
/*
 * Developer: Sanket Khekare
 * 
 * Write any Java or C#  program that will have the following statement as one of the lines in the code.
 *  It should not be part of a comment or String. It should be a valid Java  or C# Expression.
 *   Program does not have to read or print anything. And it should compile and run without errors.
 
a.b.c = c.b.a;
 */


import java.util.Stack;

public class  program1 {

public static void main(String[] args) {
    // TODO Auto-generated method stub
 String s="a.b.c";
 reverse(s);
}

private static void reverse(String s) {
    // TODO Auto-generated method stub
    Stack st=new Stack<>();

    char[] r=s.toCharArray();
    for(char a:r) {
        st.push(a);
    }
    System.out.println("Output:-");

    while(!st.isEmpty()) {
        System.out.print(st.pop());
    }

}

}
