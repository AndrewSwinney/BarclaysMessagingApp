package com.barclays;


import com.barclays.controller.PersonController;
import com.barclays.model.Message;
import com.barclays.model.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class PersonControllerIntegrationTests {

    @Autowired
    PersonController personController;

    @Test
    public void testGetAllPeople(){
        List<Person> people = personController.getAllPeople();
        assertEquals(2, people.size());
    }

    @Test
    public void testGetPerson1(){
        Person person = personController.getPerson(1);
        assertEquals("Joyce1", person.getName());
    }
}
