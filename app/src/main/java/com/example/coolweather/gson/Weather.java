package com.example.coolweather.gson;


import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Weather {

    public String status;

    public Basic basic;

    public AQI aqi;

    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;

    public Now now;

    public Suggestion suggestion;
}
