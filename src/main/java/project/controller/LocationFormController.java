package project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import project.persistence.entities.Location;
import project.service.LocationService;


@Controller
public class LocationFormController {

    LocationService locationService;


    // Dependency Injection
    @Autowired
    public LocationFormController(LocationService locationService) {this.locationService=locationService;}

    // GETS LOCATIONS FROM DATABASE
    // Method that receives the POST request on the URL "/LocationSearch"
    // and receives the ModelAttribute("whiskey") function from it
    @RequestMapping(value = "/LocationSearch", method = RequestMethod.GET)
    public String getWhiskeyView(@ModelAttribute("location") Location location, Model model){

        // sends the search parameters into database and returns all relivant info to model
        model.addAttribute("LocationSearchResults", LocationService.findAll());

        return "appropriate jsp file";
    }
}
