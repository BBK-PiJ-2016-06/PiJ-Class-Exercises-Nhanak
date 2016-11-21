import java.util.List;
import java.util.ArrayList;

public class Day15Ex4 {

  public static void main(String[] args) {

    Day15Ex4 exercise = new Day15Ex4();
    exercise.launch();
  }

  public void launch() {

    String name = "John Doe";
    int age = 131;

    List<PatientNode> hospital = new ArrayList<PatientNode>();

    while (age != 0 ) {
      System.out.println("For this anon patient, what is their age? Enter 0 to quit");
      age = Integer.parseInt(System.console().readLine());
      PatientNode newPatient = new PatientNode(age, name);
      hospital.add(newPatient);
    }

  }



  
}
