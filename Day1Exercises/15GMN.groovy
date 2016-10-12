int numberToGuess = Math.abs(1000 * Math.random())
print "guess my number!"
boolean finished = true
int counter = 0

while (finished) {
  int guess = Integer.parseInt(System.console().readLine())
  if (guess > numberToGuess) {
    println "nope, you need to guess lower"
    counter = counter + 1
  }
  if (guess < numberToGuess) {
    println "nah, you need to guess higher"
    counter = counter + 1
  }
  if (guess == numberToGuess) {
    println "Yes! That was it."
    finished = false
  }
}
println "It only took you " + counter + " tries.... (not bad)"
