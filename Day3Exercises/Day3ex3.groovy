println "Enter a basic equation of two numbers using +, -, /, or *"
String input = System.console().readLine()
boolean findFirstNum = false
boolean findLeftNum = false
int stringposition  = 1
int checkerPosition = 1 // this will move up and down
double leftnumber = 0
double rightnumber = 0
double result = 0


while (!findFirstNum) {
  int stringPosValue = input.charAt(checkerPosition) // stringPosValue is the ASCII value of the number you're on
  if (stringPosValue <= 48) {
    leftnumber = Integer.parseInt(input.substring(0,checkerPosition))
    findFirstNum = true
  } else {
    checkerPosition = checkerPosition + 1
  }
}
rightnumber = Integer.parseInt(input.substring((checkerPosition+1)))
println leftnumber
println rightnumber
char mathsSign = input.charAt(checkerPosition) //
String convertChar = mathsSign
int valueofConvertChar = convertChar

if (valueofConvertChar == 42) {
  result = leftnumber * rightnumber
} else if (valueofConvertChar == 43) {
  result = leftnumber + rightnumber
} else if (valueofConvertChar == 45) {
  result = leftnumber - rightnumber
} else if (valueofConvertChar == 47) {
  result = leftnumber / rightnumber
}
println "your answer is: " + result
