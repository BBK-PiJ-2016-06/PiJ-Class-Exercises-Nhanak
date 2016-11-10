public class Person {
  private String name;
  private String groceryBasket;
  private Person nextPerson;

  public Person(String name, String produce) { //constructor method
  this.name = name;
  groceryBasket = produce;
  }

  public String getName() { // returns name of person
    return name;
  }

  public void setGroceryBasket(String produce) { // adds an item to person's grocer basket
  groceryBasket = groceryBasket + ", " + produce;
  }

  public Person getNextPerson() { // returns current value of next person
    return nextPerson;
  }

  public void setNextPerson(Person nextPerson) { // sets nextPerson to the class of Person passed in to this method
    this.nextPerson = nextPerson;
  }
}
