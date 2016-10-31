public class PhoneLauncher {

  public static void main(String[] args) {
    PhoneLauncher launcher = new PhoneLauncher();
    launcher.launch();
  }

  public void launch() {

    SmartPhone nateIPhone = new SmartPhone("Google Pixelphone");
    nateIPhone.call("630-717-9588"); 
    nateIPhone.call("630-666-9588");
    nateIPhone.call("630-712-1018");


    nateIPhone.printLastNumbers(); // testing out all the methods available
    nateIPhone.browseWeb("www.reddit.com");
    System.out.println(nateIPhone.findPosition());
    nateIPhone.ringAlarm("wakeUp");
    nateIPhone.playGame("Break Glass");
    System.out.println("This phone is a: " + nateIPhone.getBrand());
  }
}
