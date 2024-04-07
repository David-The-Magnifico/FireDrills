public class InputOutput2 {
    public static void main(String[] args) {
        int[] input = {2, 4, 5, 7, 8};
        int output = calculateDifference(input);
        System.out.println("Output: " + output);
    }

    public static int calculateDifference(int[] input) {
        int max = input[0];
        int min = input[0];

        for (int i = 1; i < input.length; i++) {
            if (input[i] > max) {
                max = input[i];
            }
            if (input[i] < min) {
                min = input[i];
            }
        }

        return max - min;
    }
}
