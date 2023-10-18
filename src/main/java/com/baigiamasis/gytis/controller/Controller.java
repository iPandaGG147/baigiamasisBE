package com.baigiamasis.gytis.controller;

import com.baigiamasis.gytis.model.Person;
import com.baigiamasis.gytis.model.Positions;
import com.baigiamasis.gytis.repository.PersonRepository;
import com.baigiamasis.gytis.repository.PositionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Autowired
    PersonRepository personRepository;

    @PostMapping("/addPerson")
    public String addPerson(@RequestBody Person worker){
        personRepository.save(worker);
        return "New person is added";
    }

    @Autowired
    PositionRepository positionRepository;

    @PostMapping("/addpositions")
    public String addPosition(@RequestBody Positions position){
        positionRepository.save(position);
        return "New postition is added";
    }


}