package algorithm.sorting;

import java.util.Arrays;
import java.util.Scanner;

public class mergesort {
    public static int[] merge(int first[], int second[]) {
        int[] mix = new int[first.length + second.length];
        int i=0,j=0,k=0;
        while(i<first.length && j<second.length)
        {
            if(first[i]<second[j])
            {
                mix[k] = first[i];
                i++;
            }
            else{
                mix[k] = second[j];
                j++;
            }
            k++;
        }
        while(i< first.length)
        {
            mix[k] = first[i];
            i++;
            k++;
        }

        while(j< second.length)
        {
            mix[k] = second[j];
            j++;
            k++;
        }
        return mix;
    }
    public static int[] mergesorting ( int[] arr){
        int mid = arr.length / 2;
        if (arr.length == 1) return arr;
        int[] left = mergesorting(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergesorting(Arrays.copyOfRange(arr, mid, arr.length));
        return merge(left, right);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        arr = mergesorting(arr);
        for (var i: arr) {
            System.out.print(i+" ");
        }
    }
}
