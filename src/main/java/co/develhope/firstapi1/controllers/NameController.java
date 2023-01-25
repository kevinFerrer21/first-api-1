package co.develhope.firstapi1.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NameController {

    @GetMapping("/name")
    public String getMyName(){
        return "Kevin";
    }

    @PostMapping("/name")
    public StringBuilder postMyName(){
        StringBuilder stringBuilder = new StringBuilder("Kevin");
        StringBuilder reverse = stringBuilder.reverse();
        return reverse;
    }

}