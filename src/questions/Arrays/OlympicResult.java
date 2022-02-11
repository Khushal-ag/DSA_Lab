/*
The Olympic results are given in a table, where each row represents a
country, and columns represent gold, silver, and bronze medals.
For example, the element r[0][0] is the number of gold medals earned by
the 0-th country. Write a method that takes the table as an input, and
returns a new array which lists the total number of medals for each
country. For example,
Input :
2   0   1
3   2   0
0   0   2

Output :
3
5
2
*/

package questions.Arrays;

import java.util.Scanner;

public class OlympicResult {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        int[] res = new int[n];
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
                sum += arr[i][j];
            }
            res[i] = sum;
        }
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }
    }
}
