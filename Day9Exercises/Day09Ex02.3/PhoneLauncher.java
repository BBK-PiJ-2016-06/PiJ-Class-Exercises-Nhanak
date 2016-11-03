public class PhoneLauncher {

  public static void main(String[] args) {
    PhoneLauncher launcher = new PhoneLauncher();
    launcher.launch();
  }

  public void launch() {

    SmartPhone nateIPhone = new SmartPhone("iPhone 7");

    Phone myPhone = new SmartPhone("Google Pixelphone");

    nateIPhone.call("630-717-9588");
    nateIPhone.call("630-666-9588");
    nateIPhone.call("630-712-1018");
    nateIPhone.call("630-238-1218");
    nateIPhone.call("666-696996-4949");

    nateIPhone.printLastNumbers(); // testing out all the methods available
    nateIPhone.ringAlarm("wakeUp");
    nateIPhone.playGame("Angry Birds");
    System.out.println("This phone is a: " + nateIPhone.getBrand());
    System.out.println(nateIPhone.findPosition());

    testPhone(myPhone);
  }

  private void testPhone(Phone testing) {
     testing.call("2929-3992-2939");
     testing.call("6629-3349-6621");
     testing.call("0032-2384-299239");
     SmartPhone tempPhone = (SmartPhone) testing;
     System.out.println(tempPhone.findPosition());
     tempPhone.browseWeb("www.Facebook.com");
     tempPhone.playGame("Flappy Bird");
     System.out.println("This phone is a " + tempPhone.getBrand());
   }

}
