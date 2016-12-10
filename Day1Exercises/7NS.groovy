print "Enter a number: "
int first = Integer.parseInt(System.console().readLine())
print "Enter a second number: "
int second = Integer.parseInt(System.console().readLine())
print "now enter your final number: "
int third = Integer.parseInt(System.console().readLine())
println " you entered: " + first + ", " + second + ", " + third
int highest = 0
int middle = 0
int lowest = 0

if (first > second && first > third ) {
    highest = first
    }
  else if (first < second && first < third) {
      lowest = first
      } else {
        middle = first
        }
if (second > first && second > third) {
    highest = second
    } else if (second < first && second < third) {
      lowest = second
    } else  {
        middle = second
      }
if (third > first && third > second) {
  highest = third
  } else if (third < first && third < second) {
    lowest = third
  } else { middle = third
    }
println "and the order from lowest to highest is: " + lowest + ", " + middle + ", " + highest
