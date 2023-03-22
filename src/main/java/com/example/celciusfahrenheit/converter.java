package com.example.celciusfahrenheit;

import org.springframework.web.bind.annotation.PostMapping;

public class converter {

    public boolean isCelsius;
    public boolean isFahrenheit;

    public double convertedNumber;

    @PostMapping("/")
    public double getConvertedNumber() {
        return convertedNumber;
    }

    @PostMapping("/")
    public void setConvertedNumber() {
        this.convertedNumber = convertedNumber;
    }
}
