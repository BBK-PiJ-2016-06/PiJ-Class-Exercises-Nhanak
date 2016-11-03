public class Day10Ex4 {

  public static void main (String[] args) {

    Day10Ex4 exercise = new Day10Ex4();

    exercise.printAnswer("tatatatatat");
    exercise.printAnswer("tacocat");
    exercise.printAnswer("shakeboots");

  }

  public boolean isPalindrome(String word) {  // checks to see if passed String is a palindrome
    if (word.length() <= 1) {
      return true;
    } else if (word.charAt(0) != word.charAt(word.length()-1)) {
        return false;
      }
      return isPalindrome(word.substring(1,(word.length()-1)));
    }


  public void printAnswer(String wordInput) { // prints a result based on result of isPalindrome
    if (isPalindrome(wordInput)) {
    System.out.println("Yep, " + wordInput + " is a palindrome.");
    } else {
    System.out.println("Nah, " + wordInput + " is not a palindrome.");
    }
  }

}
