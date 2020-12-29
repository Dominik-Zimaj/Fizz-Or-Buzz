package com.zimaj.FizzBuzz;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("/result")
    public ArrayList<String> getFizzOrBuzz(@RequestParam (value = "value")long value) {
        
        return FizzOrBuzz.result(value);
    }
}
