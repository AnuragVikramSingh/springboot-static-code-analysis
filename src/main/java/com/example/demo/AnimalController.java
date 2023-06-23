package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class AnimalController {

	@GetMapping("/animals")
    @CrossOrigin(origins = "*")
	public Map<String, String[]> getAnimals(){
        HashMap<String, String[]> map = new HashMap<>();
        map.put("animals", new String[]{"Dog", "Cat", "Lion", "Cow", "Elephant"});
        return map;
    }
}


