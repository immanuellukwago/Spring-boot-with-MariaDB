package com.immanuel.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.immanuel.app.entities.Passenger;
import com.immanuel.app.service.PassengerService;


@Controller
public class HomeController {

    @Autowired
    private PassengerService service;

    @GetMapping("/home")
    public String home(Model model) {
        model.addAttribute("passenger", new Passenger());
        return "getPassenger";
    }

    //get all the passengers
    @GetMapping("/pp")
    public String getAllPassenger(Model model) {
        model.addAttribute("list", service.getAllPassengers().toArray());
        return "listOfPassengers";
    }

    @GetMapping("/delete/{id}")
    public String deletePassenger(@PathVariable(value = "id") Long id, Model model) {
        service.deletePassenger(id);
        model.addAttribute("delete", service.getAllPassengers());
        return "redirect:/pp";
    }

    @GetMapping(value = "/register")
    public String savePassenger(@ModelAttribute Passenger passenger) {
        service.savePassenger(passenger);
        return "redirect:/pp";
    }

    @PostMapping("/submit")
    public String saveEntry(@ModelAttribute("passenger") Passenger passenger) {
        service.savePassenger(passenger);
        return "redirect:/pp";
    }

}
