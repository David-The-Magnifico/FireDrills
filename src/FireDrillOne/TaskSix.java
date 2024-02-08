package FireDrillOne;

public class TaskSix {
    public static void main(String[] args) {

        int result1 = 4;
        int result2 = 8;

        for (int i = 1; i <= 5; i++) {
            System.out.print(result1 * (1 << i) + " ");
        }
        System.out.println();

        for (int i = 1; i <= 5; i++) {
            System.out.print(result2 * (1 << (3 * i)) + " ");
        }


    }
}
