package de.mibexx.fizzbuzz.controller;

import de.mibexx.fizzbuzz.data.NumberDto;
import de.mibexx.fizzbuzz.port.api.GeneratorPort;
import de.mibexx.fizzbuzz.port.api.TransformServicePort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class FizzBuzzController {

    @Autowired
    private GeneratorPort generatorPort;

    @GetMapping("/")
    public List<NumberDto> getNumbers(@RequestParam int start, @RequestParam int end) {
        return generatorPort.generateNumbers(start, end);
    }

}
