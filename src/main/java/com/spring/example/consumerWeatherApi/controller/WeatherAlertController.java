package com.spring.example.consumerWeatherApi.controller;

import com.spring.example.consumerWeatherApi.model.WeatherAlert;
import com.spring.example.consumerWeatherApi.service.AlertService;
import org.springframework.web.bind.annotation.*;

@RestController
public class WeatherAlertController {

    private AlertService alertService;

    public WeatherAlertController(AlertService alertService){
        this.alertService=alertService;
    }

    @PostMapping("/addReading")
//    @ApiOperation(value="Endpoint to load car information")
//    @ApiResponses(value = {
//            @ApiResponse(code = 200, message = "Success"),
//            @ApiResponse(code = 201, message = "Created"),
//            @ApiResponse(code = 400, message = "Bad Request"),
//            @ApiResponse(code = 500, message = "Internal Server Error")
//    })
    public boolean postWeatherReadings(@RequestBody WeatherAlert weatherAlertData){
        //weatherService.addWeatherReadings(weatherAlertData);
        //System.out.println(weatherAlertData);
        alertService.addAlerts(weatherAlertData);
        return true;
    }
}
