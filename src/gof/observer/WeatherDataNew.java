package gof.observer;

import java.util.Observable;

public class WeatherDataNew extends Observable {
    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }

    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherDataNew() {
    }

    public void measurementsChanged() {
        setChanged();
        notifyObservers();
    }

    public void setMesasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}
