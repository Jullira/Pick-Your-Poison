package project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import project.persistence.entities.Location;
import project.persistence.entities.PostitNote;
import project.service.LocationService;


@Controller
public class LocationFormController {

    LocationService locationService;


    // Dependency Injection
    @Autowired
    public LocationFormController(LocationService locationService) {this.locationService=locationService;}

    // GETS LOCATIONS FROM DATABASE
    @RequestMapping(value = "/LocationSearchResults/{name}", method = RequestMethod.GET)
    public String GetLocationFromName(@PathVariable String name, Model model) {

        // Get all Location Notes with this name and add them to the model
        model.addAttribute("location", locationService.findByName(name));

        // Add a new location to the model for the form
        // If you look at the form in jsp, you can see that we
        // reference this attribute there by the name `locationSearchResult`.
        model.addAttribute("locationSearchResult", new Location());

        // Return the view
        return "postitnotes/PostitNotes";
    }


}
