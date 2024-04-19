import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class MaxProductTest {

    @Test
    public void testForMaxProduct_inAnArray() {
        assertEquals(35, MaxProduct.maxProduct(3, 5, 2, 7, 4));
        assertEquals(56, MaxProduct.maxProduct(8, 4, 6, 7, 2));
        assertEquals(50, MaxProduct.maxProduct(5, 10, 2));
        assertEquals(0, MaxProduct.maxProduct( 1, 0));
    }

    @Test
    public void testMaxProductForNegativeNumbers() {
        assertEquals(20, MaxProduct.maxProduct(-1, -2, -3, -4, -5));
    }

    @Test
    public void testMaxProductForNegativeNumbers_and_PositiveNumbers() {
        assertEquals(35, MaxProduct.maxProduct(-1, 2, -3, 4, -5, 6, -7));
    }
}
