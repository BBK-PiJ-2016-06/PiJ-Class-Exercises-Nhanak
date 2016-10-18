class Integer2 {
  int value;

  int getValue() { // a getter that just returns the value
    return value
  }
  void setValue(int value1) { // the (int value) takes on the value of i below
    this.value = value1;           // then this line tells your field from above to = that value
  }                           // the 'this' is needed if your method is (int value)
  boolean isEven() { //checks to see if your int is even by using the last character of the number
    boolean result = false
    String converter = value
    char endingChar = converter.charAt(converter.length()-1)
    if (endingChar=='0' || endingChar =='2' || endingChar =='4' || endingChar =='6' || endingChar =='8') {
      result = true
    }
    return result
  }
  boolean isOdd() { //checks to see if your int is odd by using the last character of the number
    boolean result = false;
    String converter = value;
    char endingChar = converter.charAt(converter.length()-1);
    if (endingChar=='1' || endingChar =='3' || endingChar =='5' || endingChar =='7' || endingChar =='9') {
      result = true;
    }
    return result
  }
  void prettyPrint() { // prints your value when the method is called
    println "Here is your pretty int: " + value
  }
  String toString() { // converts the value of your int in to a string.
    String convertInt = value
  }
}

Integer2 i2 = new Integer2();
print "Enter a number: ";
String str = System.console().readLine();
int i = Integer.parseInt(str);
i2.setValue(i);
print "The number you entered is "
if (i2.isEven()) {
println "even.";
} else if (i2.isOdd()) {
println "odd.";
} else {
println "undefined!! Your code is buggy!";
}
int parsedInt = Integer.parseInt(i2.toString());
if (parsedInt == i2.getValue()) {
println("Your toString() method seems to work fine.");
}
