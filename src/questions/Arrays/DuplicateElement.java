// Write a program to find whether the array of integers contains a duplicate number.
// if yes print the location where duplicate numbers are found.
package questions.Arrays;

import java.util.Scanner;

public class DuplicateElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] hash = new int[2^32 - 10];
        int[] arr = new int[10];
        int[] result = new int[10];
        int index = 0;
        System.out.print("Enter array : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            if(hash[arr[i]] != 0){
                result[index] = i;
                index++;
            }
            else hash[arr[i]]++;
        }
        System.out.println("Duplicate are present on indexes : ");
        for (int i=0;i<index;i++) {
            System.out.print(result[i]+" , ");
        }
        System.out.print("\b\b");
    }
}
