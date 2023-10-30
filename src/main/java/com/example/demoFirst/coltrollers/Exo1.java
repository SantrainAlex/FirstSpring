package com.example.demoFirst.coltrollers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@RequestMapping(value = "base")
public class Exo1 {

    @RequestMapping(value = "/1-param")
    public String oneParam(Model model){
        model.addAttribute("prenom","Alexis");
        return "exo/oneParam";
    }

    @RequestMapping(value = "/2-param")
    public String twoParam(Model model){
        model.addAttribute("prenom","Alexis");
        model.addAttribute("nom","Santrain");
        return "exo/twoParam";
    }

    @RequestMapping(value = "/coll-param")
    public String collParam(Model model){
        List<String> marques = List.of("VW", "Audi");
        model.addAttribute("marques", marques);
        return "exo/collParam";
    }

}
