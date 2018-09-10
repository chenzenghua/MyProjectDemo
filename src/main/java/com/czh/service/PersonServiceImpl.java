package com.czh.service;
 
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.czh.bean.Person;
import com.czh.dao.PersonDao;
@Service("personService")
public class PersonServiceImpl implements PersonService {
	
	@Autowired
	private PersonDao personDao;
	
	public PersonDao getPersonDao() {
		return personDao;
	}
 
	public void setPersonDao(PersonDao personDao) {
		this.personDao = personDao;
	}
 
	public List<Person> findAll() {
		return personDao.findall();
	}
 
}
