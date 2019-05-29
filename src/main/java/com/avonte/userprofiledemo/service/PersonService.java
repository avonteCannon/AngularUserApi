package com.avonte.userprofiledemo.service;

import com.avonte.userprofiledemo.model.Person;
import com.avonte.userprofiledemo.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonService {

    @Autowired
    PersonRepository personRepository;

    //CREATE
    public void addPerson(Person person) {
        personRepository.save(person);
    }

    //Create a service to get all users
    //GET ALL
    public Iterable<Person> getAllUsers() {
        return personRepository.findAll();
    }

    //Update
    public void updateUser(Person student) {
        personRepository.save(student);
    }

    //Delete
    public void deleteUser(Long id){
        personRepository.deleteById(id);
    }

    //Get One User
    public Optional<Person>getUser(Long id){
        return personRepository.findById(id);
    }


}
