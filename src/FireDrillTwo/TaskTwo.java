package FireDrillTwo;

import java.util.Scanner;

public class TaskTwo {

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

            double average = sum / count;
            System.out.println("The average of the scores is: " + average);
        }

}
