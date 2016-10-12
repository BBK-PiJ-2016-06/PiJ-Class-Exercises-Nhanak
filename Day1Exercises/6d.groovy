println "give me the first number "
int firstnbr = Integer.parseInt(System.console().readLine())
println "give me the second number"
int secnbr = Integer.parseInt(System.console().readLine())
int counter = 0
int remainder = firstnbr

while ( remainder >= secnbr ) {
  remainder = remainder - secnbr
  counter = counter + 1
}
println firstnbr + " divided by " + secnbr + " is " + counter + " with a remainder of " + remainder
