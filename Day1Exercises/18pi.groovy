println "Please enter a value of n, which will be the number of series used to caculate Pi"
BigDecimal n = Integer.parseInt(System.console().readLine())
BigDecimal counter = 0
BigDecimal result = 0
BigDecimal divisor = 1
int dividend = 4
boolean finished = false

while (!finished) {
  if (counter == n) {
    finished = true
  } else {
    result = result + (4/divisor)
    divisor = divisor + 2
    counter = counter + 1
  }
  if (counter != n) {
    result = result - (4/divisor)
    divisor = divisor + 2
    counter = counter + 1
  }
}
println result
