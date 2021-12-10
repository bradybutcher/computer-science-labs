public class WeatherForecast {
    // instance variables - fields
    private double temperature;
    private String sky;

    // default constuctor
    public WeatherForecast() {
        temperature = 70;
        sky = "sunny";
    }

    @Override
    public String toString() {
        return ("Temp: " + temperature + "\n" + "Sky: " + sky);
    }

    public WeatherForecast(double newTemperature, String newSky) { // overloaded constructor (2 parameters)
        temperature = newTemperature;
        sky = newSky;
    }

    public double getTemperature() {
        return temperature;
    }

    public String getSky() {
        return sky;
    }

    public WeatherForecast setTemperature(double temperature) {
        if (temperature >= -50 && temperature <= 150) {
            this.temperature = temperature;
        } else {
            this.temperature = temperature;
        }

        return this;
    }

    public WeatherForecast setSky(String sky) {
        this.sky = sky;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof WeatherForecast)) {
            return false;
        } else {
            WeatherForecast wf = (WeatherForecast) o;
            if (temperature == wf.temperature && sky.equals(wf.sky)) {
                return true;
            } else {
                return false;
            }
        }
    }

    public double fToCelcius() {
        return (((temperature - 32) * 5) / 9);
    }

    public boolean isConsistent() {
        if (temperature > 32 && sky.equals("snowy")) {
            return false;
        }
        if (temperature < 32 && sky.equals("rainy")) {
            return false;
        } else {
            return true;
        }
    }
}