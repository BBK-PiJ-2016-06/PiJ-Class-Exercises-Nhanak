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
    nateIPhone.call("630-666-9588");
    nateIPhone.call("630-712-1018");
    nateIPhone.call("3453418");
    nateIPhone.call("6302348");
    nateIPhone.call("630-712-4534018");
    nateIPhone.call("00-288-293942-2883");
    nateIPhone.call("6239-23884-283");
    nateIPhone.call("44-3939-4932-332");
    nateIPhone.call("3382-392-3222");
    nateIPhone.call("2833-3929-2392");
    nateIPhone.printLastNumbers();

    nateIPhone.browseWeb("www.reddit.com");
    System.out.println(nateIPhone.findPosition());
    nateIPhone.ringAlarm("wakeUp");

    nateIPhone.playGame("Break Glass");
  }
}
