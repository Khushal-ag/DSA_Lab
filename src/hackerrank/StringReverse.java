package hackerrank;

import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        String s = sc.next();
        String s1 = "";
        for(int i=s.length()-1;i>=0;i--)
        {
            s1 += s.charAt(i);
        }
        if(s1.equals(s)) {
            System.out.println("Yes");
        } else System.out.println("No");
    }
}
