package FireDrillOne;

public class TaskEight {

    public static void main(String[] args) {

        for (int j = 0; j < 5; j++) {
            for (int i = 4; i <= 10; i += 4) {
                int number = 1;
                for (int k = 0; k < j; k++) {
                    number = number * i;
                }
                System.out.print(number + " ");
            }

        }



    }

}
