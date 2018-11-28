package project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import project.persistence.entities.Drink;
import project.service.SearchService;
import project.service.DrinkService;

import java.util.List;

@Controller
public class DrinkController {

    private DrinkService drinkService;

    @Autowired
    public DrinkController(DrinkService DrinkService) { this.drinkService = DrinkService;}

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
        // Search parameters will be put into Drink object
        model.addAttribute("Drink", new Drink());
        return "/search" + "/Search";
    }

    /**
     * Handles when the user post a search request
     * @param drink containing search parameters
     * @param model for the jsp
     * @return a jsp file containing the search site with added search results
     */
    @RequestMapping(value = "/search", method = RequestMethod.POST)
    public String DrinkSearch(@ModelAttribute("DrinkSearch") Drink drink, Model model) {

        List<Drink> results = (List<Drink>) drinkService.searchDrinkByName(drink);

        // Add results to model
        model.addAttribute("results", results);

        // Get things ready for new search
        model.addAttribute("Drink", new Drink());
        return "/search" + "/Search";
    }


}