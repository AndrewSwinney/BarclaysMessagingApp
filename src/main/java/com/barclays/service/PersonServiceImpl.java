package com.barclays.service;

import com.barclays.model.Person;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
@AllArgsConstructor
public class PersonServiceImpl implements PersonService{

    @Override
    public List<Person> findAll() {
        List<Person> personList = new ArrayList<>();
        Person person = new Person();
        person.setName("Harry");
        personList.add(person);
        Person person1 = new Person();
        person1.setName("Kim");
        personList.add(person1);
        return personList;
    }

    @Override
    public Person findById(int id) {
        Person person = new Person();
        person.setName("Joyce" + id);
        return person;
    }
}
