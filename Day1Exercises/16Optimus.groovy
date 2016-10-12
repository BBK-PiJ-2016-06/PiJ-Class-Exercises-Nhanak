println "Please enter a number"
int input = Integer.parseInt(System.console().readLine())
int upperPrimeToPrint = 0
int lowerPrimeToPrint = 0
int upperprime = input + 1
int lowerprime = input - 1
int primeCheckUpper = 2
int primeCheckLower = 2
boolean upper_is_prime = false
boolean lower_is_prime = false

while (!upper_is_prime) {
  if (upperprime == primeCheckUpper) {
    upper_is_prime = true
    upperPrimeToPrint = upperprime
    } else if (upperprime%primeCheckUpper==0) {
    upperprime = upperprime + 1
    primeCheckUpper = 2
    } else {
    primeCheckUpper = primeCheckUpper + 1
    }
}
while (!lower_is_prime) {
  if (lowerprime == primeCheckLower) {
    lower_is_prime = true
    lowerPrimeToPrint = lowerprime
    } else if (lowerprime%primeCheckLower==0) {
      lowerprime = lowerprime - 1
      primeCheckLower = 2
    } else {
      primeCheckLower = primeCheckLower + 1
    }
}
int upperDistanceCount = (upperPrimeToPrint - input)
int lowerDistanceCount = (input - lowerPrimeToPrint)
if (upperDistanceCount==lowerDistanceCount) {
  println "The nearest prime numbers were equidistant, they are: " + upperPrimeToPrint + " and " + lowerPrimeToPrint
} else if ( upperDistanceCount < lowerDistanceCount ) {
  println "The nearest prime number is: " + upperPrimeToPrint
  } else {
      println "The nearest prime number is: " + lowerPrimeToPrint
      }
