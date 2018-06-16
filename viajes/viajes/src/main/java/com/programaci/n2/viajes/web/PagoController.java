package com.programaci.n2.viajes.web;


import com.programaci.n2.viajes.model.Pago;
import com.programaci.n2.viajes.repository.PagoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;
import java.awt.*;

@Controller
public class PagoController {


    @Autowired
    private PagoRepository pagoRepository;


    @GetMapping("/viaje/new")
    public String initCreationForm0(Model model) {
        return "viajeForm";
    }



    @GetMapping("/pago/new1")
    public String initCreationForm(Model model) {
        model.addAttribute("pago", new Pago());
        return "pago1";
    }

    @PostMapping("/pago/new1")
    public String submitForm(@Valid Pago pago,
                             BindingResult bindingResult) {
        if(bindingResult.hasFieldErrors()) {
            return "pago1";
        }
        pago.setViaje1("Brasil");
        int value = pagoRepository.valuepk();
        pago.setValue(value);
        pagoRepository.insert(pago);

        return "index";
    }


    @GetMapping("/pago/new2")
    public String initCreationForm2(Model model) {
        model.addAttribute("pago", new Pago());
        return "pago2";
    }

    @PostMapping("/pago/new2")
    public String submitForm2(@Valid Pago pago,
                             BindingResult bindingResult) {
        if(bindingResult.hasFieldErrors()) {
            return "pago2";
        }

        pago.setViaje1("Tarma");
        int value = pagoRepository.valuepk();
        pago.setValue(value);
        pagoRepository.insert(pago);
        return "index";
    }


    @GetMapping("/pago/new3")
    public String initCreationForm3(Model model) {
        model.addAttribute("pago", new Pago());
        return "pago3";
    }

    @PostMapping("/pago/new3")
    public String submitForm3(@Valid Pago pago,
                              BindingResult bindingResult) {
        if(bindingResult.hasFieldErrors()) {
            return "pago3";
        }

        pago.setViaje1("Cusco");
        int value = pagoRepository.valuepk();
        pago.setValue(value);
        pagoRepository.insert(pago);
        return "index";
    }

    @GetMapping("/pago/new4")
    public String initCreationForm4(Model model) {
        model.addAttribute("pago", new Pago());
        return "pago4";
    }

    @PostMapping("/pago/new4")
    public String submitForm4(@Valid Pago pago,
                              BindingResult bindingResult) {
        if(bindingResult.hasFieldErrors()) {
            return "pago4";
        }

        pago.setViaje1("Rusia");
        int value = pagoRepository.valuepk();
        pago.setValue(value);
        pagoRepository.insert(pago);
        return "index";
    }



}
