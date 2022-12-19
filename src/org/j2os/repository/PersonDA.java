package org.j2os.repository;

import org.j2os.entity.Person;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class PersonDA {
    @PersistenceContext
    private EntityManager entityManager;


    public void save(Person person) {
        entityManager.persist(person);
    }

    public List<Person> findAll()
    {
        return entityManager.createQuery("select o from person o").getResultList();
    }
}
