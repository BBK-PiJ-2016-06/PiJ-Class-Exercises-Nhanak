public class SmartPhone extends MobilePhone {

  public void browseWeb(String website) {  // opens a website based on input
    System.out.println("Opening Chrome, going to: " + website);
  }

  public String findPosition() {  // returns a (fixed) GPS location when asked
    String location = "You are at 3.4949 by 98.399002";
      return location;
  }

  public void storeCallHistory(String currentNumber) {
    super.storeCallHistory(currentNumber); // if you call super, it must be the first line in the method.
    System.out.println("Sending data to NSA");
  }

}
