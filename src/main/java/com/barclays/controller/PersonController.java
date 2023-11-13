package com.barclays.controller;

import com.barclays.model.Message;
import com.barclays.model.Person;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class PersonController {

    @GetMapping("/person")
    public List<Person> getAllPeople() {
        List<Person> personList = new ArrayList<>();
        Person person = new Person();
        person.setName("Harry");
        personList.add(person);
        return personList;
    }
}
