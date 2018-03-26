package com.example.demo1.repositories;

import java.util.Collection;

import com.example.demo1.models.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PersonRepository extends CrudRepository<Person, Long> {

    Collection<Person> findAll();

    Person findByUsername(String username);

}
