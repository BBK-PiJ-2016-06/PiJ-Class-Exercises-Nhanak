public class SmartPhone extends MobilePhone {

  @Override
  public void call(String phoneNumber) { // calls the phoneNumber from parameters.
    int firstTwo = Integer.parseInt(phoneNumber.substring(0,2));
    if (firstTwo == 00) {         // if first two digits of phoneNumber = 00, it will dial this.
      System.out.println("Calling " + phoneNumber + " through the internet to save money.");
    } else {
      super.call(phoneNumber);
    }
  }

  public SmartPhone(String brand) {  // constructor that updates your ability to call the constructor method in OldPhone
    super(brand);
  }

  public void browseWeb(String website) {  // opens a website based on input
    System.out.println("Opening Chrome, going to: " + website);
  }

  public String findPosition() {  // returns a (fixed) GPS location when asked
    String location = "You are at 3.4949 by 98.399002";
      return location;
  }

  public void playGame(String game) { 
    System.out.println("Opening game: " + game);
  }


  public void storeCallHistory(String currentNumber) {
    super.storeCallHistory(currentNumber);
    System.out.println("Sending data to NSA");
  }

}
