package com.avonte.userprofiledemo.controller;


import com.avonte.userprofiledemo.model.Person;
import com.avonte.userprofiledemo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.Optional;

@RestController
@CrossOrigin (origins = "http://localhost:4200")
public class PersonController {

    @Autowired
    public PersonService personService;

    //localhost:8080/user is the REQUEST
    @RequestMapping(value = "/user", method = RequestMethod.POST)
    public ResponseEntity<Object> addPersonRecord(@RequestBody Person person) {
        personService.addPerson(person);

        // Set the location header for the newly created resource (201)
        HttpHeaders responseHeaders = new HttpHeaders();
        URI newPersonUri = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(person.getId())
                .toUri();

        responseHeaders.setLocation(newPersonUri);
        return new ResponseEntity<>(null, responseHeaders, HttpStatus.CREATED);
    }

    //Create a endpoint to get all students
    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public Iterable<Person> getAllUsersRecord() {
        return personService.getAllUsers();
    }

    //Delete
    @RequestMapping(value = "/user/{id}", method = RequestMethod.DELETE)
    public void deleteUserRecord(@PathVariable Long id) {
        personService.deleteUser(id);
    }

    //Update
    @RequestMapping(value = "/user/{id}", method = RequestMethod.PUT)
    public void updateUserRecord(@RequestBody Person person, @PathVariable Long id) {
        personService.updateUser(person);
    }

    //Get One Back
    @RequestMapping(value = "user/{id}", method = RequestMethod.GET)
    public Optional<Person> getOneUserRecord(@PathVariable Long id) {
        return personService.getUser(id);
    }
}
