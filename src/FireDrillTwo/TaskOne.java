package FireDrillTwo;

import java.util.Scanner;

public class TaskOne {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double sum = 0;
        int count = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter a score: ");
            double score = input.nextDouble();
            sum += score;

            count++;

        }

        System.out.println("The sum of the scores is: " + sum);

    }
}

