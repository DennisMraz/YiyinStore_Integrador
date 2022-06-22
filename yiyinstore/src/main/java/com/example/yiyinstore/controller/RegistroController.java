package com.example.yiyinstore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RegistroController {

    @RequestMapping("/registro")
    public String reg(){
        return "registro";
    }
    
}
