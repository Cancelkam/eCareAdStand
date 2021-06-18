package com.javaSchool.AdStand.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdStandController {

@GetMapping(value = "/tariffs")
    public String showStand(){

    return "/tariffs";
}
}
