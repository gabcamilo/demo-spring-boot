package gabcamilo.demo.model;

import java.util.UUID;

public class Person {
  private final UUID id;
  private string name;

  public Person(UUID id, string name) {
    this.id = id;
    this.name = name;
  }

  public UUID getId() {
    return id;
  }

  public string getName() {
    return name;
  }
}
