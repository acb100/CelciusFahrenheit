package com.example.model;

import ch.qos.logback.core.model.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class converter {

    private double input;
    public double convertedNumber;

    public converter(double input, double convertedNumber) {
        this.input = input;
        this.convertedNumber = convertedNumber;
    }

    @RequestMapping("/")
    public String convert(){
        return "index";
    }

    @PostMapping("/")
    public double c2f(@ModelAttribute("c2f") Model model) {
        convertedNumber = input * 1.8 + 32;
        return convertedNumber;
    }


    @PostMapping("/f2c")
    public double f2c(@ModelAttribute("f2c") Model model) {
        convertedNumber = (input * 1.8) - 32;
        return convertedNumber;
    }

    @GetMapping("/")
    public double getConvertedNumber(@ModelAttribute("convertedNumber") Model model) {
        return convertedNumber;
    }

    @PostMapping("/")
    public void setInput(double input) {
        this.input = input;
    }
}
