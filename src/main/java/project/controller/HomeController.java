package project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import project.service.StringManipulationService;

@Controller
public class HomeController {

    // Instance Variables
    StringManipulationService stringService;

    // Dependency Injection
    @Autowired
    public HomeController(StringManipulationService stringService) {
        this.stringService = stringService;
    }

    // what is running when you run "localhost:8080"
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String home(){

        return "Index";
    }

}
