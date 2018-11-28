package project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import project.persistence.entities.Location;
import project.service.SearchService;
import project.service.StringManipulationService;
//import project.service.WhiskeyService;

import project.service.LocationService;
import project.service.WhiskeyService;

import java.util.List;

@Controller
public class LocationFormController {

    private LocationService LocationService;

    @Autowired
    public LocationFormController(LocationService locationService) { this.LocationService = LocationService;}
    //public WhiskeyFormController(WhiskeyService whiskeyService) { this.whiskeyService = whiskeyService;}
    //public LocationFormController(SearchService searchService) { this.LocationService = LocationService;}

    @RequestMapping(value = "/search", method = RequestMethod.GET)
    public String search(){

        return "Search";
    }

    /**
     * search()
     * Path: "/search"
     * Purpose: Displays the search home with input fields for the search
     * @return the search jsp with input fields
     */
    @RequestMapping(value = "/search", method = RequestMethod.GET)
    public String searchHome(Model model) {
        // Search parameters will be put into Location object
        model.addAttribute("location", new Location());
        return "/search" + "/Search";
    }

    /**
     * Handles when the user post a search request
     * @param location containing search parameters
     * @param model for the jsp
     * @return a jsp file containing the search site with added search results
     */
    @RequestMapping(value = "/search", method = RequestMethod.POST)
    public String LocationSearch(@ModelAttribute("LocationSearch") Location location, Model model) {

        List<Location> results = (List<Location>) LocationService.searchLocationByName(location);

        // Add results to model
        model.addAttribute("results", results);

        // Get things ready for new search
        model.addAttribute("Location", new Location());
        return "/search" + "/Search";
    }


}
