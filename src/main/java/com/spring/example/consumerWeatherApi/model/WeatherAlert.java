package com.spring.example.consumerWeatherApi.model;

import lombok.Data;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import java.util.UUID;

@Entity
@Data
public class WeatherAlert {
    @Id
    private String id;
    private String alert;
    @OneToOne(cascade = {CascadeType.ALL})
    private Weather weather;
    public WeatherAlert(){
        this.id = UUID.randomUUID().toString();
    }
}
