/*
In GLA University there is various department. It is asked to every dept to conduct
meeting for all the employees of GLA University. The central Management asked the
dept kindly share starting time and ending time of the meeting in 24 hours format
so that after verifying it will be circulated among the GLA employees.
But there is a problem that before circulating the meeting information, the central
management will find out if there are any clashes between time or not. If there are
clashes it means the employee cannot attend all the meetings. Can you help central
management to find it out?

Use this class structure :-
public class TimeInterval
{
    int start;
    int end;
    // use constructor, getter and setter methods as per requirement
    public boolean canAttendMeeting(TimeInterval [ ] tlarr)
    {
    // set of statements
    }
}*/
package questions.Arrays;

import java.util.Arrays;
import java.util.Scanner;

class TimeInterval {
    int start;
    int end;
    public TimeInterval(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public static boolean canAttendMeeting(TimeInterval [ ] tlarr)
    {
        int[] start = new int[tlarr.length];
        int[] end = new int[tlarr.length];
        for (int i=0;i< tlarr.length;i++) {
            start[i] = tlarr[i].start;
            end[i] = tlarr[i].start;
        }
        Arrays.sort(start);
        Arrays.sort(end);
        for (int i = 0; i < tlarr.length; i++) {
            if(start[i]<=end[i]) return false;
        }
        return true;
    }
}

public class MeetingTime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        TimeInterval[] arr = new TimeInterval[n];
        for (int i = 0; i < n; i++) {
            arr[i] = new TimeInterval(sc.nextInt(), sc.nextInt());
        }
        if(TimeInterval.canAttendMeeting(arr)) System.out.println("No Clash");
        else System.out.println("Clashing");
    }
}
