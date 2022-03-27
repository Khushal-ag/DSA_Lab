package algorithm.sorting;

import java.util.Scanner;

public class mergesort {
    public void merge(int[] a,int l,int m,int r)
    {
        int l_size = m-l+2;
        int r_size = r-m+1;

        int[] left = new int[l_size];
        int[] right = new int[r_size];

        for(int i = l;i< left.length;i++)
            left[i] = a[l+i];
        for (int i = m+1; i < right.length;i++)
            right[i] = a[m+1+i];
        left[left.length] = right[right.length] = Integer.MAX_VALUE;
        int lc = 0;int rc = 0;
        for(int i=0;i<a.length;i++)
        {
            if(left[lc]<right[rc]){
                a[i] = left[lc];
                lc++;
            }
            else{
                a[i] = right[rc];
                rc++;
            }
        }
    }
    public void mergesort(int []arr,int l,int r){
        if(l == r) return;
        int m = l+r-1/2;
        mergesort(arr,l,m);
        mergesort(arr,m+1,r);
        merge(arr,l,m,r );
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        mergesort obj = new mergesort();
        obj.mergesort(arr,0,arr.length-1);
        for(var i:arr){
            System.out.print(i+" ");
        }
    }
}
