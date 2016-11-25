public class Launcher {

  public static void main(String[] args) {
    Launcher launcher = new Launcher();
    launcher.run();
  }

  public void run() {

    Student billy = new Student(8, "Billy");
    Student madison = new Student(6, "Madison");
    System.out.println("Billy, How old are you?");
    System.out.println(billy.askQuestion("How old are you?"));
    System.out.println("Madison, what is 2+2?");
    System.out.println(madison.askQuestion("2+2?"));
    //System.out.println(billy.askQuestion("How would you address the current geopolitical climate of populist candidates gaining momentem?"));
    try {
      //System.out.println(madison.askQuestion("How many verterbrae do most East African land Mammals contain?"));
      Student mary = new Student(askAge(), "Mary");
    } catch (IllegalArgumentException ex) {
      System.out.println("ConfusingQuestionException caught here in a try/catch");
    } catch (StudentIsTooOldException ex) {
      System.out.println("Caught an old person. Thrown from StudentIsTooOldException");
    } finally {
      System.out.println("School is over for the day");
    }
  }

  private int askAge() throws StudentIsTooOldException{
    System.out.println("How old are you?");
    int userInput = (Integer.parseInt(System.console().readLine()));
    if (userInput > 18) {
      throw new StudentIsTooOldException("You are too old to be a student");
    }
    return userInput;
  }



}
