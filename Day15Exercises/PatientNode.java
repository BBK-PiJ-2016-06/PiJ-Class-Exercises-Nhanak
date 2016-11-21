public class PatientNode {
  private int age;
  private String name;

  public PatientNode(int age, String name) {
    try {
      if (age > 130 || age < 0 || age == 0) {
      throw new IllegalArgumentException("You entered an invalid age for a person");
      } else {
        this.age = age;
        this.name = name;
      }
    } catch(IllegalArgumentException ex) {
        System.out.println("That number cannot be an age");
      }

  }
}
