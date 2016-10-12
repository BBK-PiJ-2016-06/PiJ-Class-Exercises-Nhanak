println "please enter some text"
String input = System.console().readLine()
int inputLength = input.length()
boolean finished = false
String addChars = ""
int charListLength = 0

while (!finished) {
  int matchChar = 0
  println "please enter a letter"
  char searchLetter = System.console().readLine()
  for (int stringCrawl = 0; stringCrawl< inputLength; stringCrawl++) { //crawls your string for your desired letter
    if (input.charAt(stringCrawl)==searchLetter) {
        matchChar++
    }
  }
  charListLength = addChars.length()
  for (int listCrawl = 0; listCrawl < charListLength; listCrawl++) {
    if (addChars.charAt(listCrawl)==searchLetter) {
      finished = true
      println "Really? That letter again? You're clearly not listening. Goodbye!"
    }
  }
  if (!finished) {
    println "That character appears this many times: " + matchChar
  }
  addChars = addChars + searchLetter // addChars creates a running list of all the characters you've created
}
