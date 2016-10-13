println "please enter some text"
String input = System.console().readLine()
int inputLength = input.length()
boolean finished = false
String palindrome = ""
String letterAdd = ""

for (int stringCrawl = 0; stringCrawl < inputLength; stringCrawl++) {
    letterAdd = input.charAt(stringCrawl)
    palindrome = letterAdd + palindrome
    }

println input + palindrome
