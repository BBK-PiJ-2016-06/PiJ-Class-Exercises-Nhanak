public class Day07Ex05_1 {

  public static void main(String[] args){

  HashUtilities hashMaker = new HashUtilities();

  System.out.println("Give me a string and I will give you its hash code");
  String str = System.console().readLine();
  int hash = str.hashCode();
  System.out.println("Its hash code is: " + hash);
  int smallHash = hashMaker.shortHash(hash);
  System.out.println("Its small hash is now: " + smallHash);

  System.out.println("Give me an int and I will give you its hash code");
  Integer input = Integer.parseInt(System.console().readLine());
  hash = input.hashCode();
  System.out.println("Its hash code is: " + hash);
  smallHash = hashMaker.shortHash(hash);
  System.out.println("Its small hash is now: " + smallHash);

  System.out.println("Give me a double and I will give you its hash code");
  Double input2 = Double.parseDouble(System.console().readLine());
  hash = input2.hashCode();
  System.out.println("Its hash code is: " + hash);
  smallHash = hashMaker.shortHash(hash);
  System.out.println("Its small hash is now: " + smallHash);
  }
  
}
