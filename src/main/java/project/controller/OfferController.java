package project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import project.persistence.entities.Offer;
import project.service.OfferService;
import java.util.List;


@Controller
public class OfferController {
    private OfferService offerService;

    @Autowired
    public OfferController(OfferService offerService) { this.offerService = offerService;}

    /**
     * Path: "/search"
     * Purpose: Displays the search home with input fields for the search
     *
     * @return the search jsp with input fields
     */
    @RequestMapping(value = "/search", method = RequestMethod.GET)
    public String searchHome(Model model) {
        // Save the Offer that we received from the form
        // Search parameters will be put into Offer object
        model.addAttribute("offer", new Offer());

        return "Search";
    }

    /**
     * Purpose:Save the offer that we received from the form
     * Search parameters will be put into Offer object
     */
    @RequestMapping(value = "/search", method = RequestMethod.POST)
    public String searchTmp(@ModelAttribute("offer") Offer offer, Model model) {

        model.addAttribute("offer", new Offer());
        model.addAttribute("offers", offerService.findAllByNameLike(offer.getName()));
        return "Search";

    }

    /**
     * Purpose: Gets all offers from databse and send it back to view
     * */
    @RequestMapping(value = "/search/{name}", method = RequestMethod.GET)
    public String searchByName(@PathVariable String name, Model model){
        // Get all Offers with this name from database
        List<Offer> nameOffer = offerService.findAllByNameLike(name);
        //  add the resulting list of offer objects to the model
        model.addAttribute( "offers", nameOffer);

        return "Search";
    }

}
