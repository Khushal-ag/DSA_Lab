//Consider an array MARKS[4][5] which stores the marks obtained by 4 students
//in 5 subjects. Now write a program to
//(a) find the average marks obtained in each subject.
//(b) find the average marks obtained by every student.
//(c) find the number of students who have scored below 50 in their average.
//(d) display the scores obtained by every student.
package questions.Arrays;

import java.util.Scanner;

public class StudentMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] Marks = new int[4][5];
        int[] each_sub = new int[5];
        int[] each_student = new int[4];
        for (int i = 0; i < Marks.length; i++) {
            System.out.print("Enter Marks of Student"+(i+1)+" : ");
            for (int j = 0; j < Marks[i].length; j++) {
                Marks[i][j] = sc.nextInt();
                each_sub[j] += Marks[i][j];
                each_student[i] += Marks[i][j];
            }
        }
        int count = 0;
        System.out.println("Average of each Subject :");
        for (int j = 0; j < each_sub.length; j++) {
            System.out.println("Subject"+(j+1)+" = "+each_sub[j]/4);
        }
        System.out.println();
        System.out.println("Average of each Student :");
        for (int j = 0; j < each_student.length; j++) {
            System.out.println("Student"+(j+1)+" = "+each_student[j]/5);
            if(each_student[j]/5 < 50) count++;
        }
        System.out.println();
        System.out.println("Number of students who have scored below 50 in average : "+count);
        System.out.println();
        System.out.println("Marks ->");
        for (int i = 0; i < Marks.length; i++) {
            System.out.print("Student"+(i+1)+" : ");
            for (int j = 0; j < Marks[i].length; j++) {
                System.out.print(Marks[i][j]+" ");
            }
            System.out.println();
        }
    }
}
