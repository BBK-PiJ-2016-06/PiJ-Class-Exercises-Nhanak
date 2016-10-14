println "Welcome to Natemail beta"
String fromText, toText;
// checking to see if user's sender email address is valid
boolean fromFinished = false
while (!fromFinished) {
  boolean validAtSign = false
  print ">>>"
  fromText = System.console().readLine()
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
// checking to see user enters valid to line
boolean toFinished = false
while (!toFinished) {
  if (fromText == "QUIT") {
    break;
  }
  validAtSign = false
  print ">>>"
  toText = System.console().readLine()
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
// user inputs DATA command
boolean typedDATA = false
String wordDATA
while (!typedDATA) {
  if ((fromText == "QUIT") || ( toText== "QUIT")) {
    break;
  }
  print ">>>"
  wordDATA = System.console().readLine()
  if (wordDATA == "QUIT") {
    break;
  } else if (wordDATA != "DATA") {
    println "You have entered an invalid command."
    } else {
      typedDATA = true
    }
}
// user now enters the body of their email
String allLinesOfEmail = ""
String oneLine
boolean finishedComposing = false
while (!finishedComposing) {
  if ((fromText == "QUIT") || ( toText== "QUIT") || (wordDATA == "QUIT")) {
    break;
  }
  oneLine = System.console().readLine()
  if (oneLine == "QUIT") {
    break;
  }
  if (oneLine == ".") {
    println "Email body complete"
    break;
  }
  allLinesOfEmail = allLinesOfEmail + '\n' + oneLine       // the   \n will print a line break
}
// creates sending message and shows entire email contents
boolean finishedSending = false
while (!finishedSending) {
  if ((fromText == "QUIT") || ( toText== "QUIT") || (wordDATA == "QUIT") || (oneLine == "QUIT")) {
    break;
  }
  println "Sending email..."
  println fromText
  println toText
  println allLinesOfEmail
  finishedSending = true
  println "Email sent!"
}
// looks for a quit message
boolean userQuit = false
while (!userQuit) {
  if ((fromText == "QUIT") || ( toText== "QUIT") || (wordDATA == "QUIT") || (oneLine == "QUIT")) {
    break;
  }
  print ">>>"
  String lookingForQuit = System.console().readLine()
  if (lookingForQuit == "QUIT") {
    println "Goodbye!"
    userQuit = true
  } else {
    println "Invalid command."
    }
}
println "Natemail closed."
