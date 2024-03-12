import org.junit.Test;
import static org.junit.Assert.*;

public class AutomaticBikeTest {
    @Test
    public void testBikeIsTurnOnOrOff() {
        AutomaticBike bike = new AutomaticBike();
        bike.turnOn();
        assertTrue(bike.isOn);
        bike.turnOff();
        assertFalse(bike.isOn);
    }

    @Test
    public void testBikeCanAccelerate() {
        AutomaticBike bike = new AutomaticBike();
        bike.turnOn();
        bike.accelerate();
        assertEquals(1, bike.getSpeed());
        bike.accelerate();
        assertEquals(2, bike.getSpeed());
    }

    @Test
    public void testBikeCanDecelerate() {
        AutomaticBike bike = new AutomaticBike();
        bike.turnOn();
        bike.accelerate();
        bike.decelerate();
        assertEquals(0, bike.getSpeed());
    }

    @Test
    public void testBikeCanChangeGear() {
        AutomaticBike bike = new AutomaticBike();
        bike.turnOn();
        for (int i = 0; i < 20; i++) {
            bike.accelerate();
        }
        assertEquals(1, bike.getGear());
        for (int i = 0; i < 10; i++) {
            bike.accelerate();
        }
        assertEquals(4, bike.getGear());
        for (int i = 0; i < 10; i++) {
            bike.decelerate();
        }
        assertEquals(1, bike.getGear());
    }
}



