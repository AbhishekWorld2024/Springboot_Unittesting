package com.example.Springboot_unittesting;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Addcontroller {

    @Autowired
    ServiceADD serviceadd;
    @RequestMapping("/Adding")
    public int addnumber(@RequestParam int a,@RequestParam int b){
        return serviceadd.add(a,b);
    }

}
