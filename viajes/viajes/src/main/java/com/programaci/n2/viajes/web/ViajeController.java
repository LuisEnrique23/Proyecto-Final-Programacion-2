package com.programaci.n2.viajes.web;


import com.programaci.n2.viajes.model.Viaje;
import com.programaci.n2.viajes.repository.ViajeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class ViajeController {


    @Autowired
    private ViajeRepository viajeRepository;


    @GetMapping("/viaje/new")
    public String initCreationForm(Model model) {
        model.addAttribute("viaje", new Viaje());
        return "viajeForm";
    }

    @PostMapping("/viaje/new")
    public String submitForm(@Valid Viaje viaje,
                             BindingResult bindingResult) {
        if(bindingResult.hasFieldErrors()) {
            return "viajeForm";
        }


        viajeRepository.insert(viaje);

        return "viajeForm";
    }


   /* @GetMapping("/salary/list")
    public String list(Map<String, Object> model) {
        List<Salary> salary =salaryRepository.findAll();
        model.put("salary", salary);
        return "listLoan";
    }*/



}
