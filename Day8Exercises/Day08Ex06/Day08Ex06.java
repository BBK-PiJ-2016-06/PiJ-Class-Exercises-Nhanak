public class Day08Ex06 {

  public static void main(String[] args){

  Lecturer historyLecturer = new Lecturer("Dr. Frank");

  System.out.println("Our lecturer's name is " + historyLecturer.getName());
  historyLecturer.teach("Ancient British History");
  historyLecturer.doResearch("Roman anthropology");

  System.out.println(">>>>>");

  Teacher mathsProf = new Teacher("Prof. Mary");
  System.out.println("Our Teacher's name is " + mathsProf.getName());
  mathsProf.teach("Calculus");

  System.out.println(">>>>>");

  Teacher scienceTeacher = new Lecturer("Mr. Roboto");
  System.out.println("Our Science Teacher's name is " + scienceTeacher.getName());
  scienceTeacher.teach("Modern robotics");
  /* scienceTeacher.doResearch("AI Computing"); <- won't work bc scienceTeacher is primarily of class teacher,
          not a lecturer. However, if there is a shared method between class Teacher and lecturer, it will
          do it like lecturer does */

  /* Lecturer musicTeacher = new Teacher("Mr. Hanak"); <- won't work, Teacher cannot be downcast in to Lecturer
  System.out.println("Our Music Teacher's name is " + scienceTeacher.getName());
  musicTeacher.teach("Music theory");
  musicTeacher.doResearch("Jazz scales and harmony"); */
  }

}
