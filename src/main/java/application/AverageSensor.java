package application;

import java.util.ArrayList;
import java.util.List;

public class AverageSensor implements Sensor {
    private List<Sensor> sensors;
    private List<Integer> readings;
    private boolean on;

    public AverageSensor() {
        this.sensors = new ArrayList<>();
        this.readings = new ArrayList<>();
        this.on = false;
    }

    public void addSensor(Sensor toAdd) {
        this.sensors.add(toAdd);
    }

    @Override
    public boolean isOn() {
        return this.on;
    }

    @Override
    public void setOn() {
        this.on = true;
        for (Sensor sensor : this.sensors) {
            sensor.setOn();
        }
    }

    @Override
    public void setOff() {
        this.on = false;
        for (Sensor sensor : this.sensors) {
            sensor.setOff();
        }
    }

    @Override
    public int read() {
        if (!this.on || this.sensors.isEmpty()) {
            throw new IllegalStateException("Sensor is off or no sensors added");
        }
        int sum = 0;
        for (Sensor sensor : this.sensors) {
            sum += sensor.read();
        }
        int average = sum / this.sensors.size();
        this.readings.add(average);
        return average;
    }

    public List<Integer> readings() {
        return new ArrayList<>(this.readings);
    }
}
