package com.barclays.controller;

import com.barclays.model.Person;
import com.barclays.service.PersonService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PersonController {

    private final PersonService personService;


    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping("/person")
    public List<Person> getAllPeople() {
       return personService.findAll();
    }

    @GetMapping("/person/{id}")
    public Person getPerson(@PathVariable int id) {
        return personService.findById(id);
    }

}
