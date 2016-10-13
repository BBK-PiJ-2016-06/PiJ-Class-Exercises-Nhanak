println "Welcome to Natemail beta"
// checking to see if user's sender email address is valid
boolean fromFinished = false
while (!fromFinished) {
  boolean validAtSign = false
  String fromText = System.console().readLine()
  int fromLength = fromText.length()
  if (fromText == "QUIT") {
    break;
  }
  if ((fromLength < 10) || (fromText.substring(0, 11) != "MAIL FROM: ")) { //
    println "Invalid command."
  } else {
      for (int stringCrawler = 11; stringCrawler<fromLength; stringCrawler++) {
        String charCheck = fromText.charAt(stringCrawler)
        if (charCheck == "@") {                         // looking for first @
          validAtSign = true
          for (stringCrawler = (stringCrawler+1); stringCrawler<fromLength; stringCrawler++) { // looking for any additional @ signs
            charCheck = fromText.charAt(stringCrawler)
            if (charCheck == "@") {
              validAtSign = false
              break;
            }
          }
        }
      }
      if (fromText.charAt(11)=="@" || fromText.charAt(fromLength-1)=="@") {  // looking for at sign at the beginning or end of the email
        validAtSign = false
      }
      if (!validAtSign) {
        println "You have entered an invalid email address, re-enter command"
      }
    }
  if (validAtSign) {
    fromFinished = true
    println "OK"
  }
}
// checking to see user enter's valid to line
boolean toFinished = false
while (!toFinished) {
  validAtSign = false
  String toText = System.console().readLine()
  int toLength = toText.length()
  if (toText == "QUIT") {
    break;
  }
  if ((toLength < 9) || (toText.substring(0, 9) != "MAIL TO: ")) { //
    println "Invalid command."
  } else {
      for (int stringCrawler = 10; stringCrawler<toLength; stringCrawler++) {
        String charCheck = toText.charAt(stringCrawler)
        if (charCheck == "@") {                         // looking for first @
          validAtSign = true
          for (stringCrawler = (stringCrawler+1); stringCrawler<toLength; stringCrawler++) { // looking for any additional @ signs
            charCheck = toText.charAt(stringCrawler)
            if (charCheck == "@") {
              validAtSign = false
              break;
            }
          }
        }
      }
      if (toText.charAt(10)=="@" || toText.charAt(toLength-1)=="@") {  // looking for at sign at the beginning or end of the email
        validAtSign = false
      }
      if (!validAtSign) {
        println "You have entered an invalid email address, re-enter command"
      }
    }
  if (validAtSign) {
    toFinished = true
    println "OK"
  }
}

println "Natemail closed."
