package questions.LinkList;
import java.util.*;
public class search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> l = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            l.add(sc.nextInt());
        }
        int s = sc.nextInt();
        int f = 0;
        for(var i:l){
            if(i==s) {
                System.out.println("YES");
                f = 1;
                break;
            }
            if(f==0) System.out.println("No");
        }
    }
}
