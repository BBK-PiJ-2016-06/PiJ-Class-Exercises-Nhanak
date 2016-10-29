public class Supermarket {

  private PersonQueueLinkedList queue = null;

  public void addPerson(Person newShopper) { // this adds a person to the supermarket's queue
    if (queue == null) {
      queue = new PersonQueueLinkedList();
      queue.insert(newShopper);
      System.out.println(newShopper.getName() + " is first in line.");
    } else {
        queue.insert(newShopper);
        System.out.println(newShopper.getName() + " has been added to the back of the line.");
      }
  }

  public Person servePerson() {  // this will remove the person at the front of the line.
    if (queue == null) {
      System.out.println("There is no one in line");
      Person noOne = new Person("Nope", "has nothing");
      return noOne;
    } else {
        Person nowServing = queue.retrieve();
        System.out.println( "Now serving: " + nowServing.getName() );
        if (nowServing.getNextPerson() == null) {
          System.out.println("All customers served");
          queue = null;
        }
        return nowServing;
      }
  }

}
