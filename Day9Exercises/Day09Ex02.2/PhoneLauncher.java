public class PhoneLauncher {

  public static void main(String[] args) {
    PhoneLauncher launcher = new PhoneLauncher();
    launcher.launch();
  }

  public void launch() {

    SmartPhone nateIphone = new SmartPhone("iPhone 7");

    MobilePhone myPhone = new SmartPhone("Google Pixelphone");

   public void testPhone(Phone testing) {
      testing.call("2929-3992-2939");
    }

    testPhone(myPhone);

    nateIPhone.call("630-717-9588");
    nateIPhone.call("630-666-9588");
    nateIPhone.call("630-712-1018");
    nateIPhone.call("630-238-1218");
    nateIPhone.call("666-696996-4949");


    nateIPhone.printLastNumbers(); // testing out all the methods available
    nateIPhone.ringAlarm("wakeUp");
    nateIPhone.playGame("Angry Birds");
    System.out.println(nateIPhone.findPosition());
    System.out.println("This phone is a: " + nateIPhone.getBrand());

  }
}
