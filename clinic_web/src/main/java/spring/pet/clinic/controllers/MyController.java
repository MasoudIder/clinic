package spring.pet.clinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {

    @RequestMapping({"/",""})
    public String mainIndex(){
        return "index";
    }

    @RequestMapping("/vets")
    public String vetList(){
        return "vets/index";
    }

    @RequestMapping("/owners")
    public String ownerList(){
        return "owners/index";
    }

}
