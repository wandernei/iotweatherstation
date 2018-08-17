package model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="weather-station")
@XmlAccessorType(XmlAccessType.FIELD)
public class WeatherStation {
    private String name;
    private int temperature;
    private int humidity;

    // this default constructor is required if there are other constructors
    public WeatherStation() {
    }

    public WeatherStation(String name, int temperature, int humidity) {
        this.setName(name);
        this.setTemperature(temperature);
        this.setHumidity(humidity);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }
    
    
    
    
}
