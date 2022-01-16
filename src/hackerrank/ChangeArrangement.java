/*
There are N students in a classroom and they are seated in a linear order. The teacher plans
to change the seating arrangement of all the students in such a way that each student
sits on the new bench everyday. For example, student sitting at first bench moves to the
second bench.

Sample Input 0
6
James Logan Mason Jacob Lucas Ethan

Sample Output 0
Ethan James Logan Mason Jacob Lucas
*/

package hackerrank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ChangeArrangement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<String> l = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            l.add(sc.next());
        }
        System.out.print(l.get(l.size()-1)+" ");
        for (int i = 0; i < l.size()-1; i++) {
            System.out.print(l.get(i)+" ");
        }
    }
}
