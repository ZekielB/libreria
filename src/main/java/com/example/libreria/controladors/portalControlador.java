package com.example.libreria.controladors;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class portalControlador {


    @GetMapping("/")
    public String index(){


        return "/index";
    }

}
