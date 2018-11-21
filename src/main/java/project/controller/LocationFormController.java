package project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import project.persistence.entities.Location;
import project.persistence.entities.Whiskey;
import project.service.StringManipulationService;
import project.service.WhiskeyService;

@Controller
public class LocationFormController {

    StringManipulationService stringService;

    // Dependency Injection
    @Autowired
    public LocationFormController(StringManipulationService stringService) {this.stringService=stringService;}

    // GETS LOCATIONS FROM DATABASE
    // Method that receives the POST request on the URL "/LocationSearch"
    // and receives the ModelAttribute("whiskey") function from it
    @RequestMapping(value = "/LocationSearch", method = RequestMethod.GET)
    public String getWhiskeyView(@ModelAttribute("location") Location location, Model model){

        // sends the search parameters into database and returns all relivant info to model
        model.addAttribute("LocationSearchResults",LokationService.findAll(whiskey));

        return "appropriate jsp file";
    }
}
