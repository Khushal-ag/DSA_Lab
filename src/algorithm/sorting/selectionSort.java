package algorithm.sorting;

import java.util.Scanner;

public class selectionSort {
    public void sort(int[] arr)
    {
        for(int i=0;i< arr.length-1;i++)
        {
            int minIndex = i;
            for(int j=i+1;j< arr.length;j++)
            {
                if(arr[minIndex]>arr[j]) minIndex = j;
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        selectionSort obj = new selectionSort();
        obj.sort(arr);
        for(var i:arr)
            System.out.print(i+" ");
    }
}
