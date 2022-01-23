/*
From the given set of values in the array, the children inside the array is the element which is the smallest
among all the elements present in the right of it and the rightmost element is always a child.

Sample Input 0
6
2 5 3 4 17 16

Sample Output 0
2 3 4 16
*/
package hackerrank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ChildrenPlay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        List<Integer> res = new ArrayList<>();
        int min = Integer.MAX_VALUE;
        for (int i = arr.length-1; i >= 0 ; i--) {
            if(arr[i] < min) res.add(arr[i]);
            min = Math.min(min,arr[i]);
        }
        for (int i = res.size()-1; i >=0 ; i--) {
            System.out.print(res.get(i)+" ");
        }
    }
}
