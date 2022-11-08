package com.junitcrud.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.junitcrud.dao.PersonDao;
import com.junitcrud.entity.PersonEntity;

@Service
public class PersonService {
    @Autowired
    private PersonDao personDao;

    public String addPeople(PersonEntity personEntity) {
        personDao.save(personEntity);
        return "Data saved succesfully";
    }

    public List<PersonEntity> findAll() {
        return personDao.findAll();
    }

    public String deleteById(int id) {
        personDao.deleteById(id);
        return "Delete successfully";
    }

    public Optional<PersonEntity> getById(int id) {
        return personDao.findById(id);
    }

    public String updateById(PersonEntity personEntity) {
        personDao.save(personEntity);
        return "Data updated Successfully";
    }
}
