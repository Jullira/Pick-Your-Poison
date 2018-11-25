package project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import project.persistence.entities.Whiskey;
import project.service.StringManipulationService;
import project.service.WhiskeyService;

@Controller
public class WhiskeyFormController {
    StringManipulationService stringService;

    // Dependency Injection
    @Autowired
    public WhiskeyFormController(StringManipulationService stringService) {
        this.stringService = stringService;
    }

    // get whiskey search result from database
    @RequestMapping(value = "/whiskey", method = RequestMethod.GET)
    public String WhiskeyViewGet(Model model) {
        this.stringService = stringService;


        model.addAttribute("whiskey", new Whiskey());

        return "/whiskeySearchResult";
    }

    // get whiskey search page
    @RequestMapping(value = "/whiskeysearch")
    public String WhiskeySearchGet(Model model) {
        this.stringService = stringService;
        model.addAttribute("whiskey", new Whiskey());
        return "whiskeysearch/WhiskeySearch";
    }

    // get location search page
    @RequestMapping(value = "/locationsearch")
    public String LocationSearchGet(Model model) {
        this.stringService = stringService;
        model.addAttribute("whiskey", new Whiskey());
        return "locationsearch/LocationSearch";
    }

    // Request mapping is the path that you want to map this method to
    // In this case, the mapping is the root "/", so when the project
    // is running and you enter "localhost:8080" into a browser, this
    // method is called
    @RequestMapping(value = "/form", method = RequestMethod.GET)
    public String Form() {

        // The string "Index" that is returned here is the name of the view
        // (the Index.jsp file) that is in the path /main/webapp/WEB-INF/jsp/
        // If you change "Index" to something else, be sure you have a .jsp
        // file that has the same name
        return "Form";
    }

}

