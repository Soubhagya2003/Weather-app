package com.example.weatherapp;

public class WeatherRVModel {

    private String time;
    private String temperture;
    private String icon;
    private String windSpeed;

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getTemperture() {
        return temperture;
    }

    public void setTemperture(String temperture) {
        this.temperture = temperture;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(String windSpeed) {
        this.windSpeed = windSpeed;
    }

    public WeatherRVModel(String time, String temperture, String icon, String windSpeed) {
        this.time = time;
        this.temperture = temperture;
        this.icon = icon;
        this.windSpeed = windSpeed;
    }
}
