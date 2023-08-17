public class WeatherStation {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 35.4f);

        weatherData.setMeasurements(82, 68, 29.2f);

        weatherData.setMeasurements(78, 60, 30.4f);
    }
}
