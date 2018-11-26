package project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;
import project.persistence.entities.Drink;
import project.persistence.entities.User;
import project.service.AuthorizationService;
import project.service.DrinkInsertService;
import project.service.DrinkInsertServiceInsertService;

import java.util.ArrayList;
import java.util.List;

public class DrinkInsertController {

    @Controller
    public class InsertController {

        private final String path = "/insert";
        private DrinkInsertService drinkInsertService;
        private AuthorizationService authorizationService;
    }


    @Autowired
    public DrinkInsertController(DrinkInsertService drinkInsertService, AuthorizationService authorizationService) {
        this.drinkInsertService = drinkInsertService;
        this.authorizationService = authorizationService;

        //Vantar að setja inn hvaða params er hægt að gefa drink

    }

    @RequestMapping(value = path, method = RequestMethod.POST)
    public ModelAndView InsertDrink(@ModelAttribute("drink") Drink drink, Model model) {

        // User can only insert a restaurant if he is logged in and is a manager
        if (authorizationService.isLoggedIn() && authorizationService.getUser().getType() == User.Type.MANAGER) {

            // For the menu bar
            model.addAttribute("usersession", this.authorizationService.getUser());

            // Saves the restaurant to the database
            drinkInsertService.save(drink);

            // Gets things ready for a new restaurant to be added
            model.addAttribute("drink", new Drink());

            // Information for the inserted restaurant to inform the user the inserted restaurant
            model.addAttribute("newDrink", drink);
            model.addAttribute("inserted", true);
            return new ModelAndView("insert/insertDrink");

            // If user is not logged in we redirect him to the log in site
        } else {
            return new ModelAndView(new RedirectView("/login"));
        }
    }
}
