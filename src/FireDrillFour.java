import java.util.Scanner;

public class FireDrillFour {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] num = new int[15];
        System.out.println("Enter a number between 1 to 15: ");


        for (int i = 0; i < 15; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            num[i] = input.nextInt();
        }

        System.out.println("\nBar chart:");
        for (int number : num) {
            for (int j = 0; j < number; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
