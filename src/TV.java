public class TV {
    private boolean isOn;
    private int volume;

    public TV() {
        this.isOn = false;
        this.volume = 10;
    }

    public TV(boolean isOn) {
        this.isOn = isOn;
        this.volume = 10;
    }

    public void turnOn() {
        this.isOn = true;
    }

    public void turnOff() {
        this.isOn = false;
    }

    public void increaseVolume() {
        if (volume < 100) {
            volume++;
        }
    }

    public void decreaseVolume() {
        if (volume > 0) {
            volume--;
        }
    }

    public boolean isOn() {
        return isOn;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}
