public class Leg {

  private int rangeOfMotion;

  public Leg() {
    rangeOfMotion = 100;
  }

  public boolean isHealthy() {
    if (getRangeOfMotion() > 80) {
      return true;
      } else {
      return false;
    }
  }

  public int getRangeOfMotion() {
    return this.rangeOfMotion;
  }

  public void setRangeOfMotion(int rangeLevel) {
      rangeOfMotion = rangeLevel;
  }



}
