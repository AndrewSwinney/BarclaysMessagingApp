package com.barclays;

import com.barclays.model.Message;
import com.barclays.model.Person;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class BarclaysMessagingAppApplicationTests {

	@Test void testGetAllMessages() {
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<Message[]> response = restTemplate.getForEntity("http://localhost:8080/messages", Message[].class);
		Message[] messages = response.getBody();
		assertEquals(messages.length, 1);
	}

	@Test void testGetAllPeople() {
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<Person[]> response = restTemplate.getForEntity("http://localhost:8080/person", Person[].class);
		Person[] people = response.getBody();
		assertEquals(people.length, 2);
	}

	@Test void testGetPerson() {
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity response;
		response = restTemplate.getForEntity("http://localhost:8080/person/1", Person.class);
		String person = response.getBody().toString();
		ArrayList<String> people = new ArrayList<>();
		people.add(person);
		assertEquals(1, people.size());
	}

	@Test
	void contextLoads() {
	}

}
