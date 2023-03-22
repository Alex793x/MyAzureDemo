package com.example.demopostspring.model;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class TemperatureConverter {

    // Attributes ------------------------------------------------------
    private boolean isCelsius;
    private double value;


    public void setIsCelsius(boolean isCelsius) {
        this.isCelsius = isCelsius;
    }

    // Method ------------------------------------------------------------
    public double convert() {
        if (isCelsius) {
            return (value * 1.8) + 32;         // Celsius to Fahrenheit
        } else {
            return (value - 32) * 5/9;         // Fahrenheit to Celsius
        }
    }

}