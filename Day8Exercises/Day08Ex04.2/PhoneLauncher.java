public class PhoneLauncher {

  public static void main(String[] args) {
    PhoneLauncher launcher = new PhoneLauncher();
    launcher.launch();
  }

  public void launch() {

    RestrictedSmartPhone kidPhone = new RestrictedSmartPhone("iPhone 7");
    kidPhone.call("630-717-9588"); // building up contact list in Smartphone
    kidPhone.call("630-666-9588");
    kidPhone.call("630-712-1018");

    kidPhone.printLastNumbers(); // testing out all the methods available
    kidPhone.browseWeb("www.reddit.com");
    System.out.println(kidPhone.findPosition());
    kidPhone.ringAlarm("wakeUp");
    kidPhone.playGame("Break Glass");
    System.out.println("This phone is a: " + kidPhone.getBrand());
    QuestionAnswer answer = new QuestionAnswer();
    answer.printAnswer();

  }
}
