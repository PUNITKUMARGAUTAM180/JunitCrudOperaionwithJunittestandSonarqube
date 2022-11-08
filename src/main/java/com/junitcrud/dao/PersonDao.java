package com.junitcrud.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.junitcrud.entity.PersonEntity;

@Repository
public interface PersonDao extends JpaRepository <PersonEntity,Integer> {

}
