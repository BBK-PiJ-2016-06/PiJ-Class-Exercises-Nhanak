public class Student {

  private int age;
  private String name;
  private String response;

  public Student(int age, String name) {
    this.age = age;
    this.name = name;
    this.response = "... (stares blankly)";
  }

  public int getAge() {
    return age;
  }

  public String getName() {
    return name;
  }

  public void setResponse(String newResponse) {
    this.response = newResponse;
  }

  public String getResponse() {
    return response;
  }

  public String askQuestion(String question) throws ConfusingQuestionException{ // if it does not throw here
    if (question.length() > 25) {                               // exception is thrown below and program ends 
      throw new ConfusingQuestionException("Your question is too long" + "(" + question.length() + " chars)" );
    } else if (question.equals("How old are you?")) {
      String questionAnswer = ("I am " + getAge() + " years old.");
      return questionAnswer;
    } else {
      return getResponse();
    }
  }


}
