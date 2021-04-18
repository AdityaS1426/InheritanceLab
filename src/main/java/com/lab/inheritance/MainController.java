package com.lab.inheritance;

import Lab.CarInheritance;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class MainController {

    @RequestMapping(value = "Lab/Car", method = {RequestMethod.GET, RequestMethod.POST})
    public String Car(@RequestParam(value = "Gears", required = false, defaultValue = "3") String Gears, @RequestParam(value = "Speed", required = false, defaultValue = "3") String Speed, @RequestParam(value = "Height", required = false, defaultValue = "3") String Height, Model model) {

        CarInheritance car = new CarInheritance();
        int DaGear = Integer.parseInt(Gears);
        int DaSpeed = Integer.parseInt(Speed);
        int DaHeight = Integer.parseInt(Height);

        model.addAttribute("paths", car);

        return "Index";
    }
}