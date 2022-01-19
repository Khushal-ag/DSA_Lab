/*Create an application that store a sequence of high score
entries(with name and score) for a video game in an array.
A Java class, GameEntry, representing a game entry is as follows:-
public class GameEntry {
private int score;
private String name;
public GameEntry(int score, String name) {
    this.score = score;
    this.name = name;
}
// Getter methods that returns the name and score
public int getScore() { return score; }
public String getName() { return name; }
// here i am returning a string representation of the entry
@Override
public String toString() {
    return "("+score + ", "+ name+ ")";
}
}*/
package questions.Arrays;

import java.util.*;

class GameEntry {
    private int score;
    private String name;

    public void setScore(int score) {
        this.score = score;
    }

    public void setName(String name) {
        this.name = name;
    }

    public GameEntry(int score, String name) {
        this.score = score;
        this.name = name;
    }
    public int getScore() { return score; }
    public String getName() { return name; }
    @Override
    public String toString() {
        return "("+score + ", "+ name+ ")";
    }
}
public class VideoGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        GameEntry[] arr = new GameEntry[n];
        for (int i = 0; i < n; i++) {
            arr[i] = new GameEntry(sc.nextInt(), sc.next());
        }
        for(int i=1;i<arr.length;i++)
        {
            for (int j = 0; j < arr.length-1; j++) {
                if(arr[j].getScore()>arr[j+1].getScore()){
                    GameEntry temp = new GameEntry(arr[j].getScore(),arr[j].getName());
                    arr[j].setScore(arr[j+1].getScore());
                    arr[j].setName(arr[j+1].getName());
                    arr[j+1].setScore(temp.getScore());
                    arr[j+1].setName(temp.getName());
                }
            }
        }
        for (var i : arr) {
            System.out.println(i.toString());
        }

    }
}
