public class ConfusingQuestionException extends IllegalArgumentException { // IAE is an extension of a RuntimeException

  public ConfusingQuestionException(String str) {
  super(str);
  System.out.println("Student blinks a few times");
  }

}
