package com.spring.example.consumerWeatherApi.repository;

import com.spring.example.consumerWeatherApi.model.Weather;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WeatherRepository extends JpaRepository<Weather, String> {
}
