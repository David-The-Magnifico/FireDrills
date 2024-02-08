import java.util.Arrays;

public class FireDrillFive {
    public static void main(String[] args) {
        int[] inputArray = {4, 5, 8};
        int[] outputArray = doubleArrayLength(inputArray);
        System.out.println(Arrays.toString(outputArray));
    }

    public static int[] doubleArrayLength(int[] arr) {
        int[] output = new int[arr.length * 2];
        for (int i = 0; i < arr.length; i++) {
            output[i] = arr[i];
            output[i + arr.length] = arr[i] * 2;
        }
        return output;
    }
}

