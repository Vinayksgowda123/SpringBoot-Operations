package com.example.practice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ModelAttribute;
import java.util.*;

@Controller
public class IplController {

    @Autowired
    service service;

    @GetMapping("/getteam")
    public String getteam(Model model) throws Exception {
        model.addAttribute("Iplteams", service.getteams());
        return "Iplteams";
    }

    @PostMapping("/addteam")
    public String addIplteam(@ModelAttribute Iplteam team) throws Exception {
        service.saveIplteam(team);
        return "redirect:/getteam";
    }

    @PutMapping("/updateteam/{teamname}/{teamcaptain}")
    public String updatecaptain(@PathVariable String teamname, @PathVariable String teamcaptain) throws Exception {
        service.updatecaptain(teamname, teamcaptain);
        return "redirect:/getteam";
    }

    @DeleteMapping("/deleteteam/{teamname}")
    public String deleteam(@PathVariable String teamname) throws Exception {
        service.deleteam(teamname);
        return "redirect:/getteam";
    }
}