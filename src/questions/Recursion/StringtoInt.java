/*
write a recursive function to convert a given string into the number it represents. That is input will be a numeric string that contains only numbers, you need to convert the string into a corresponding integer and return the answer.

Sample Input:
“2029”

Sample Output:
2029
*/
package questions.Recursion;

import java.util.Scanner;

public class StringtoInt {
    static int res = 0;
    public static  int convert(String s , int currentIndex)
    {
        if(currentIndex==s.length()) return res;
        res += Integer.parseInt(String.valueOf(s.charAt(currentIndex)))*Math.pow(10,s.length()-currentIndex-1);
        return convert(s,currentIndex+1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(convert(s,0));
    }
}
