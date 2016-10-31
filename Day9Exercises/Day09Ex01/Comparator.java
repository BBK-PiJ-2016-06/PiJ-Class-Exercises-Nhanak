public class Comparator {

  public int getMax(int n, int m) {
    return  (int)getMax( (double)n, (double)m );
  }

  public double getMax(double d1, double d2) {

    return (d1>d2)?d1:d2; //this code returns what is below. Is (d1>d2) true? If so, return d1, if not, return d2
    /*
    if (d1 > d2) {
      return d1;
      } else {
        return d2;
      }*/
  }

  public String getMax(String number1, String number2) {
    return String.valueOf( getMax( Double.parseDouble(number1), Double.parseDouble(number2) ) );
  }
}
