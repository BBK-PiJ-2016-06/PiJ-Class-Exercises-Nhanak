println "Please enter a number over 1,000 that includes decimals"
String str = System.console().readLine()
int strLength = str.length()
String numberGrabber = "", strLeftOfDecimal = "", strRightOfDecimal = ""

for (int stringCrawler = 0; stringCrawler < strLength; stringCrawler++)  {
  numberGrabber = str.charAt(stringCrawler)
  if (numberGrabber == ".") {      // checks for decimal. If decimal, builds (all of) strRightOfDecimal, quits loop
    strRightOfDecimal = str.substring((stringCrawler + 1));
    break;
  }
  if (numberGrabber != ",") {         // checks for commas. If no commas, it adds the # to strLeftOfDecimal
    strLeftOfDecimal = strLeftOfDecimal + numberGrabber
  }
}
BigDecimal leftOfDecimal = Integer.parseInt(strLeftOfDecimal)
BigDecimal rightOfDecimal = Integer.parseInt(strRightOfDecimal)*0.01
leftOfDecimal = leftOfDecimal/2
rightOfDecimal = (rightOfDecimal/2)
println "Half of that number is: " + (leftOfDecimal + rightOfDecimal)
