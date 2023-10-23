package com.baigiamasis.gytis.controller;

import com.baigiamasis.gytis.exception.PersonNotFoundException;
import com.baigiamasis.gytis.model.Person;
import com.baigiamasis.gytis.model.Positions;
import com.baigiamasis.gytis.repository.PersonRepository;
import com.baigiamasis.gytis.repository.PositionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;



@RestController
@CrossOrigin("http://localhost:3000")
public class Controller {

    @Autowired
    private PersonRepository personRepository;

    @PostMapping("/person")
    Person newPerson(@RequestBody Person newPerson){
        return personRepository.save(newPerson);
    }
    @GetMapping("/persons")
    List<Person> getAllPersons(){
        return personRepository.findAll();
    }

    @GetMapping("/person/{id}")
    Person getPersonById(@PathVariable int id){
        return personRepository.findById(id)
                .orElseThrow(()-> new PersonNotFoundException(id));
    }

    @PutMapping("/person/{id}")
    Person updatePerson(@RequestBody Person person, @PathVariable int id){
        return personRepository.findById(id)
                .map(Person -> {
                    person.setName(person.getName());
                    person.setLastName(person.getLastName());
                    person.setAge(person.getAge());
                    person.setEducation(person.getEducation());
                    person.setEmail(person.getEmail());
                    person.setPhoneNumber(person.getPhoneNumber());
                    person.setStartedDate(person.getStartedDate());
                    return personRepository.save(person);
                }).orElseThrow(()-> new PersonNotFoundException(id));
    }
    @DeleteMapping("/person/{id}")
    String deletePerson(@PathVariable int id) {
        if (!personRepository.existsById(id)) {
            throw new PersonNotFoundException(id);
        }
        personRepository.deleteById(id);
        return "Person with ID: " + id + " has been removed";
    }





    @Autowired
    private PositionRepository positionRepository;
    @PostMapping("/addpositions")
    public String addPosition(@RequestBody Positions position){
        positionRepository.save(position);
        return "New postition is added";
    }
    @GetMapping("/getAllPositions")
    public List<Positions> getAllPositions(){
        return positionRepository.findAll();
    }

}