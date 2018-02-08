package es.altair.springhibernate.dao;

import java.util.List;

import es.altair.springhibernate.bean.Person;

public interface PersonDAO {
	
	public List<Person> listPerson();
	
	public void editPerson(Person p);
	
	public void addPerson(Person p);
	
	public Person getPersonById(int id);
	
	public void deletePerson(int id);

}
