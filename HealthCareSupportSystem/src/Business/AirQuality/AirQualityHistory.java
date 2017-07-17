/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.AirQuality;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Pamnani
 */
public class AirQualityHistory {
    
    private ArrayList<AirQuality> airQualityHistory;

    public AirQualityHistory() {
        airQualityHistory = new ArrayList<>();
    }

    public ArrayList<AirQuality> getAirQualityHistory() {
        return airQualityHistory;
    }

    public void setAirQualityHistory(ArrayList<AirQuality> airQualityHistory) {
        this.airQualityHistory = airQualityHistory;
    }
    
    public void createAndAddAQ(int pollutionLevel,int temp,int humidity,int ventilation,String status,Date date) {
        AirQuality airQuality = new AirQuality();
        airQuality.setPollutionLevel(pollutionLevel);
        airQuality.setTemperature(temp);
        airQuality.setHumidity(humidity);
        airQuality.setVentilation(ventilation);
        airQuality.setStatus(status);
        airQuality.setMonitoredOn(date);
        airQualityHistory.add(airQuality);
        //return airQuality;
    }
    public AirQuality createAndAddAQ()
    {
     AirQuality airQuality = new AirQuality();
     airQualityHistory.add(airQuality);
     return airQuality;
    }
    
    
}
