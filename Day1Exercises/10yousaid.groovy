println "Please enter a list of numbers, when finished, enter this: -1"
int input = Integer.parseInt(System.console().readLine())
int storednumber = input
boolean consecutive = true

while (input > -1) {
  if (input > storednumber) {
    if (input > storednumber + 1) {
      consecutive = false
      }
    storednumber = input
  }
  if (input < storednumber ) {
    if (input < storednumber -1 ) {
      consecutive = false
      }
      storednumber = input
  }
  input = Integer.parseInt(System.console().readLine())
  if (storednumber == input) {
    consecutive = false
  }
}

if (consecutive) {
  println "Yes, they are consecutive"
  } else if (!consecutive) {
    println "No, they aren't consecutive"
  }
