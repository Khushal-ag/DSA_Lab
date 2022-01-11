/*Write a program to remove consecutive duplicate elements in an array.
Input values
10 10 30 30 40 50 50 50 9 45

Output
10 30 40 50 9 45
*/
package questions.Arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class removeDup {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of elements : ");
        int n = sc.nextInt();
        List<Integer> l = new ArrayList<>();
        System.out.print("Enter Array : ");
        for (int i = 0; i < n; i++) {
            l.add(sc.nextInt());
        }
        for (int i = 1; i < l.size(); i++) {
            if(l.get(i)==l.get(i-1)) {
                l.remove(i);
                i--;
            }
        }
        System.out.print("Final Array -> ");
        for (var i:l) {
            System.out.print(i+" ");
        }
    }
}
