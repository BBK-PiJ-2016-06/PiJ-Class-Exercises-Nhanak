int power(int b, int e) {
  int result = 0;
  result = Math.pow(b,e)
  return result;
} // once you leave here b and e are wiped out. result is remembered though

int power2(int exponent) {
  this.result = power(2,exponent)     // this.result = whatever happened in the method you called, the return value
  return this.result
}
/// reads the binary number entered, sends each digit one by one to get converted in to a decimal
int binary2decimal(String biString) {  // simplified this working with Mo
  int exponentSend = biString.length() - 1
  int resultInt = 0
  for (int stringCrawler = 0; stringCrawler < biString.length(); stringCrawler++) {
    println "one by one the chars are: " + biString.charAt(stringCrawler)
    if (biString.charAt(stringCrawler) == "1") {
    resultInt = resultInt + power2(exponentSend)  // this part adds each digit up in to a decimal
    exponentSend--
    println "my result so far is " + resultInt
    } else {
        exponentSend--
      }
  }
  return resultInt
}
/// turns decimal number in to a binary number
String decimal2binary(int decimal) {
  String remainder
  String decimalResultA = ""
  int quotient = 0
  for (double decimalDouble = decimal; decimalDouble >= 1; decimalResultA = remainder + decimalResultA) {
     quotient = decimalDouble/2
     if (quotient < decimalDouble/2) {
       remainder = 1
       decimalDouble = (decimalDouble/2)-0.5
     }  else {
          remainder = 0
          decimalDouble = decimalDouble/2
        }
    }
  println "That number equals " + decimalResultA + " in binary"
  return decimalResultA
}
// user choice selection
boolean running = true
while (running) {
  String binaryInput
  println "Please enter a selection"
  println "Press 0 to quit"
  println "Press 1 to convert a binary number to a decimal"
  println "Press 2 to see a binary value of a decimal"
  print ">>>"
  int choice = Integer.parseInt(System.console().readLine())
  switch (choice) {
    case 0: running = false;
      break;
    case 1: println "Please enter your binary number";
      print ">>>";
      binaryInput = System.console().readLine();
      println "That binary number equals: " + binary2decimal(binaryInput);
      break;
    case 2: println "Please enter your base 10 number";
      print ">>>";
      int base10input = Integer.parseInt(System.console().readLine());
      decimal2binary(base10input);
      break;
    default: println "You have made an invalid choice, try again"
      print ">>>";
      break;
  }
}
