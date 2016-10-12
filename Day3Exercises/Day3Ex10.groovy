// user input
println "Enter a short string of text"
String shortstring = System.console().readLine()
println "Now enter a longer sentence"
String longstring = System.console().readLine()
int lengthLS = longstring.length()
int lengthSS = shortstring.length()
boolean match = false
int fullMatchCount

for (int stringcrawlerLong = 0; stringcrawlerLong < lengthLS; stringcrawlerLong++) { // checks every letter of longstring
  char lscharacter = longstring.charAt(stringcrawlerLong)
    if (lscharacter == shortstring.charAt(0)) { // if the first letter of longstring matches, it goes on from here
      if ((stringcrawlerLong + lengthSS)<=lengthLS) {
      for (int stringcrawler2 = 1; stringcrawler2 < lengthSS; stringcrawler2++) { // crawls through the longstring's characters for the length of shortstring
        if (longstring.charAt(stringcrawlerLong + stringcrawler2) == shortstring.charAt(stringcrawler2)) {
          match = true
        } else if (longstring.charAt(stringcrawlerLong + stringcrawler2) != shortstring.charAt(stringcrawler2)) {
          match = false
          }
        }
        if (match) {
          fullMatchCount++
        }
        match = false
      }
    }
}
println "Your short text appears in the longer text " + fullMatchCount + " times."
