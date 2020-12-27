package gabcamilo.demo.service;

import gabcamilo.demo.dao.PersonDao;
import gabcamilo.demo.model.Person;

public class PersonService {
  private final PersonDao personDao;

  public PersonService(PersonDao personDao) {
    this.personDao = personDao;
  }

  public int addPerson(Person person) {
    return personDao.insertPerson(person);
  }
}
