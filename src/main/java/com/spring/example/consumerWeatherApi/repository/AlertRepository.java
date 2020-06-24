package com.spring.example.consumerWeatherApi.repository;

import com.spring.example.consumerWeatherApi.model.WeatherAlert;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlertRepository extends JpaRepository<WeatherAlert, String> {
}
