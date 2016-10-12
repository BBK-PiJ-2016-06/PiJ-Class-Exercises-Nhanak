println "Please enter a list of numbers, when finished, enter this: -1"
int largestnumber = 0
int input = Integer.parseInt(System.console().readLine())
largestnumber = input

while (input != -1) {
  if (input > largestnumber) {
    largestnumber = input
  }
  input = Integer.parseInt(System.console().readLine())
}
println "the largest number was: " + largestnumber
