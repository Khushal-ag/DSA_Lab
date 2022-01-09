// Q.Create an array of 10 students and print the record of those students who got the highest marks and who got minimum marks.
// The structure of student class is as follows
// class Student
// {
//	private int rollno;
//	private int marks
//	private String name;
// }
// create constructor or getter and setter methods as per need

package questions.Arrays;

import java.util.Scanner;

class Student
{
    private int rollno;
    private int marks;
    private String name;

    public Student() {
        rollno = 0;
        marks = 0;
        name = "Null";
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
public class objectArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] arr = new Student[10];
        int max=Integer.MIN_VALUE,min=Integer.MAX_VALUE,maxIndex=-1,minIndex=-1;
        for (int i=0;i< arr.length;i++)
        {
            arr[i] = new Student();
            System.out.print("Enter RollNo. : ");
            arr[i].setRollno(sc.nextInt());
            System.out.print("Enter Name : ");
            arr[i].setName(sc.next());
            System.out.print("Enter Marks : ");
            arr[i].setMarks(sc.nextInt());
            System.out.println();
            if(max < arr[i].getMarks()){
                max = arr[i].getMarks();
                maxIndex = i;
            }
            if(min > arr[i].getMarks()){
                min = arr[i].getMarks();
                minIndex = i;
            }
        }

        System.out.println();
        System.out.println("Maximum Marks : "+arr[maxIndex].getMarks());
        System.out.println("RollNo. : "+arr[maxIndex].getRollno());
        System.out.println("Name : "+arr[maxIndex].getName());

        System.out.println();
        System.out.println("Minimum Marks : "+arr[minIndex].getMarks());
        System.out.println("RollNo. : "+arr[minIndex].getRollno());
        System.out.println("Name : "+arr[minIndex].getName());
    }
}
