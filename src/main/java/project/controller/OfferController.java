package project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import project.persistence.entities.Offer;
import project.persistence.entities.PostitNote;
import project.service.OfferService;
import project.service.StringManipulationService;

import java.util.List;


@Controller
public class OfferController {
    private OfferService offerService;

    @Autowired
    public OfferController(OfferService offerService) { this.offerService = offerService;}

    @RequestMapping(value = "/search", method = RequestMethod.GET)
    public String searchHome(Model model) {
        // Search parameters will be put into Offer object
        model.addAttribute("Offer", new Offer());
        return "/search" + "/Search";
    }

    @RequestMapping(value = "/Search", method = RequestMethod.GET)
    public String search(@PathVariable String name, Model model){
    // variable sem heitir lookup
        // Get all Postit Notes with this name and add them to the model
        List<Offer> results = (List<Offer>) model.addAttribute("Offers", offerService.searchOfferByName(name));
        model.addAttribute("results", results);

        model.addAttribute("Drink", new Offer());
        System.out.println("-------SKLABOÐ ÚT CONTROLLER------------");

        // Return the view
        return "Search";
    }
    /*
    *    @RequestMapping(value = "/Search", method = RequestMethod.GET)
    public String search(@PathVariable String name, Model model){
    // variable sem heitir lookup
        // Get all Postit Notes with this name and add them to the model
        List<Offer> results = (List<Offer>) model.addAttribute("Offers", offerService.searchOfferByName(name));
        model.addAttribute("results", results);

        model.addAttribute("Drink", new Offer());
        System.out.println("-------SKLABOÐ ÚT CONTROLLER------------");

        // Return the view
        return "Search";
    }
    *
    * */



}
