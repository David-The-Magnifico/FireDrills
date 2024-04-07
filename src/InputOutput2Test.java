import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class InputOutput2Test {

    @Test
    public void testCalculateDifference() {
        int[] input = {2, 4, 5, 7, 8};
        int output = InputOutput2.calculateDifference(input);
        assertEquals(6, output);
    }

    @Test
    public void testCalculateDifference_2() {
        int[] input = {2, 1, 3, 4, 9};
        int output = InputOutput2.calculateDifference(input);
        assertEquals(8, output);
    }

}