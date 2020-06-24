package com.spring.example.consumerWeatherApi.service.serviceImpl;

import com.spring.example.consumerWeatherApi.model.WeatherAlert;
import com.spring.example.consumerWeatherApi.repository.AlertRepository;
import com.spring.example.consumerWeatherApi.service.AlertService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlertServiceImpl implements AlertService {
    AlertRepository alertRepository;

    public AlertServiceImpl(AlertRepository alertRepository){
        this.alertRepository=alertRepository;
    }
    @Override
    public boolean addAlerts(WeatherAlert weatherAlert) {
        alertRepository.save(weatherAlert);
        return true;
    }

    @Override
    public List<WeatherAlert> getAllAlerts() {
        List<WeatherAlert> weatherAlertList = (List<WeatherAlert>) alertRepository.findAll();
        return null;
    }
}
