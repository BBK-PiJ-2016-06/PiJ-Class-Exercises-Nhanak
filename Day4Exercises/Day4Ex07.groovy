class HomeCosts {
  double baseCost;
  double interestRate;
  double mortgageLength;

  String doubleSnipper(double numToSnip) {
    String doubleToString = numToSnip
    for (int counter = 0; counter < doubleToString.length(); counter++) {
      if (doubleToString.charAt(counter)=='.') {
        doubleToString = doubleToString.substring(0,counter+3);
        break;
      }
    }
    return doubleToString
  }

  double totalCost(HomeCosts newHome) {  // calculates the total cost including interest
    double result = newHome.baseCost * (1+ (newHome.interestRate/100))
    return result
  }

  double yearlyCost(HomeCosts newHome) { //  calculates how much one will have to pay off per year
      double result = totalCost(newHome)/newHome.mortgageLength
      return result
  }
  double yearsOfInterest(HomeCosts newHome) {
    double totalInterest = newHome.totalCost(newHome) - newHome.baseCost
    double result = totalInterest/(yearlyCost(newHome))
    return result
  }
}

HomeCosts myHome = new HomeCosts();

println "please enter the total borrowed: "
myHome.baseCost = Double.parseDouble(System.console().readLine())
println "please enter the interest rate (number only): "
myHome.interestRate = Double.parseDouble(System.console().readLine())
println "Please enter the number of years you have to pay this: "
myHome.mortgageLength = Integer.parseInt(System.console().readLine())

println "Here is the total cost to be paid: £" + myHome.doubleSnipper(myHome.totalCost(myHome))
println "This is how much you will pay per year: £" + myHome.doubleSnipper(myHome.yearlyCost(myHome))
println "This is how long it will take you to pay off the interest: " + myHome.doubleSnipper(myHome.yearsOfInterest(myHome)) + " years."
