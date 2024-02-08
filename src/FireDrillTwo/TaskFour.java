package FireDrillTwo;

import java.util.Scanner;

public class TaskFour {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int sum = 0;
        int count = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter a score: ");
            int score = input.nextInt();
            if (i % 2 == 0) {
                sum += score;
            }
            count++;
        }

        System.out.println("The sum of the scores at even indexes is: " + sum);
    }
}

