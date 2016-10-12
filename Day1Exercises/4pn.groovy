println "Enter a number"
int value = Integer.parseInt(System.console().readLine())
int tester = 2
boolean primetester = true

while (tester < value ) {
 if ( value % tester == 0 ) {
   primetester = false;
    }
tester = tester + 1
    }
if (primetester) {
  println "Your value of " + value + " is prime" }
  else {
    println "Your value of " + value + " is not prime"
  }
