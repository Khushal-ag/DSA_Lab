/*
Given an input string S and two characters char1 and char2, you need to replace every
occurrence of character c1 with character c2 in the given string. Do this recursively.

Sample Input :
abaca
a x
Sample Output :
xbxcx
*/
package questions.Recursion;

import java.util.Scanner;

public class StringReplace {
    public static void rep(String s,int currentIndex,String c1,String c2){
        if(currentIndex == s.length()) return;
        if(s.charAt(currentIndex)==c1.charAt(0)) System.out.print(c2);
        else System.out.print(s.charAt(currentIndex));
        rep(s, currentIndex+1, c1, c2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String c1 = sc.next();
        String c2 = sc.next();
        rep(s,0,c1,c2);
    }
}
