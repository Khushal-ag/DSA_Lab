/*
Write a program to input the elements of a two-dimensional array. Then from this array, make two arrays
one that stores all odd elements of the two-dimensional array and the other that stores all even elements of the array.
*/
package questions.Arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EvenOddArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of rows : ");
        int r = sc.nextInt();
        System.out.print("Enter no. of columns : ");
        int c = sc.nextInt();
        int[][] arr = new int[r][c];
        List<Integer> even = new ArrayList<>();
        List<Integer> odd = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter Array["+i+"] -> ");
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
                if(arr[i][j]%2==0) even.add(arr[i][j]);
                else odd.add(arr[i][j]);
            }
        }
        System.out.println("Even Array ->");
        for(var i:even) System.out.print(i+" ");
        System.out.println();
        System.out.println("Odd Array ->");
        for(var i:odd) System.out.print(i+" ");
    }
}
