//package com.junitcrud.dao;
//
//import static org.mockito.ArgumentMatchers.any;
//import static org.mockito.Mockito.when;
//import java.util.ArrayList;
//import java.util.List;
//import org.junit.jupiter.api.Test;
//import org.mockito.Mock;
//import org.springframework.boot.test.context.SpringBootTest;
//import com.junitcrud.entity.PersonEntity;
//@SpringBootTest
//public class DaoTest {
//
//    @Mock
//    PersonDao personDao;
//
//    @Test
//    public void getById(){
//        PersonEntity personEntity=new PersonEntity(5,"Punit Kumar","Varanasi","Gautam");
//        personDao.findById(personEntity.getId());
//
//    }
//
//    @Test
//    public void findAllTest(){
//        List<PersonEntity> personEntityList=new ArrayList<>();
//        when(personDao.findAll()).thenReturn(personEntityList);
//
//    }
//
//    @Test
//    public void deleteByIdTest() {
//        PersonEntity personEntity=new PersonEntity();
//        personEntity.setId(8);
//        personDao.deleteById(personEntity.getId());
//
//
//    }
//
//    @Test
//    public void getByIdTest(){
//        PersonEntity personEntity=new PersonEntity();
//        personEntity.setId(10);
//        when(personDao.findById(personEntity.getId())).thenReturn(any());
//
//    }
//    @Test
//    public void updateByIdTest(){
//        PersonEntity personEntity=new PersonEntity(11,"Bharat","Sio","Yadav");
//        when(personDao.save(personEntity)).thenReturn(any());
//
//
//    }
//}
