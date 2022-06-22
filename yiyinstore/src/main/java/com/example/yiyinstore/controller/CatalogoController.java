package com.example.yiyinstore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class CatalogoController {

    @RequestMapping("/catalogo")
    public String cat(){
        return "catalogo";
    }

    
    
}
