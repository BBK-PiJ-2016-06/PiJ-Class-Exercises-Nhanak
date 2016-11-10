public interface PersonQueue {
  /**
  *adds another person to the Q
  */
  public void insert(Person person);
  /**
  *removes another person from the Q
  */
  public Person retrieve();
}
