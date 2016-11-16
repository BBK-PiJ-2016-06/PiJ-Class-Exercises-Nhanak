String doggyMethod(int n) {
  if (n <= 0) {
    return "";
  }
  String result = doggyMethod(n-3) + n + doggyMethod(n-2);
  return result;
}

//base case needed to be put as the first thing to check in the method, otherwise the method would
//just continue to call upon itself without anything to stop it.
