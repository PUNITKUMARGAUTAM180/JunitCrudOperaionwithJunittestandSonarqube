//package com.junitcrud.service;
//
//import static org.mockito.ArgumentMatchers.any;
//import static org.mockito.Mockito.when;
//import java.util.ArrayList;
//import java.util.List;
//import org.junit.jupiter.api.Test;
//import org.mockito.Mock;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import com.junitcrud.dao.PersonDao;
//import com.junitcrud.entity.PersonEntity;
//
//@SpringBootTest
//public class ServiceTest {
//
//    @Mock
//    private PersonDao personDao;
//    @Autowired
//    private PersonService personService;
//
//    @Test
//    public void addPeopleTest(){
//        PersonEntity personEntity=new PersonEntity(1,"Amitkumar","Dinapurvaranasi","GautamSingh");
//        when(personDao.save(personEntity)).thenReturn(any());
//        personService.addPeople(personEntity);
//
//    }
//
//    @Test
//    public void updateByIdTest(){
//        PersonEntity personEntity=new PersonEntity(6,"Amit","Dinapur","Gautam");
//        when(personDao.save(personEntity)).thenReturn(any());
//        personService.updateById(personEntity);
//
//    }
//    @Test
//    public void getByIdTest(){
//        PersonEntity personEntity=new PersonEntity();
//        personEntity.setId(1);
//        when(personDao.findById(personEntity.getId())).thenReturn(any());
//        personService.getById(personEntity.getId());
//    }
//
//    @Test()
//    public void findAllTest(){
//        List<PersonEntity> personEntityList=new ArrayList<>();
//        when(personDao.findAll()).thenReturn(personEntityList);
//        personService.findAll();
//
//    }
//
//    @Test
//    public void deleteByIdTest() {
//        PersonEntity personEntity=new PersonEntity();
//        personEntity.setId(3);
//        personDao.deleteById(personEntity.getId());
//        personService.deleteById(personEntity.getId());
//
//    }
//}
