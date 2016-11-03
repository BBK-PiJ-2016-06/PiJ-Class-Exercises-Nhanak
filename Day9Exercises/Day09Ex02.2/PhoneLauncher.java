public class PhoneLauncher {

  public static void main(String[] args) {
    PhoneLauncher launcher = new PhoneLauncher();
    launcher.launch();
  }

  public void launch() {

    SmartPhone nateIPhone = new SmartPhone("iPhone 7");

    Phone myPhone = new SmartPhone("Google Pixelphone");
    /*when you cast from a base class/interface in to a descendent class, you can only cast the
    methods which the base class/interface has. However, if you've overridden a method from the base class
    in your descendant class, it will perform the method with the descendant's updates.
    */
    nateIPhone.call("630-717-9588");
    nateIPhone.call("630-666-9588");
    nateIPhone.call("630-712-1018");
    nateIPhone.call("630-238-1218");
    nateIPhone.call("666-696996-4949");

    nateIPhone.printLastNumbers(); // testing out all the methods available
    nateIPhone.ringAlarm("wakeUp");
    nateIPhone.playGame("Angry Birds");
    System.out.println("This phone is a: " + nateIPhone.getBrand());
    nateIPhone.findPosition();

    testPhone(myPhone);
  }

  private void testPhone(Phone testing) {
     testing.call("2929-3992-2939"); // Phone only has call. Will not be able to call any other
                                    // methods that'd be available to SmartPhone. Will perform this
                                    // method like SmartPhone does it however. ("Sending to NSA"...)
   }

}
