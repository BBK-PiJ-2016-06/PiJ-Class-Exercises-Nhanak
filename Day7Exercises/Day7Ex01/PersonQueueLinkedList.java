public class PersonQueueLinkedList implements PersonQueue {
  private Person frontPerson = null;

  public void insert(Person nextPersonInQueue) { // creates a linked list, adds people to the end of it
    if (frontPerson == null) {
      frontPerson = nextPersonInQueue;
    } else {
        Person currentPerson = frontPerson; /* your first person does have a value of next person, but now currrent person
        * essentially becomes a third "floating" entity that also now points to the 2nd in line
        */
        while (currentPerson.getNextPerson() != null) { // this LOOKS at currentPerson's nextperson, checks if it's null
          currentPerson = currentPerson.getNextPerson(); // this MAKES currentPerson equal its own value of nextPerson
        }
        currentPerson.setNextPerson(nextPersonInQueue);
        // currentPerson is now the value of the last person in line, because we know its nextPerson = null
        // so now changes made to currentPerson will also happen to the last person in line
        // after this method is over, currentPerson goes away, but the changes remain
      }
  }

  public Person retrieve() { // this will remove a person from front of the line
      if (frontPerson == null) {
        System.out.println("Line empty");
        Person noOne = new Person("no one", "nothing"); // retrieve method requires some person to be returned.
        return noOne;        // so return one that disappears after method is over
      } else {
          Person currentPerson = frontPerson; // make copy of front person to return
          frontPerson = frontPerson.getNextPerson(); // this makes frontPerson become its own nextPerson
          return currentPerson; // return the copy of the frontPerson
        }
  }
}
