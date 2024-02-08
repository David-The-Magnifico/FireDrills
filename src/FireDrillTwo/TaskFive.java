package FireDrillTwo;

import java.util.Scanner;

public class TaskFive {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int sumOfEven = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter a score: ");
            int score = input.nextInt();
            if (score % 2 == 0) {
                sumOfEven += score;
            }
        }

        System.out.println("The sum of the even numbers is: " + sumOfEven);
    }
}
