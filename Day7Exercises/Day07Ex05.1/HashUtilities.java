public class HashUtilities {

  public static int shortHash(int n) {
    n = Math.abs(n);
    int result = n%10;
    return result;
  }

}
