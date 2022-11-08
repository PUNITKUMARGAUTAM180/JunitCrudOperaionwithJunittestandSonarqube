package com.junitcrud.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="People")
public class PersonEntity
{
    public PersonEntity() {
        super();
    }

    public PersonEntity(int id, String personName, String personaddress, String persontitle) {
        this.id = id;
        this.personName = personName;
        this.personaddress = personaddress;
        this.persontitle = persontitle;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    int id;
    String personName;
    String personaddress;
    String persontitle;

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getPersonaddress() {
        return personaddress;
    }

    public void setPersonaddress(String personaddress) {
        this.personaddress = personaddress;
    }

    public String getPersontitle() {
        return persontitle;
    }

    public void setPersontitle(String persontitle) {
        this.persontitle = persontitle;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "PersonEntity{" + "id=" + id + ", personName='" + personName + '\'' + ", personaddress='" + personaddress + '\'' + ", persontitle='" + persontitle + '\'' + '}';
    }
}
