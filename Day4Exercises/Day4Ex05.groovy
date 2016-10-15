int power(int b, int e) {
  int counter = 0
  result = b
  for (counter = 1; counter<e; counter++) {
    result = result * b
  }
  return result;
} // once you leave here b and e are wiped out. result is remembered though

int power2(int exponent) {
  this.result = power(2,exponent)     // this.result = whatever happened in the method you called, the return value
  return this.result
}
/// reads the binary number entered, sends each digit one by one to get converted in to a decimal
String binary2decimal(String biString) {
  int biNumLength = biString.length()
  int total = 0
  int exponentSend = biNumLength - 1
  int biConvert = 0
  int resultInt = 0
  for (int stringCrawler = 0; stringCrawler < biNumLength; stringCrawler++) {
    String singleDigit = biString.charAt(stringCrawler)
    biConvert = Integer.parseInt(singleDigit)
    resultInt = resultInt + (biConvert * power2(exponentSend))  // this part adds each digit up in to a decimal
    exponentSend = exponentSend - 1
  }
  binaryResult = resultInt
  return binaryResult
}
/// turns decimal number in to a binary number
int decimal2binary(int decimal) {
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
  println decimalResultA
  decimalResult = Integer.parseInt(decimalResultA)
  return decimalResult
}
// user choice selection
boolean running = true
while (running) {
  String binaryInput
  println "Please enter a selection"
  println "Press 0 to quit"
  println "Press 1 convert a binary number to a decimal"
  println "Press 2 to see a binary value of a decimal"
  print ">>>"
  int choice = Integer.parseInt(System.console().readLine())
  switch (choice) {
    case 0: running = false;
      break;
    case 1: println "Please enter your binary number";
      print ">>>";
      binaryInput = System.console().readLine();
      binary2decimal(binaryInput);
      println "That binary number equals: " + binaryResult;
      break;
    case 2: println "Please enter your base 10 number";
      print ">>>";
      int base10input = Integer.parseInt(System.console().readLine());
      decimal2binary(base10input);
      println "That decimal equals this in binary: " + decimalResult;
      break;
    default: println "You have made an invalid choice, try again"
      print ">>>";
      break;
  }
}
