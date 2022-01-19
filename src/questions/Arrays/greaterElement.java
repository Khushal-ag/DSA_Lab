/*
Mr Raman is having two unsorted arrays with names myarr1 and myarr2. They can be of any size.
They may contain duplicate values also. Raman wants for each element in myarr1[ ] to count
elements greater than or equal to it in array myarr2[].

Example
Imagine the size of both the arrays are 5

myarr1[]  values  {3,4,1,2,2}
myarr2[] values  {1,2,1,3,1}

Output :
1,0,5,2,2
*/
package questions.Arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class greaterElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Elements in array1 : ");
        int n1 = sc.nextInt();
        int[] myarr1 = new int[n1];
        for (int i = 0; i < myarr1.length; i++) {
            myarr1[i] = sc.nextInt();
        }
        System.out.print("Elements in array2 : ");
        int n2 = sc.nextInt();
        int[] myarr2 = new int[n2];
        for (int i = 0; i < myarr2.length; i++) {
            myarr2[i] = sc.nextInt();
        }
        List<Integer> l = new ArrayList<>();
        for (int k : myarr1) {
            int count = 0;
            for(var j : myarr2) {
                if(j>=k){
                    count++;
                }
            }
            l.add(count);
        }
        System.out.print("Result : ");
        for (var i : l) {
            System.out.print(i+" ");
        }
    }
}
