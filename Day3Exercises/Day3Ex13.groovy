println "Please enter a word or a phrase: "
String str = System.console().readLine()
boolean isPalindrome = true
int stringLength = str.length()
int stringCrawler = 0
int spacesFromBack = str.length()
char frontToBack, backToFront

for (stringCrawler = 0; stringCrawler < stringLength; stringCrawler++) {
  spacesFromBack = spacesFromBack - 1
  frontToBack = str.charAt(stringCrawler)
  backToFront = str.charAt(spacesFromBack)
  if (frontToBack != backToFront) {
    isPalindrome = false
    break;
  }
}


if (isPalindrome) {
  println "What you wrote is a dang strict palindrome."
} else {
  println "What you wrote ain't a dang strict palindrome"
  }
