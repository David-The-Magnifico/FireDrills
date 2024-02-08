package FireDrillTwo;

import java.util.Scanner;

public class TaskEight {

    public static void main(String[] args) {

        int sum = 0;
        int count = 0;
        Scanner input = new Scanner(System.in);

        while (count < 10) {
            System.out.print("Enter a score between 0 and 100: ");
            int score = input.nextInt();
            if (score < 0 || score > 100) {
                System.out.println("Invalid score. Please input a valid score!!!.");
                continue;
            }
            sum += score;
            count++;
        }

        System.out.println("The sum of the scores is: " + sum);
    }
}
