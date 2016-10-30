public class Spy {

  private static int spyCount = 0;
  private int spyID;

  public Spy(int inputSpyID) { // constructor method
    this.spyID = inputSpyID;
    System.out.println("The spy's ID is: " + this.spyID);
    spyCount++;
    System.out.println("Currently counting: " + spyCount + " spies.");
  }

  public static int getNumberOfSpies() {
    return spyCount;
  }

  public void die() {
    spyCount--;
    System.out.println("Spy " + spyID + " has been detected and eliminated");
    System.out.println("There are this many spies remaining: " + spyCount);
  }

}
