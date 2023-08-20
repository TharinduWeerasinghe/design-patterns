public class ForecastDisplay implements Observer, DisplayElement{

    private float currentPressure = 29.92f;
    private float lastPressure;
    private WeatherData weatherData;

    public ForecastDisplay(WeatherData weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }



    @Override
    public void update() {
        this.lastPressure = currentPressure;
        this.currentPressure = weatherData.getPressure();
        display();
    }

    @Override
    public void display() {
        String message = "";
        if (lastPressure > currentPressure){
            message = "Watch out for cooler";
        }else if (lastPressure < currentPressure){
            message = "Watch out for hotter";
        }else {
            message = "More of the same.";
        }
        System.out.println("Forecast: " + message);
    }
}
