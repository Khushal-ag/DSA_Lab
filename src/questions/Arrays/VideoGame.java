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
        List<GameEntry> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            GameEntry obj = new GameEntry(sc.nextInt(), sc.next());
            arr.add(obj);
        }

    }
}
