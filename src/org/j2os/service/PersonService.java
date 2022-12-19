package org.j2os.service;

import org.j2os.entity.Person;
import org.j2os.repository.PersonDA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PersonService {
    @Autowired
    private PersonDA personDA;

    @Transactional
    public void save(Person person1,Person person2, Person person3) {
        personDA.save(person1);
        personDA.save(person2);
        personDA.save(person3);
    }

    public List<Person> findAll() {
        return personDA.findAll();
    }
}
