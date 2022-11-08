package com.junitcrud.controller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.junitcrud.entity.PersonEntity;
import com.junitcrud.service.PersonService;

@RestController
@RequestMapping ("/punit")
public class PersonController {

    @Autowired
    private PersonService personService;

    @PostMapping("/addperson")
    public String addPeople(@RequestBody PersonEntity personEntity){
        return personService.addPeople(personEntity);
    }

    @GetMapping("/findAll")
    public List<PersonEntity> findAll(){
        return personService.findAll();
    }

    @DeleteMapping("/deleteById")
    public String deleteById(@RequestParam int id)
    {
        return personService.deleteById(id);
    }

    @GetMapping("/getById")
    public Optional<PersonEntity> getById(@RequestParam int id){
        return personService.getById(id);
    }
    @PostMapping("/updateById")
    public String updateById(@RequestBody PersonEntity personEntity){
        return personService.updateById(personEntity);
    }
}
