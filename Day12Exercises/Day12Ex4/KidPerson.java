public class KidPerson implements Person {
  private int position;
  private Brain brain;

  /**
  * Move a distance in a straight line, given in meters
  */
  public void move(int distance) {
    crawl(distance);
  }

  /**
  * Say something
  */
  public void say(String message) {
    String finalMsg = getUnderstoodWords(message);
    System.out.println(finalMsg);
  }

  private void crawl(int distance) {
    for (int i = 0; i < distance; i++) {
      position++;
      waitALittle();
    }
  }

  private String getUnderstoodWords(String text) {
    String result = "";
    String[] words = brain.divideIntoWords(text);
    for (int i = 0; i < words.length; i++) {
        if (brain.isKnown(words[i])) {
          result = result + words[i]; // if not, ignore it
        }
    }
    return result;
  }

  /**
  * constructor method setting position and invoking brain constructor
  */
  public KidPerson(int age) {
    position = 0;
    brain = new Brain(age);
  }

  public int getPosition() { // returns current position of KidPerson
   return this.position;
  }

  public void waitALittle() { // prints a short waiting message
    System.out.println("pausing for 5 seconds...");
  }



}
