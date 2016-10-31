public class Day09Ex01 {

  public static void main(String[] args) {
    Day09Ex01 exercise = new Day09Ex01();
    exercise.launch();
  }

    private void launch() {

      Comparator myComparator = new Comparator();

      System.out.println("The bigger number between 6 and 22 is: " + myComparator.getMax(6, 22));
      System.out.println("The bigger number between 4.5 and 7.9 is: " + myComparator.getMax(4.5, 7.9));
      System.out.println("The bigger number between 62 and 222 is: " + myComparator.getMax("66", "222"));
  }

}
