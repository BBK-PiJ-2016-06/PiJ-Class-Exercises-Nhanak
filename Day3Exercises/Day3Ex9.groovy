println "Please enter some text"
String input = System.console().readLine()
int eCounter = 0
int textlength = input.length()
for (int stringcrawl = 0; stringcrawl < textlength; stringcrawl++) {
  if (input.charAt(stringcrawl)== "e") {
    eCounter++
  }
}
println "There are " + eCounter + " e's in your text."
