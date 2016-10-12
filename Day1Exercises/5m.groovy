println " Gimme the first number "
int firstnbr = Integer.parseInt(System.console().readLine())
println " Gimme the second number"
int secnbr = Integer.parseInt(System.console().readLine())

int counter = 1
int total = firstnbr
while ( counter < secnbr ) {
  total = total + firstnbr
  counter = counter + 1
}
println total
