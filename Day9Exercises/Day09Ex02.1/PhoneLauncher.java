public class PhoneLauncher {

  public static void main(String[] args) {
    PhoneLauncher launcher = new PhoneLauncher();
    launcher.launch();
  }

  public void launch() {

    MobilePhone nateIPhone = new SmartPhone("Google Pixelphone");
    SmartPhone holder = (SmartPhone) nateIPhone; // must downcast nateIphone and create a copy of it to access SmartPhone
                                                // methods

    nateIPhone.call("630-717-9588");
    nateIPhone.call("630-666-9588");
    nateIPhone.call("630-712-1018");
    nateIPhone.call("630-238-1218");
    nateIPhone.call("666-696996-4949");


    nateIPhone.printLastNumbers(); // testing out all the methods available
    holder.browseWeb("www.reddit.com");
    System.out.println(holder.findPosition());
    nateIPhone.ringAlarm("wakeUp");
    holder.playGame("Break Glass");
    System.out.println("This phone is a: " + nateIPhone.getBrand());

  }
}
