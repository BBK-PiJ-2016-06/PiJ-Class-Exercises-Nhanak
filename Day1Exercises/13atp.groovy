print "2"
int dividend = 3
int divisor = 2
boolean finished = true

while (finished) {
  if (divisor == dividend) {
    print ", " + dividend
    }
  if (dividend%divisor==0) {
  dividend = dividend + 1
  divisor = 2
  } else if (divisor < dividend) {
    divisor = divisor + 1
  }
  if (dividend == 1001) {
    finished = false
    }
 }
println ""
