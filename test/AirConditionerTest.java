import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AirConditionerTest {

    @Test
    void turningOnShouldSetAirConditionerToOn() {
        AirConditioner ac = new AirConditioner();
        ac.turnOn();
        assertTrue(ac.isOn());
    }

    @Test
    void havingAnAirConditionerShouldStartItOn() {
        AirConditioner ac = new AirConditioner(true);
        assertTrue(ac.isOn());
    }

    @Test
    void turningOffShouldSetAirConditionerToOff() {
        AirConditioner ac = new AirConditioner(true);
        ac.turnOff();
        assertFalse(ac.isOn());
    }

    @Test
    void increasingTemperatureShouldIncreaseTemperature() {
        AirConditioner ac = new AirConditioner(true);
        ac.increaseTemperature();
        assertEquals(23, ac.getTemperature());
    }

    @Test
    void decreasingTemperatureShouldDecreaseTemperature() {
        AirConditioner ac = new AirConditioner(true);
        ac.decreaseTemperature();
        assertEquals(21, ac.getTemperature());
    }

    @Test
    void increasingTemperatureBeyond30ShouldKeepTemperatureAt30() {
        AirConditioner ac = new AirConditioner(true);
        ac.setTemperature(30);
        ac.increaseTemperature();
        assertEquals(30, ac.getTemperature());
    }

    @Test
    void decreasingTemperatureBelow16ShouldKeepTemperatureAt16() {
        AirConditioner ac = new AirConditioner(true);
        ac.setTemperature(16);
        ac.decreaseTemperature();
        assertEquals(16, ac.getTemperature());
    }
}
