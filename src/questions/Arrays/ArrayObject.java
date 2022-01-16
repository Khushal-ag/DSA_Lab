/*
Write a Java class, Flower, that has three instance variables
of type String, int, and float, which respectively represent the
name of the flower, its number of petals, and price. Your class
must include a constructor method that initialises each variable
to an appropriate value, and your class should include methods
for setting the value of each type, and getting the value of each
type. Create an array of 5 Flower objects and print the value.
*/
package questions.Arrays;

import java.util.Scanner;

class Flower{
    String name;
    int petal;
    float price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPetal() {
        return petal;
    }

    public void setPetal(int petal) {
        this.petal = petal;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    Flower()
    {
        name = "NULL";
        petal = 0;
        price = 0;
    }
}
public class ArrayObject {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of element = ");
        int n = sc.nextInt();
        Flower[] f = new Flower[n];
        for (int i = 0; i < f.length; i++) {
            f[i] = new Flower();
            System.out.print("Enter flower name "+(i+1)+": ");
            f[i].setName(sc.next());
            System.out.print("Enter no. petal : ");
            f[i].setPetal(sc.nextInt());
            System.out.print("Enter price : ");
            f[i].setPrice(sc.nextFloat());
        }
        System.out.println();
        for (int i = 0; i < f.length; i++) {
            System.out.println("Flower "+(i+1)+" Name : "+f[i].getName());
            System.out.println("No. of petals : "+f[i].getPetal());
            System.out.println("Price : "+f[i].getPrice());
            System.out.println();
        }
    }
}
