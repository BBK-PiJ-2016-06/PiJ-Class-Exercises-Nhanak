public class ArrayMap implements SimpleMap {

  private String[] stringArray = new String[15];

  public ArrayMap() { // constructor method, initializes all values to null
    for (int i = 0; i <= 14; i++) {
      stringArray[i] = null;
    }
  }

  public void put(int keyValue, String name) { // adds a name to the array by key
    if (stringArray[keyValue] == null ) {  // if stringArray[keyValue] != null, it means it's full
      stringArray[keyValue] = name;
      System.out.println("Added " + name + " to key slot# " + keyValue + ".");
    } else {
      System.out.println("That key value is already in use. " + name + " not added.");
    }
  }

  public String get(int keyValue) {  // returns requested value of the string associated with key number
      return stringArray[keyValue];
  }

  public void remove(int keyValue) { // sets value of requested key number to null
    System.out.println("Removing " + stringArray[keyValue]);
    stringArray[keyValue] = null;
  }

  public boolean isEmpty() {
    boolean result = true;
    for (int j = 0; j <=14; j++) {
      if (stringArray[j] != null) {
        result = false;
      }
    }
    return result;
  }

}
