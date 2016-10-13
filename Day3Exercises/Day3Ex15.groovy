println "Please enter a word or a phrase: "
String str = System.console().readLine()
boolean isPalindrome = true
int stringLength = str.length()
int stringCrawler = 0
int spacesFromBack = str.length()
char frontToBack, backToFront
boolean frontNotChar = true
boolean backNotChar = true

for (stringCrawler = 0; stringCrawler < (stringLength/2); stringCrawler++) {
  spacesFromBack = spacesFromBack - 1
  frontToBack = str.charAt(stringCrawler)
  backToFront = str.charAt(spacesFromBack)
  while (frontNotChar) {
    if (!Character.isLetter(frontToBack)) {  // if frontToBack is NOT a letter, it enters brackets to bump it up one
      stringCrawler = stringCrawler + 1
      frontToBack = str.charAt(stringCrawler)
    } else {
      frontNotChar = false
      }
  }
  while (backNotChar) {                       //cycles from backwards until it finds a character
    if (!Character.isLetter(backToFront)) {  // if backToFront is NOT a letter, it enters brackets to bump it back one
      spacesFromBack = spacesFromBack - 1
      backToFront = str.charAt(spacesFromBack)
    } else {
      backNotChar = false
      }
  }
  if (Character.toLowerCase(frontToBack) != Character.toLowerCase(backToFront)) { // checks for palindrome
    isPalindrome = false
    break;
  }
  frontNotChar = true
  backNotChar = true
}
if (isPalindrome) {
  println "What you wrote is a dang relaxed palindrome."
} else {
  println "What you wrote ain't a dang relaxed palindrome"
  }
