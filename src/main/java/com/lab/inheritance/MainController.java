package com.lab.inheritance;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class MainController {

    @RequestMapping(method = RequestMethod.GET, value = "/")
    public String Index() {
        return "Index";
    }
}