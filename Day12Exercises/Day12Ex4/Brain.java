public class Brain {

  int BrainAge;

  public Brain(int age) {
    BrainAge = age;
  }

  public String[] divideIntoWords(String messageHeard) {
    String[] result = messageHeard.split(" ");
    return result;
  }

  public boolean isKnown(String word) {
    boolean result;
    if (word == "yes" || word == "no" || word == "Daddy" || word == "Mommy") {
      result = true;
    } else {
      result = false;
    }
    return result;
  }

}
