package com.example.validado;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class OlaController {
    @GetMapping("/ola")
    public String mostrarNavbar(){

        return "navbar";
    }
}
