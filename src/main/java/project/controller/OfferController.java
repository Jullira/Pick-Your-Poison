package project.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import project.persistence.entities.Drink;
import project.persistence.entities.Offer;
import project.persistence.entities.Location;
import project.service.OfferService;
import project.service.StringManipulationService;

import java.util.List;


@Controller
@RequestMapping("/")
public class OfferController {
    // Instance Variables
    private OfferService offerService;

    @Autowired
    public OfferController(OfferService offerService) { this.offerService = offerService;}

    /**
     * Path: "/search"
     * Purpose: inserts input object for the search
     * @return the search jsp with input fields
     */
    @RequestMapping(value = "/search")
    public String searchHome(Model model) {

        // Search parameters will be put into Offer object
        model.addAttribute("Offer", new Offer());
        // Return the view
        return "search";
    }

    /**
     * @param
     *
     * @return the search jsp with input fields
     */

    @RequestMapping(value = "/search/{name}", method = RequestMethod.POST)
    public String searchByName(@PathVariable String name, Model model){

        // Get all Offers with this name from service
        List<Offer> nameOffer = offerService.findByName(name);
       // add the list to the model
        model.addAttribute( "Offer", nameOffer);

        // Return the view
        return "search";
    }

}
