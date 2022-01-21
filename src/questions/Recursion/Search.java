/*
Create an array of 5 elements with values {1,2,4,2,6}.search value 2 in the given array and
print the first occurrence(index) of search value. Do it recursively
The prototype of the method is as follows
public static int find(int arr[ ], int currentIndex, int search_value)
{
    // set of statements;
}
*/
package questions.Recursion;

import java.util.Scanner;

public class Search {
    public static int find(int[] arr, int currentIndex, int search_value)
    {
        if (currentIndex==arr.length) return -1;
        if(arr[currentIndex] == search_value) return currentIndex;
        return find(arr,currentIndex+1,search_value);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        int res = find(arr,0,x);
        if(res>=0) System.out.println("Find at index = "+res);
        else System.out.println("Not found");
    }
}
