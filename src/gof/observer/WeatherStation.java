package gof.observer;

/**
 * 观察者模式
 */
public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay conditionsDisplay = new CurrentConditionsDisplay(weatherData);
        weatherData.setMesasurements(80, 65, 30.4f);
        weatherData.setMesasurements(70, 70, 32.5f);
        weatherData.setMesasurements(90, 90, 22f);

        //java自带观察者模式实现
        WeatherDataNew weatherDataNew = new WeatherDataNew();
        CurrentConditionsDisplayNew conditionsDisplayNew = new CurrentConditionsDisplayNew(weatherDataNew);
        weatherDataNew.setMesasurements(80, 65, 30.4f);
        weatherDataNew.setMesasurements(70, 70, 32.5f);
        weatherDataNew.setMesasurements(90, 90, 22f);
    }
}
