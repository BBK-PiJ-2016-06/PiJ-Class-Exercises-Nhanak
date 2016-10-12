println "Please enter a list of numbers, when finished, enter this: -1"
int input = Integer.parseInt(System.console().readLine())
int largestnumber = input
boolean consecutive = true

while (input > -1) {
  if (input > largestnumber) {
    if (input > largestnumber + 1) {
      consecutive = false
      }
    largestnumber = input
  } else if (input < largestnumber) {
    consecutive = false
    }
  input = Integer.parseInt(System.console().readLine())
}

if (consecutive) {
  println "Yes, they are consecutive"
  } else if (!consecutive) {
    println "No, they aren't consecutive"
  }
