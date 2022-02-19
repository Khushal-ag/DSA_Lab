/*
Suppose there is an organization, which would like to propose work from home for their
employees due to Covid-19 restrictions.An Employee of the organization could possibly
choose to work from home, on a first-come, first-served, basis, only the first 'K'
employees would be allowed to work from home. Now, observe the signature of the
method below and complete the following method.

public Queue allotWorkFrom Home (LinkedList employees, int k) {}

The method receives a singly linked list of employee types as 'employees' and the
number of employees who would be allowed to switch to work from home as 'k' as
parameters. The method should take the first 'k' employees from the linked list,
whose and put them into a queue and return the queue of employees. Only those
to the queue whose 'workingFromHome' field is already set to true in the linked-list.

public class Employee {
    private String name;
    private boolean workingFromHome;
}
*/

package questions.project.EmployeWork;

import java.util.Scanner;

public class EmployeeMain {
    public EmployeeQueue allotWorkFromHome (EmployeeList employees, int k) {
        EmployeeQueue q = new EmployeeQueue();
        for (int i = 0; i < k; i++) {
            employees.get(i).setWorkingFromHome(true);
            q.enqueue(employees.get(i));
        }
        return q;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of employees = ");
        int n = sc.nextInt();
        sc.nextLine();
        EmployeeList l = new EmployeeList();
        for (int i = 0; i < n; i++) {
            System.out.print("Employee "+(i+1)+" name : ");
            l.insert(sc.nextLine(), false);
        }
        System.out.print("Number of employee allowed to work : ");
        int k = sc.nextInt();
        EmployeeMain m = new EmployeeMain();
        System.out.println();
        System.out.println("Employee Queue : ");
        m.allotWorkFromHome(l,k).display();
    }
}
