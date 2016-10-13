print "Cost of item: £"
Double cost = Double.parseDouble(System.console().readLine())
print "Customer gave: £"
String cashAsString = System.console().readLine()
Double cashGiven = Double.parseDouble(cashAsString)
Double changeToGive = cashGiven - cost
int fiftyCount, twentyCount, tenCount, fiveCount, twoPoundCount, onePoundCount, fiftyPCount, twentyPCount, tenPCount, fivePCount, onePCount

for (fiftyCount = 0; changeToGive >= 50; fiftyCount++) {
  changeToGive = changeToGive - 50
}
for (twentyCount = 0; changeToGive >= 20; twentyCount++) {
  changeToGive = changeToGive - 20
}
for (tenCount = 0; changeToGive >= 10; tenCount++) {
  changeToGive = changeToGive - 10
}
for (fiveCount = 0; changeToGive >= 5; fiveCount++) {
  changeToGive = changeToGive - 5
}
for (twoPoundCount = 0; changeToGive >= 2; twoPoundCount++) {
  changeToGive = changeToGive - 2
}
for (onePoundCount = 0; changeToGive >= 1; onePoundCount++) {
  changeToGive = changeToGive - 1
}
for (fiftyPCount = 0; changeToGive >= 0.50; fiftyPCount++) {
  changeToGive = changeToGive - 0.50
}
for (twentyPCount = 0; changeToGive >= 0.2; twentyPCount++) {
  changeToGive = changeToGive - 0.2
}
for (tenPCount = 0; changeToGive >= 0.1; tenCount++) {
  changeToGive = changeToGive - 0.1
}
for (fivePCount = 0; changeToGive >= 0.05; fivePCount++) {
  changeToGive = changeToGive - 0.05
}
for (onePCount = 0; changeToGive >= 0.01; onePCount++) {
  changeToGive = changeToGive - 0.01
}
println "Give them change in the following denominations"
println "50's: " + fiftyCount
println "20's: " + twentyCount
println "10's: " + tenCount
println "5's: " + fiveCount
println "Two pound coins: " + twoPoundCount
println "One pound coins: " + onePoundCount
println "Fifty pence coins: " + fiftyPCount
println "Twenty pence coins: " + twentyPCount
println "Ten pence coins: " + tenPCount
println "Five pence coins: " + fivePCount
println "One pence coins: " + onePCount
