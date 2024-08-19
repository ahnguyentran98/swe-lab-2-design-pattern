package observer;

import observer.concrete_observer.CurrentConditionsDisplay;
import observer.concrete_observer.ForecastDisplay;
import observer.concrete_subject.WeatherData;

public class ObserverClientApplication {
    public void observer() {
        WeatherData weatherData = new WeatherData();

        // Create observers
        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay();
        ForecastDisplay forecastDisplay = new ForecastDisplay();

        // Register observers with the subject
        weatherData.registerObserver(currentDisplay);
        weatherData.registerObserver(forecastDisplay);

        // Simulate new weather measurements
        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);
    }
}
