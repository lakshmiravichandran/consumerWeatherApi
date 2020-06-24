package com.spring.example.consumerWeatherApi.service;

import com.spring.example.consumerWeatherApi.model.WeatherAlert;

import java.util.List;

public interface AlertService {
    boolean addAlerts(WeatherAlert weatherAlert);
    List<WeatherAlert> getAllAlerts();
}
