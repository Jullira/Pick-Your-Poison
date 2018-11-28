package project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import project.service.WhiskeyService;
import project.service.DrinkService;
import project.service.LocationService;

@Controller
public class QueryController {

    // Instance Variables
    private WhiskeyService whiskeyService;
    private DrinkService drinkService;
    private LocationService locationService;

    // Dependency Injection
    @Autowired
    public QueryController(WhiskeyService whiskeyService, DrinkService drinkService, LocationService locationService) {
        this.whiskeyService = whiskeyService;
        this.drinkService = drinkService;
        this.locationService = locationService;
    }

    @RequestMapping(value = "/query", method = RequestMethod.GET)
    public String QueryViewGet(Model model){

        model.addAttribute("queryresult",new Query());

        // Here we get all the Postit Notes (in a reverse order) and add them to the model
        model.addAttribute("queryresults",QueryService.findAllReverseOrder());

        // Return the view
        return "queryresults/QueryResults";
    }
}
