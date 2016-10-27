public class PhoneLauncher {

  public static void main(String[] args) {
    PhoneLauncher launcher = new PhoneLauncher();
    launcher.launch();
  }

  public void launch() {

    MobilePhone bananaPhone = new MobilePhone("Nokia");
    /* if calling a new object that has a constructor, you must give it the parameters of the
      *constructor as soon as you do it.
      */
    bananaPhone.call("744-394-3489");
    bananaPhone.printLastNumbers(); //
    System.out.println("This Mobile phone is a: " + bananaPhone.getBrand());

    SmartPhone nateIPhone = new SmartPhone("Google Pixelphone");
    nateIPhone.call("630-717-9588"); // building up contact list in Smartphone
    nateIPhone.call("630-666-9588");
    nateIPhone.call("630-712-1018");
    nateIPhone.call("3453418");
    nateIPhone.call("6302348");
    nateIPhone.call("630-712-4534018");
    nateIPhone.call("00-288-293942-2883");
    nateIPhone.call("6239-23884-283");
    nateIPhone.call("44-3939-4932-332");
    nateIPhone.call("1010101010-3222");
    nateIPhone.call("11-1111-2392");
    nateIPhone.call("12-1212-2392");

    nateIPhone.printLastNumbers(); // testing out all the methods available
    nateIPhone.browseWeb("www.reddit.com");
    System.out.println(nateIPhone.findPosition());
    nateIPhone.ringAlarm("wakeUp");
    nateIPhone.playGame("Break Glass");
    System.out.println("This phone is a: " + nateIPhone.getBrand());
  }
}
