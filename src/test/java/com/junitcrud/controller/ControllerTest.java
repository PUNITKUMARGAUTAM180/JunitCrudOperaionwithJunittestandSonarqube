package com.junitcrud.controller;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.junitcrud.entity.PersonEntity;
import com.junitcrud.service.PersonService;

@SpringBootTest
public class ControllerTest {

    @Autowired
    private PersonController personController;

    @Mock
     PersonService personService;

    @Test
    public void addPeopleTest(){
        PersonEntity personEntity=new PersonEntity(8,"Rohit","Chandauli","Singh");
        when(personService.addPeople(personEntity)).thenReturn(any());
        personController.addPeople(personEntity);
    }

    @Test
   public void getByIdTest(){
        PersonEntity personEntity=new PersonEntity();
        personEntity.setId(1);
        when(personService.getById(personEntity.getId())).thenReturn(any());
        personController.getById(personEntity.getId());

    }

    @Test()
    public void findAllTest(){
        List<PersonEntity> personEntityList=new ArrayList<>();
        when(personService.findAll()).thenReturn(personEntityList);
        personController.findAll();

    }

    @Test
    public void deleteByIdTest() {
        PersonEntity personEntity=new PersonEntity();
        personEntity.setId(4);
        when(personService.deleteById(personEntity.getId())).thenReturn(any());
        personController.deleteById(personEntity.getId());

    }

    @Test
    public void updateByIdTest(){
        PersonEntity personEntity=new PersonEntity(9,"Raju","Ghajipur","Maurya");
        when(personService.updateById(personEntity)).thenReturn(any());
        personController.updateById(personEntity);

    }
}
