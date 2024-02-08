public class AutomaticBike {
    boolean isOn;
    private int speed;
    private int gear;

    public AutomaticBike() {
        this.isOn = false;
        this.speed = 0;
        this.gear = 1;
    }

    public void turnOn() {
        this.isOn = true;
    }

    public void turnOff() {
        this.isOn = false;
    }

    public void accelerate() {
        if (isOn) {
            speed += gear;
            updateGear();
        }
    }

    public void decelerate() {
        if (isOn) {
            speed -= gear;
            if (speed < 0) {
                speed = 0;
            }
            updateGear();
        }
    }

    private void updateGear() {
        if (speed >= 41) {
            gear = 4;
        } else if (speed >= 31) {
            gear = 3;
        } else if (speed >= 21) {
            gear = 2;
        } else {
            gear = 1;
        }
    }

    public int getSpeed() {
        return speed;
    }

    public int getGear() {
        return gear;
    }
}

