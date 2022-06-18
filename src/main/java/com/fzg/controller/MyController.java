package com.fzg.controller;

import com.fzg.service.MyService;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Setter
@Component(value = "controller")
public class MyController {
    @Autowired
    private MyService myService;
    public String doController(Double score){
        return myService.doService(score);
    }
}
