import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TVTest {

    @Test
    void turningOnShouldSetTVToOn() {
        TV tv = new TV();
        tv.turnOn();
        assertTrue(tv.isOn());
    }

    @Test
    void havingAnTVShouldStartItOn() {
        TV tv = new TV(true);
        assertTrue(tv.isOn());
    }

    @Test
    void turningOffShouldSetTVToOff() {
        TV tv = new TV(true);
        tv.turnOff();
        assertFalse(tv.isOn());
    }

    @Test
    void increasingVolumeShouldIncreaseVolume() {
        TV tv = new TV(true);
        tv.increaseVolume();
        assertEquals(11, tv.getVolume());
    }

    @Test
    void decreasingVolumeShouldDecreaseVolume() {
        TV tv = new TV(true);
        tv.decreaseVolume();
        assertEquals(9, tv.getVolume());
    }

    @Test
    void increasingVolumeBeyond100ShouldKeepVolumeAt100() {
        TV tv = new TV(true);
        tv.setVolume(100);
        tv.increaseVolume();
        assertEquals(100, tv.getVolume());
    }

    @Test
    void decreasingVolumeBelow0ShouldKeepVolumeAt0() {
        TV tv = new TV(true);
        tv.setVolume(0);
        tv.decreaseVolume();
        assertEquals(0, tv.getVolume());
    }
}
