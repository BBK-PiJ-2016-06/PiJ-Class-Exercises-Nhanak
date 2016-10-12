println "Enter some text"
String str = System.console().readLine()
int textlength = str.length()
for (int count = 0; count<textlength; count++) {
  println str.charAt(count)
}
