println "Enter some text"
String str = System.console().readLine()
int textlength = str.length()
for (int count = 0; count<textlength; count++) {
  String charToString = str.charAt(count)
  int stringToInt = charToString
  print str.charAt(count)
  if (stringToInt == 32) {
    println ""
  }
}
println ""
