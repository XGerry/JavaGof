package gof.observer;


import java.util.Observable;
import java.util.Observer;

public class CurrentConditionsDisplayNew implements Observer, DIsplayElement {
    Observable observable;
    private float temperature;
    private float humodity;

    public CurrentConditionsDisplayNew(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable obs, Object arg) {
        if (obs instanceof WeatherDataNew) {
            WeatherDataNew weatherData = (WeatherDataNew) obs;
            this.humodity = weatherData.getHumidity();
            this.temperature = weatherData.getTemperature();
            display();
        }
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature + "F degrees and " + humodity + "% humidity");
    }
}
