package com.github.davidji80.springboot.neo4j.dao;

import com.github.davidji80.springboot.neo4j.model.Person;
import org.springframework.data.neo4j.repository.GraphRepository;

public interface PersonRepository extends GraphRepository<Person> {
}