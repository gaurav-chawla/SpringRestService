package com.gc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.gc.pojo.Person;


@Controller
@RequestMapping("/Example")
public class Example {

	@RequestMapping(value="getPhoneList/{name}", method = RequestMethod.GET)
	public @ResponseBody Person getPhoneList(@PathVariable String name) {
 
		Person person = new Person();
		person.setName(name);
		List<Long> phoneNumbers = new ArrayList<Long>();
		phoneNumbers.add(1234567890l);
		phoneNumbers.add(9876543210l);
		
		person.setPhoneNumbers(phoneNumbers);
 
		return person;
		
	}

}
