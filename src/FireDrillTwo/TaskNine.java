package FireDrillTwo;

import java.util.Scanner;
public class TaskNine {

            public static void main(String[] args) {

                int sum = 0;
                int count = 0;
                Scanner input = new Scanner(System.in);

                while (count < 10) {
                    System.out.print("Enter a score: ");
                    int score = input.nextInt();
                    if (score < 0 || score > 100) {
                        System.out.println("Invalid score. Please enter a number between 0 and 100.");
                        continue;
                    }
                    sum += score;
                    count++;
                }

                System.out.println("The sum of the valid scores is: " + sum);
            }

}
