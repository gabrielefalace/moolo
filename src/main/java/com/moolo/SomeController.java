package com.moolo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SomeController {

    @RequestMapping("/moolox")
    public String moolo(){
        return "MOOLOOOOOO";
    }

}