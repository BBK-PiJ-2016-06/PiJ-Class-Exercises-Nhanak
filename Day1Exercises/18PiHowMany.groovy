println "Please enter up to how many decimal places you'd like to calculate Pi"
int decimalPlaces = 2 + Integer.parseInt(System.console().readLine())
int counter = 0
BigDecimal result = 0
BigDecimal divisor = 1
String piToTenDecimals = 3.1415926535
String userDesiredStringLength = piToTenDecimals.substring(0,decimalPlaces)
boolean finished = false
String choppedResult = 0
String decimalspacer = 0.0000000001

while (!finished) {
  if (choppedResult == userDesiredStringLength) {
    finished = true
  } else {
    result = result + (4/divisor)
    String convertResult = result + decimalspacer
    choppedResult = convertResult.substring(0,decimalPlaces) - decimalspacer
    divisor = divisor + 2
    counter = counter + 1
  }
  if (choppedResult != userDesiredStringLength) {
    result = result - (4/divisor)
    convertResult = result + decimalspacer
    choppedResult = convertResult.substring(0,decimalPlaces) - decimalspacer
    divisor = divisor + 2
    counter = counter + 1
  }
}
println "You wanted Pi to be calculated to: " + userDesiredStringLength + ", and it took " + counter + " terms of the Gregory-Leibniz formula to do so accurately."
