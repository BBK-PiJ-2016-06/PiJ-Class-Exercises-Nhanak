// converts a decimal to a hexidecimal
String decToHexConverter(String decimal) {
  int remainder
  int decimalAsInt = Integer.parseInt(decimal)
  String adder
  String resultBuilder = ""
  for (int quotient = decimalAsInt; decimalAsInt >=1; decimalAsInt = quotient) {
    quotient = decimalAsInt/16
    remainder = decimalAsInt%16
    adder = remainder //  adder gets value of remainder as a string
    if (remainder > 9) {
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
int power(int b, int e) {
  int counter = 0
  result = b
  if (e == 0) {
    result = 1
  }
  for (counter = 1; counter<e; counter++) {
    result = result * b
  }
  return result;
} // once you leave here b and e are wiped out. result is remembered though

// below returns the value of 16 to the power of 'exponent'
int power2(int exponent) {
  this.result = power(16,exponent)     // this.result = whatever happened in the method you called, the return value
  return this.result
}
// turns hexidecimal in to a decimal
String hexToDecConverter(String hexiString) {  ///
  int hexiStringLength = hexiString.length()
  int exponentToSend = hexiStringLength - 1
  char extractor
  int extractorAsInt
  int deciTotal = 0
  String extractorAsStr
  int decimalBuilder
  for (int stringCrawler = 0; stringCrawler<hexiStringLength; stringCrawler++) {
    extractor = hexiString.charAt(stringCrawler)
    if (Character.isLetter(extractor)) {  // this will turn the extracted character in to an int
      switch (extractor) {
        case "a": extractorAsInt = 10;
          break;
        case "b": extractorAsInt = 11;
          break;
        case "c": extractorAsInt = 12;
          break;
        case "d": extractorAsInt = 13;
          break;
        case "e": extractorAsInt = 14;
          break;
        case "f": extractorAsInt = 15;
          break;
      }
    } else {
        extractorAsStr = extractor
        extractorAsInt = Integer.parseInt(extractorAsStr)
      }
    decimalBuilder = extractorAsInt * power2(exponentToSend)
    exponentToSend = exponentToSend - 1
    deciTotal = deciTotal + decimalBuilder
  }
  String decimalTotalAsStr = deciTotal
  hexToDecResult = decimalTotalAsStr
  return hexToDecResult
}
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
