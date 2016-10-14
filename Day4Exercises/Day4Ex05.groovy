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

String binary2decimal(String binaryResult) {

  return binaryResult
}


// user choice selection
boolean running = true
while (running) {
  String binaryInput
  println "Please enter a selection"
  println "Press 0 to quit"
  println "Press 1 to see the decimal version of a binary number"
  println "Press 2 to see a binary value of a decimal"
  print ">>>"
  int choice = Integer.parseInt(System.console().readLine())
  switch (choice) {
    case 0: running = false;
      break;
    case 1: println "Please enter your binary number";
      binaryInput = System.console().readLine()
      binary2decimal(binaryInput);
      println "That binary number equals: " + binaryResult
      break;
    case 2: decimal2binary();
      break;
    default: println "You have made an invalid choice, try again"
      break;
  }
}
