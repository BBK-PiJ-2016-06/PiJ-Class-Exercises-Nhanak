public class MobilePhone extends OldPhone {
    private String[] callHistory; // will store the last ten numbers called

    public void ringAlarm(String alarm) { // sets off an alarm
          System.out.println("BUZZ BUZZ BUZZ");
    }

    public void playGame(String game) {  // activates method to play a game
      System.out.println("Opening game...");
    }

    @Override
    public void call(String number) {
      super.call(number);
      storeCallHistory(number);
    }

    public void storeCallHistory(String currentNumber) { // stores the last 10 numbers dialed
      if (callHistory == null) {    // if callHistory is empty, it creates a history of 10 numbers
        callHistory = new String[10];
        callHistory[0] = currentNumber;
        System.out.println("It stored: " + callHistory[0]);
      } else {
          for (int i = 0; i < callHistory.length; i++) {  // if the list isn't full, searches for a null space
            if (callHistory[i] == null) {
              callHistory[i] = currentNumber;
            } else if (callHistory[9] != null) {  // if there has been more than 10 calls, knocks out 10th call
                for (int storedPosition = 9; storedPosition > 0; storedPosition--) { // then moves each stored# down one
                  if (storedPosition == 0) {                                       // and stores the new one in [0]
                    callHistory[0] = currentNumber;
                  } else {
                    callHistory[storedPosition] = callHistory[storedPosition-1];
                    }
                }
              }
          }
        }
    }

    public void printLastNumbers() {
      for (int i = 0; i <= 10; i++) {
        if (this.callHistory[i] == null) {
          System.out.println("No further numbers stored");
          break;
        } else {
            System.out.println("Call # " + i + ": " + this.callHistory[i]);
          }
      }
    }
}
