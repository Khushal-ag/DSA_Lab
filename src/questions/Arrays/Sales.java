/*
 There is a company that manufactures three types of products. In this company, there are 5 salesmen.
 Each salesman is supposed to sell three products. Write a program to print
(i) The total no of sales by each salesman
(ii) total sales of each item.
The structure of the class Company is as follows:-
class Company
{
	int products[];
}
*/

package questions.Arrays;

import java.util.Scanner;

class Company{
    int[] products;
}
public class Sales {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Company[] emp = new Company[5];
        int[] saleSum = new int[5];
        int[] itemSum = new int[3];
        for (int i = 0; i < emp.length; i++) {
            emp[i] = new Company();
            System.out.print("Enter sale of 3 items sold by Salesman"+(i+1)+" : ");
            emp[i].products = new int[3];
            for (int j = 0; j < emp[i].products.length; j++) {
                emp[i].products[j] = sc.nextInt();
                saleSum[i]+=emp[i].products[j];
                itemSum[j]+=emp[i].products[j];
            }
        }
        System.out.println();
        for (int i = 0; i < saleSum.length; i++) {
            System.out.println("Total Sales by Salesman"+(i+1)+" : "+saleSum[i]);
        }
        System.out.println();
        for (int i = 0; i < itemSum.length; i++) {
            System.out.println("Total Sales of item"+(i+1)+" : "+itemSum[i]);
        }
    }
}
