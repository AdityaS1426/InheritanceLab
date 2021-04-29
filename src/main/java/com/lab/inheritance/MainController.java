package com.lab.inheritance;

import Lab.SportsCar;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;

@RequestMapping("")
@Controller
public class MainController
{
    @GetMapping("/")
    public String Index(){
        return "index";
    }

    @GetMapping("/inheritance")
    public String Inheritance(@RequestParam(value = "make", required = false, defaultValue = "Porsche") String make,
                            @RequestParam(value = "model", required = false, defaultValue = "Cayman") String model,
                            @RequestParam(value = "age", required = false, defaultValue = "2018") Integer age,
                            @RequestParam(value = "topspeed", required = false, defaultValue = "155") Integer topspeed, Model springmodel){

        SportsCar sportscar1 = new SportsCar(make, model, age, topspeed);
        //Cars.add(sportscar1);

        springmodel.addAttribute("cars", sportscar1);
        return "inheritance";
    }
}
