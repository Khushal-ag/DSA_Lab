/*
In a string S, remove consecutive duplicates from it recursively.

Sample Input 1 :
aabccba
Sample Output 1 :
abcba
*/

package questions.Recursion;

import java.util.Scanner;

public class StringDuplicate {
    static String res = "";
    public static String dup(String s,int currentIndex)
    {
        if(currentIndex==s.length()) return res;
        if(s.charAt(currentIndex)!=s.charAt(currentIndex-1)) res += s.charAt(currentIndex);
        return dup(s, currentIndex+1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        res += s.charAt(0);
        System.out.println(dup(s,1));
    }
}
