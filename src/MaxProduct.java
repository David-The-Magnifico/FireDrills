import java.util.*;
public class MaxProduct {
    public static int maxProduct(int... integer) {
        Arrays.sort(integer);
        int n = integer.length;
        int product1 = integer[0] * integer[1];
        int product2 = integer[n-1] * integer[n-2];

        if(product1 > product2) {
            return product1;
        } else {
            return product2;
        }
    }

    public static void main(String[] args) {
        System.out.println("Maximum product of two elements in the array: " + maxProduct(1, 5, 10, 4, 0));
    }
}

