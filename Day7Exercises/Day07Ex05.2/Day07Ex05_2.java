public class Day07Ex05_2 {

  public static void main(String[] args) {

    Day07Ex05_2 launcher = new Day07Ex05_2();
    launcher.launch();
  }

  public void launch() {

    ArrayMap myMap = new ArrayMap();

    checkIfEmpty(myMap);
    myMap.put(2, "Bob Costas");
    checkIfEmpty(myMap);
    myMap.put(2, "Jimmy John");
    myMap.remove(2);
    checkIfEmpty(myMap);
    myMap.put(1, "Michael Jordan");
    myMap.put(14, "San Antonio");
    myMap.put(6, "Nate the Great");
    myMap.put(14, "Dick Van Dyke");
    checkIfEmpty(myMap);
    System.out.println(myMap.get(6));
    System.out.println(myMap.get(5));

  }

  public void checkIfEmpty(ArrayMap map) { // method to print some text to tell me result of "if empty"
    if (map.isEmpty()) {
      System.out.println("This map is empty.");
    } else {
        System.out.println("There are people in this map.");
    }
  }

}
