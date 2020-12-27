package gabcamilo.demo.api;

import gabcamilo.demo.model.Person;
import gabcamilo.demo.service.PersonService;

public class PersonController {
  private final PersonService personService;

  public PersonController(PersonService personService) {
    this.personService = personService;
  }

  public void addPerson(Person person) {
    personService.addPerson(person);
  }
}
