public class Calculator {

  int add(int x, int y) {
    int result = (x + y);
    return result;
  }
  int subtract(int x, int y) {
    int result = (x - y);
    return result;
  }
  int multiply(int x, int y) {
    int result = (x * y);
    return result;
  }
  double divide(int x, int y) {
    double doubX = x;
    double doubY = y;
    double result = (doubX/doubY);
    return result;
  }
  int modulus(int x, int y) {
  int result = x%y;
  return result;
  }
}
