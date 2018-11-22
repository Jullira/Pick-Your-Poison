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
import project.persistence.entities.Whiskey;
import project.service.WhiskeyService;

@Controller
public class WhiskeyFormController {
    WhiskeyService whiskeyService;

    // Dependency Injection
    @Autowired
    public WhiskeyFormController(WhiskeyService whiskeyService) {this.whiskeyService=whiskeyService;}

    // GET WHISKEY BY NAME
    @RequestMapping(value = "/WhiskeySearchResults/{name}", method = RequestMethod.GET)
    public String GetWhiskeyFromName(@PathVariable String name, Model model) {

        // Get all whiskey Notes with this name and add them to the model
        model.addAttribute("location", whiskeyService.findByName(name));

        // Add a new whiskey to the model for the form
        // If you look at the form in jsp, you can see that we
        // reference this attribute there by the name `locationSearchResult`.
        model.addAttribute("locationSearchResult", new Location());

        // Return the view
        return "postitnotes/PostitNotes";
    }

    // GET ALL AVAILABLE WHISKEY
    //  create a controller




    }

