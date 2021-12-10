public class WeatherForecastClient {
    public static void main(String[] args) {
        WeatherForecast weather1 = new WeatherForecast();
        System.out.println(weather1.toString());

        WeatherForecast weather2 = new WeatherForecast(85.0, "cloudy");
        System.out.println(weather2.toString());
        
        System.out.println("Get weather1 temperature: " + weather1.getTemperature());
        System.out.println("Get weather2 temperature: " + weather2.getTemperature());
        System.out.println("Sky for weather1: " + weather1.getSky());
        System.out.println("Sky for weather2: " + weather2.getSky());

        weather2.setTemperature(100);
        System.out.println("Weather2 temp: " + weather2.getTemperature());

        weather2.setSky("it looks like you're gonna need an umbrella, it's a bit drippy out");
        System.out.println("Weather2 sky: " + weather2.getSky());

        WeatherForecast weather3 = new WeatherForecast();
        if (weather1.equals(weather3)){
            System.out.println("Equals");
        } else {
            System.out.println("Not equals");
        }
        
        System.out.println("Degrees in Celcius: " + weather1.fToCelcius());

        WeatherForecast weather4 = new WeatherForecast(50, "snowy");
        if (weather4.isConsistent()) {
            System.out.println(weather4 + " is consistent");
        } else {
            System.out.println(weather4 + " is not consistent");
        }

        WeatherForecast weather5 = new WeatherForecast(20, "sunny");
        if (weather5.isConsistent()) {
            System.out.println(weather5 + " is consistent");
        } else {
            System.out.println(weather5 + " is not consistent");
        }

        weather2.setTemperature(23).setSky("sunny");
        System.out.println("Weather 2: " + weather2.toString());
    }
}
