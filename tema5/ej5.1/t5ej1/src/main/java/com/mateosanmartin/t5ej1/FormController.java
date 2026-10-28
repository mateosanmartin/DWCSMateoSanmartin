package com.mateosanmartin.t5ej1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;



@Controller
public class FormController {
    @GetMapping("/")
    public String showForm(Model model) {
        model.addAttribute("form", new Form());
        return "formView";
    }

    @PostMapping("/")
    public String showFormSubmit(Model model, Form form) {
        int resultado = form.getOperador1() + form.getOperador2();
        model.addAttribute("resultado", resultado);
        return "formSubmitView";
    }
    
    
}

