println "To play, each user must select Rock, Paper or Scissors by typing R, P, or S"
enum Possiblecombos {
 RR, PP, SS, RP, RS, PR, PS, SR, SP;
  }
Boolean gameover = false
int u1wincount = 0
int u2wincount = 0

while (!gameover) {
  println "User one, throw down!"
  String u1turn = System.console().readLine()
  println "User two, your turn!"
  String u2turn = System.console().readLine()
  Possiblecombos completeturn = u1turn + u2turn
  switch (completeturn) {
    case "RR": println "Tie"
      break;
    case "SS": println "Tie"
      break;
    case "PP": println "Tie"
      break;
    case "RP": println "User 2 wins the hand"
      u2wincount = u2wincount + 1
      break;
    case "RS": println "User 1 wins the hand"
      u1wincount = u1wincount + 1
    case "SP": println "User 1 wins the hand"
      u1wincount = u1wincount + 1
      break;
    case "SR": println "User 2 wins the hand"
      u2wincount = u2wincount + 1
      break;
    case "PR": println "User 1 wins the hand"
      u1wincount = u1wincount + 1
      break;
    case "PS": println "User 2 wins the hand"
      u2wincount = u2wincount + 1
      break;
    default: println "One of you made a wrong choice, try again"
      break;
 }
 if (u1wincount == 3 || u2wincount == 3) {
    gameover = true
    }
}
if (u1wincount == 3) {
  println "User 1 Wins the game!"
  } else { println "User 2 Wins! the game"
}
