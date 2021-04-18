package com.lab.inheritance;

import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class MainController extends SpringBootServletInitializer {

    @RequestMapping(method = RequestMethod.GET, value = "/")
    public String Index() {
        return "Inheritance";
    }
}