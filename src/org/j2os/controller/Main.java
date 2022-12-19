package org.j2os.controller;


import org.j2os.common.Spring;
import org.j2os.entity.Person;
import org.j2os.service.PersonService;

public class Main {
    public static void main(String[] args) {
        PersonService personService = (PersonService) Spring.getBean("personService");
        personService.save(new Person().setName("Sami"),new Person().setName("Sami"),new Person().setName("Samiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii"));

        for (Person person : personService.findAll()) {
            System.out.println(person.getId());
            System.out.println(person.getName());
        }

    }
}
