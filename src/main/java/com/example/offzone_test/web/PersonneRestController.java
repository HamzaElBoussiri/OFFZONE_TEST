package com.example.offzone_test.web;

import com.example.offzone_test.entities.Personne;
import com.example.offzone_test.services.PersonneService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@AllArgsConstructor

public class PersonneRestController {

    private PersonneService personneService;


    @GetMapping(path = "/")
    public String index(){
        return "index";
    }
    //Route 1
    @GetMapping("/personnes")
    public List<Personne> getAll(){
        return personneService.getPersonnes();
    }
    //Route 2
    @GetMapping("/personnes/{id}")
    public List<Personne> getById(@PathVariable(name = "id") Long id){
        return personneService.getPersonnesById(id);

    }
    @PostMapping("/personnes")
    public  Personne saveCustomer(@RequestBody  Personne personne ){
        return personneService.savePersonne(personne);
    }

}
