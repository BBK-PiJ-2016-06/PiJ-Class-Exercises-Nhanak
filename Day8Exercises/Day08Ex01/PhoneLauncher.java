public class PhoneLauncher {

  public static void main(String[] args) {
    PhoneLauncher launcher = new PhoneLauncher();
    launcher.launch();
  }

  public void launch() {

    MobilePhone bananaPhone = new MobilePhone();
    bananaPhone.call("744-394-3489");
    bananaPhone.printLastNumbers(); // history isn't working beyond 1 number, try adding other numbers later

    SmartPhone nateIPhone = new SmartPhone();
    nateIPhone.call("630-717-9588");
    nateIPhone.browseWeb("www.reddit.com");
    nateIPhone.findPosition();
    nateIPhone.ringAlarm("wakeUp");
    nateIPhone.printLastNumbers();
    nateIPhone.playGame("Break Glass");
    nateIPhone.findPosition();
  }
}
