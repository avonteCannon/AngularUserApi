package com.avonte.userprofiledemo.repositories;

import com.avonte.userprofiledemo.model.Person;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person, Long> {
}
