println "Please enter a number"
Double input1 = Double.parseDouble(System.console().readLine())
println "Please enter another number"
Double input2 = Double.parseDouble(System.console().readLine())
println "Now, how would you like to manipulate this data?"
println "Press 1 to add"
println "Press 2 to subtract"
println "Press 3 to multiply"
println "Press 4 to divide"
int choice = Integer.parseInt(System.console().readLine())
switch (choice) {
  case 1: double result = input1 + input2
  println result
  break;
  case 2: double result = input1 - input2
  println result
  break;
  case 3: double result = input1 * input2
  println result
  break;
  case 4: double result = input1/input2
  println result
  break;
  default: println "You have made a wrong choice"
  break;
}
