public class StudentIsTooOldException extends Exception { // does not extend RuntimeException is a Checked Exception

  public StudentIsTooOldException(String s) {
    super(s);
    System.out.println("You need to leave. (This is a checked exception)");
  }


}
