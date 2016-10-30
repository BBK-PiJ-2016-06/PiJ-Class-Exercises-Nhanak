public class ExamScores {

  private static int studentCount = 0;
  private static int distinctions = 0;
  private static int passes = 0;
  private static int fails = 0;
  private static int invalids = 0;

  public void enterScores() { // user inputs scores
    System.out.println("Welcome to exam scorer. Enter '-1' when finished.");
    int userInput;
    do { System.out.print("Input a mark: ");
      userInput = Integer.parseInt(System.console().readLine()); // do while loop continuously reads input from user
      if (userInput > 100 || userInput < -1 ) {
        invalids++;
        studentCount--;         // only wanted to write studentcount++ once, so subtracting one now for the incoming ++
      } else if (userInput >= 70 && userInput <= 100) {
        distinctions++;
      } else if (userInput >= 50 && userInput <= 69 ) {
        passes++;
      } else if (userInput <= 49 && userInput >= 0) {
        fails++;
      } else if (userInput == -1) {
        studentCount--;
      }
      studentCount++;
    } while (userInput != -1);
    printResults();
  }

  public void printResults() { // prints the results of this object of Exam class
    System.out.println(studentCount + " students took the test.");
    System.out.println(distinctions + " received distinction");
    System.out.println(passes + " received a pass.");
    System.out.println(fails + " failed the exam.");
    System.out.println(invalids + " scores you entered were invalid.");
  }
}
