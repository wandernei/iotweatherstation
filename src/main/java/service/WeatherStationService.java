package service;

import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import dao.WeatherStationDAO;
import model.WeatherStation;

// http://localhost:9090/RESTfulCRUD/rest/weather-stations/Ws3

@Path("weather-stations")
public class WeatherStationService{
    //URI:
    // /contextPath/servletPath/weatherStations
    @GET
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public List<WeatherStation> getWeatherStations_JSON(){
        List<WeatherStation> myWStationsList = new WeatherStationDAO().getAllWeatherStations();
        return myWStationsList;
    }
    
    // URI:
    // /contextPath/serveletPath/weatherStations/{wsName}
    @GET
    @Path("/{wsName}")
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public WeatherStation getWeatherStation(@PathParam("wsName") String wsName){
        return WeatherStationDAO.getWeatherStation(wsName);
    }
    
    // URI:
    // /contextPath/servletPath/weatherStations
    @POST
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public WeatherStation addWeatherStation(WeatherStation ws){
        return WeatherStationDAO.addWeatherStation(ws);
    }
    
    // URI:
    // /contextPath/servletPath/weatherStations
    @PUT
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public WeatherStation updateWeatherStation(WeatherStation ws){
        return WeatherStationDAO.updateWeatherStation(ws);
    }
    
    @DELETE
    @Path("/{wsName}")
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public void deleteWeatherStation(@PathParam("wsName") String wsName){
        WeatherStationDAO.deleteWeatherStation(wsName);
    }
    
    
    
}
