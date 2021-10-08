package com.example.demo.controller;

import com.example.demo.repository.UsuarioRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {
    
    @Autowired
    UsuarioRepository userRepository;
    
    @RequestMapping("/")
    public String welcome() {
        return "welcome";
    }

    //localhost:8080/dados
    @RequestMapping("/dados")
    public String dados(Model model) {
        model.addAttribute("usuarios", userRepository.findAll());
        return "dados";
    }

}
