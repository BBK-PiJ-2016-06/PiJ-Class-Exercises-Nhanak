public class AdultPerson implements Person {

  private int situation;
  private int energy;
  private Leg leftLeg = new Leg();
  private Leg rightLeg = new Leg();

  /**
  * Move a distance in a straight line, given in meters
  */
  public void move(int distance) {
    if (rightLeg.isHealthy() && leftLeg.isHealthy()) {
      run(distance);
    } else {
      walk(distance);
    }
  }

  /**
  * Say something
  */
  public void say(String message) {
    System.out.println(message);
  }

  private void run(int distance) {
    situation = situation + distance;
    energy--;
  }

  private void walk(int distance) {
    for (int i = 0; i < distance; i++) {
      situation++;
    }
  }

  public AdultPerson() {
    this.energy = 75;
    this.situation = 0;
  }

  public int getEnergy() {
    return this.energy;
  }

  public int getSituation () {
    return this.situation;
  }
}
