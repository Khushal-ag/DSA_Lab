/*Create an array of 5 elements with values {1,7,4,7,6}.Search value 7 in the given
array and print all the  occurrence(index) of search value(7) by holding the index in a result
array . Do it recursively
The prototype of the method is as follows:-

public static int[] res(int arr[], int current index, int search_value)
{
    // set of statements;
}
*/
package questions.Recursion;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SearchAll7 {
    public static List<Integer> res(int[] arr, int currentIndex, int searchValue)
    {
        List<Integer> l = new ArrayList<>();
        if(currentIndex == arr.length) return l;
        if(arr[currentIndex]==searchValue) l.add(currentIndex);
        l.addAll(res(arr,currentIndex+1,searchValue));
        return l;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of element : ");
        int n = sc.nextInt();
        System.out.println("Enter array -> ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter element to Search : ");
        int x = sc.nextInt();
        System.out.println("Indexes : ");
        for (var i:res(arr,0,x)) {
            System.out.print(i+" ");
        }
    }
}
