// converts a decimal to a hexidecimal
String decToHexConverter(String decimal) {
  int remainder
  int decimalAsInt = Integer.parseInt(decimal)
  String adder
  String resultBuilder = ""
  for (int quotient = decimalAsInt; decimalAsInt >=1; decimalAsInt = quotient) {
    quotient = decimalAsInt/16
    remainder = decimalAsInt%16
    println "remainder is " + remainder
    adder = remainder //  adder gets value of remainder as a string
    if (remainder > 9) {
      println "did it go here?"
      switch (remainder) {
        case 10: adder = "a";
        break;
        case 11: adder = "b";
        break;
        case 12: adder = "c";
        break;
        case 13: adder = "d";
        break;
        case 14: adder = "e";
        break;
        case 15: adder = "f";
        break;
      }
    }
    resultBuilder = adder + resultBuilder
  }
  decToHexResult = resultBuilder
  return decToHexResult
}
//

// takes input, figures out what type of string it is, calls method, then prints result
println "Please enter a binary or hexadecimal (must start with 0x) number"
String input = System.console().readLine()
if (input.substring(0,2) == "0x") {
  input = input.substring(2);
  hexToDecConverter(input);
  println "That hexidecimal is " + hexToDecResult + " as a decimal"
} else {
  decToHexConverter(input);
  println "That decimal is " + decToHexResult + " as a hexidecimal"
  }
