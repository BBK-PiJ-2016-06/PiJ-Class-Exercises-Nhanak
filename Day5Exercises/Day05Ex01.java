class Day05Ex01 {
  public static void main(String[] args) {
    Calculator calc  = new Calculator();
    int a = 33;
    int b = 2;

    System.out.println("Those 2 numbers added together equal: " + calc.add(a, b));
    System.out.println("Those 2 numbers subtracted equal: " + calc.subtract(a, b));
    System.out.println("Those 2 numbers multiplied equal: " + calc.multiply(a, b));
    System.out.println("Those 2 numbers divided equal: " + calc.divide(a,b));
    System.out.println("The first number modulo the second number equals: " + calc.modulus(a, b));
  }
}
