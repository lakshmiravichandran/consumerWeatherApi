package com.spring.example.consumerWeatherApi.repository;

import com.spring.example.consumerWeatherApi.model.Wind;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WindRepository extends JpaRepository<Wind, String> {
}
