
import java.util.Scanner;
public class FireDrillThree {

    public static void main(String[] args) {
        TaskOne();
        TaskTwo();
        TaskThree();
    }

    public static void TaskOne() {
        int[] scoresArray = collectScores();
        System.out.println("Scores entered:");
        for (int score : scoresArray) {
            System.out.println(score);
        }
    }

    public static void TaskTwo() {
        int[] scoresArray = collectScores();
        System.out.println("Scores entered:");
        printArrayVertically(scoresArray);
    }

    public static int[] collectScores() {
        Scanner scanner = new Scanner(System.in);
        int[] scores = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter score " + (i + 1) + ": ");
            scores[i] = scanner.nextInt();
        }
        return scores;
    }

    public static void printArrayVertically(int[] arr) {
        for (int value : arr) {
            System.out.println(value);
        }
    }

    public static void TaskThree() {
        int[] scoresArray = collectScores();
        System.out.println("Scores entered:");
        printArrayHorizontally(scoresArray);
    }

    public static void printArrayHorizontally(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
    }
}

















