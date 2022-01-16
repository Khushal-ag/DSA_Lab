/*
Write a short Java function that takes an array of int values
as an argument and determines if there is a pair of numbers
in the array whose product is odd.
*/

package questions.Arrays;

import java.util.Scanner;

public class OddProduct {
    public static boolean chkProduct(int[] arr)
    {
        for (int i = 0; i < arr.length-1; i++) {
            for (int k : arr) {
                if ((arr[i] * k) % 2 == 1) return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of element = ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter Array -> ");
        for (int i = 0; i <arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        if(chkProduct(arr)) System.out.println("Present");
        else System.out.println("Not Present");
    }
}
