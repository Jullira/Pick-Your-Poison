package project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import project.persistence.entities.Whiskey;
import project.service.WhiskeyService;

@Controller
public class WhiskeyFormController {
    WhiskeyService whiskeyService;

    // Dependency Injection
    @Autowired
    public WhiskeyFormController(WhiskeyService whiskeyService) {this.whiskeyService=whiskeyService;}

    // GETS WHISKEY CRITERIA FROM DATABASE
    // Method that receives the POST request on the URL "/WhiskeySearch"
    // and receives the ModelAttribute("whiskey") function from it
        @RequestMapping(value = "/WhiskeySearch", method = RequestMethod.GET)
        public String getWhiskeyView(@ModelAttribute("whiskey") Whiskey whiskey, Model model){

        // sends the search parameters into database and returns all relivant info to model
        model.addAttribute("WhiskeySearchResults",WhiskeyService.findAll(whiskey));

        return "appropriate jsp file name";
        }
    }

