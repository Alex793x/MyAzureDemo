package com.example.demopostspring.controller;

import com.example.demopostspring.model.TemperatureConverter;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String index() {
        return "home/index";
    }



    @PostMapping("/")
    public String convert(@ModelAttribute("temperatureConverter") TemperatureConverter temperatureConverter, Model model) {
        double convertedValue = temperatureConverter.convert();
        model.addAttribute("convertedValue", convertedValue);
        model.addAttribute("isCelsius", temperatureConverter.isCelsius());
        return "home/index";
    }




}
