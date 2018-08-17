package dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import model.WeatherStation;

public class WeatherStationDAO {
    private static final Map<String, WeatherStation> weatherStationMap = new HashMap<String, WeatherStation>();
    
    static{ initWeatherStations(); }
    
    private static void initWeatherStations(){
        WeatherStation ws1 = new WeatherStation("Ws1", 20, 50);
        WeatherStation ws2 = new WeatherStation("Ws2", 21, 10);
        WeatherStation ws3 = new WeatherStation("Ws3", 22,  0);
        
        weatherStationMap.put(ws1.getName(), ws1);
        weatherStationMap.put(ws2.getName(), ws2);
        weatherStationMap.put(ws3.getName(), ws3);
    }
    
    public static WeatherStation getWeatherStation(String wsName){
        return weatherStationMap.get(wsName);
    }
    
    public static WeatherStation addWeatherStation(WeatherStation ws){
        weatherStationMap.put(ws.getName(), ws);
        return ws;
    }
    
    public static WeatherStation updateWeatherStation(WeatherStation ws){
        weatherStationMap.put(ws.getName(), ws);
        return ws;
    }
    
    public static void deleteWeatherStation(String wsName){
        weatherStationMap.remove(wsName);
    }
    
    public static List<WeatherStation> getAllWeatherStations(){
        Collection<WeatherStation> wStationsCollection = weatherStationMap.values();
        List<WeatherStation> list = new ArrayList<WeatherStation>();
        list.addAll(wStationsCollection);
        return list;
    }
    
    List<WeatherStation> list;


    
    
}
