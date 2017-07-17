/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.AirQuality;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Pamnani
 */
public class AirQuality {
    
    private int pollutionLevel;
    private int temperature;
    private int humidity;
    private int ventilation;
    private String status;
    private Date monitoredOn;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    
    public int getPollutionLevel() {
        return pollutionLevel;
    }

    public void setPollutionLevel(int pollutionLevel) {
        this.pollutionLevel = pollutionLevel;
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

    public int getVentilation() {
        return ventilation;
    }

    public void setVentilation(int ventilation) {
        this.ventilation = ventilation;
    }

    public Date getMonitoredOn() {
        return monitoredOn;
    }

    public void setMonitoredOn(Date monitoredOn) {
        this.monitoredOn = monitoredOn;
    }
    

    
    
}
