public class AirConditioner {
    private boolean isOn;
    private int temperature;

    public AirConditioner() {
        this.isOn = false;
        this.temperature = 22;
    }

    public AirConditioner(boolean isOn) {
        this.isOn = isOn;
        this.temperature = 22;
    }

    public void turnOn() {
        this.isOn = true;
    }

    public void turnOff() {
        this.isOn = false;
    }

    public void increaseTemperature() {
        if (temperature < 30) {
            temperature++;
        }
    }

    public void decreaseTemperature() {
        if (temperature > 16) {
            temperature--;
        }
    }

    public boolean isOn() {
        return isOn;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }
}
