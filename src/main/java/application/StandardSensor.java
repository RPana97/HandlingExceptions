package application;

public class StandardSensor implements Sensor {
    private int value;

    public StandardSensor(int value) {
        this.value = value;
    }

    @Override
    public boolean isOn() {
        return true; // A standard sensor is always on
    }

    @Override
    public void setOn() {
        // Does nothing as the sensor is always on
    }

    @Override
    public void setOff() {
        // Does nothing as the sensor is always on
    }

    @Override
    public int read() {
        return this.value;
    }
}
