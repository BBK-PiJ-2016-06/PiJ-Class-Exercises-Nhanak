public class Person {

  public String getInitials(String fullName) { // returns a string of initials
    String result = "";
    if (Character.isLetter(fullName.charAt(0))) { // need to see if first character is a letter
      result = result + String.valueOf(fullName.charAt(0)); // if so, add it to result
    }
    // String[] words = fullName.split(" "); < -- this did not work //
    for (int n = 0; n < fullName.length(); n++) {
      if (!Character.isLetter(fullName.charAt(n))) { // if it finds a space at n, it examines n + 1
        if ((n + 1) < fullName.length()) { // prevents it from looking if there are spaces at the end
          if (Character.isLetter(fullName.charAt(n + 1))) { // if n + 1 is not a space, it adds it to the result
           String nextInitial = String.valueOf(fullName.charAt(n + 1));
            result = result + nextInitial.toUpperCase();
          }
        }
      }
    }
    return result;
  }
    /**
    Below method did not work
    for (int i = 0; i < words.length; i++) {
      String nextInitial = "" + words[i].charAt(0);
      result = result + nextInitial.toUpperCase();
    }
    return result;
  } */

}
