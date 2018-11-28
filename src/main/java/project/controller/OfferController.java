package project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import project.persistence.entities.Offer;
import project.service.OfferService;

import java.util.List;


@Controller
public class OfferController {

    @GetMapping("/offer")
    public String offer(Model model) {

        model.addAttribute("offers", OfferService.findAll());


        return "offer";
    }
}
