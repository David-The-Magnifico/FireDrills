import java.util.Arrays;

public class MostOccurringNum {
    public static int[] mostOccurringNum(int[] arr) {
        int mostOccurring = arr[0];
        int maxCount = 1;

        for (int i = 0; i < arr.length; i++) {
            int currentCount = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j])
                    currentCount++;
            }
            if (currentCount > maxCount) {
                maxCount = currentCount;
                mostOccurring = arr[i];
            }
        }

        return new int[]{maxCount, mostOccurring};
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 3, 5, 6, 7};
        int[] result = mostOccurringNum(arr);
        System.out.println(Arrays.toString(result));
    }
}
