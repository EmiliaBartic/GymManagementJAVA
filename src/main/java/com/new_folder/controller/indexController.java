package com.new_folder.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class indexController {
    @GetMapping(value = "/index")
    public String indexPage() {
        return "index"; //demo.html must exist in resources/templates
    }
}
