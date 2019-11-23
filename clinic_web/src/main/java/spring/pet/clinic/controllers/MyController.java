package spring.pet.clinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import spring.pet.clinic.services.OwnerService;
import spring.pet.clinic.services.VetService;

@Controller
public class MyController {

    private final OwnerService ownerService;
    private final VetService vetService;

    public MyController(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @RequestMapping({"/", ""})
    public String mainIndex() {
        return "index";
    }

    @RequestMapping({"/vets","/vets.html"})
    public String vetList(Model model) {
        model.addAttribute("vets", vetService.findAll());
        return "vets/index";
    }

    @RequestMapping("/owners")
    public String ownerList(Model model) {
        model.addAttribute("owners", ownerService.findAll());
        return "owners/index";
    }

    @RequestMapping({"/owners/find","/oups"})
    public String ownerFind() {
        return "Notimplemented";
    }

}
