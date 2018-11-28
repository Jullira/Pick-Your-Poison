package project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import project.persistence.entities.Whiskey;
import project.service.SearchService;
import project.service.WhiskeyService;

import java.util.List;

@Controller
public class WhiskeyFormController {

    private WhiskeyService whiskeyService;

    @Autowired
    public WhiskeyFormController(WhiskeyService whiskeyService) { this.whiskeyService = whiskeyService;}


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


//    @RequestMapping(value = "/searchModel", method = RequestMethod.GET)
    @RequestMapping(value = "/search", method = RequestMethod.GET)
    public String searchHome(Model model) {
        // Search parameters will be put into Whiskey object
        model.addAttribute("whiskey", new Whiskey());
        return "/search" + "/Search";
    }



    /**
     * Handles when the user post a search request
     * @param whiskey containing search parameters
     * @param model for the jsp
     * @return a jsp file containing the search site with added search results
     */
//    @RequestMapping(value = "/searchWhiskey", method = RequestMethod.POST)
    @RequestMapping(value = "/search", method = RequestMethod.POST)
    public String whiskeySearch(@ModelAttribute("WhiskeySearch") Whiskey whiskey, Model model) {

        List<Whiskey> results = (List<Whiskey>) whiskeyService.searchWhiskeyByName(whiskey);

        // Add results to model
        model.addAttribute("results", results);

        // Get things ready for new search
        model.addAttribute("Whiskey", new Whiskey());
        return "/search" + "/Search";
    }


}