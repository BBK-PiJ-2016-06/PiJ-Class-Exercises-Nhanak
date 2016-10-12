print "2"
int dividend = 2
int divisor = 2
int counter = 0
boolean finished = true

while (finished) {
  if (divisor == dividend) {
    print ", " + dividend
    counter = counter +1
    }
  if (dividend%divisor==0) {
  dividend = dividend + 1
  divisor = 2
  } else if (divisor < dividend) {
    divisor = divisor + 1
  }
  if (counter == 1000) {
    finished = false
    }
 }
println "these are the first " + counter + " primes"
