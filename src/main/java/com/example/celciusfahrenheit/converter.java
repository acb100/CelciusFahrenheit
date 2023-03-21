package com.example.celciusfahrenheit;

import org.springframework.web.bind.annotation.PostMapping;

public class converter {

    public double convertedNumber;

    public void celsiusToFahrenheit(double input) {
        convertedNumber = input * 1.8 + 32;
    }

    public void fahrenheitToCelsius(double input) {
        convertedNumber = (input - 32) / 1.8;
    }

    @PostMapping("/")
    public double getConvertedNumber() {
        return convertedNumber;
    }

    @PostMapping("/")
    public void setConvertedNumber() {
        this.convertedNumber = convertedNumber;
    }
}
