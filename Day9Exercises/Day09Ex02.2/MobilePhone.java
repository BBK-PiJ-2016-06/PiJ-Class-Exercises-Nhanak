public class MobilePhone extends OldPhone {
    private String[] callHistory; // will store the last ten numbers called

    public void ringAlarm(String alarm) { // sets off an alarm
          System.out.println("BUZZ BUZZ BUZZ");
    }

    private void playGame(String game) {  // activates method to play a game
      System.out.println("Opening game: " + game);
    }

    @Override
    public void call(String number) {
      super.call(number); // this isn't calling a constructor, so for syntax use ' super.methodName(parameters)''
      storeCallHistory(number); // rather than just using ' super(parameters); '
    }

    public MobilePhone(String brand) {
      super(brand);
    }

    public void storeCallHistory(String currentNumber) { // stores the last 10 numbers dialed
      if (callHistory == null) {    // if callHistory is empty, it creates a history of 10 numbers
        callHistory = new String[10];
        callHistory[9] = currentNumber;
      } else if (callHistory[0] != null) {  // if there has been more than 10 calls, knocks out 10th call
            for (int storedPosition = 9; storedPosition > 0; storedPosition--) { // then moves each stored# down one
                String replace = callHistory[storedPosition-1];
                callHistory[storedPosition] = replace;
            }
                callHistory[0] = currentNumber;
          } else {
              for (int i = 9; i >= 0; i--) {  // if the list isn't full, searches for a null space
                if (callHistory[i] == null) {
                  callHistory[i] = currentNumber;
                  break;
                }
              }
            }
      }

    public void printLastNumbers() {
      System.out.println("Call History \n >>>>>>");
      for (int i = 0; i <= 9; i++) {
        if (this.callHistory[i] == null) {
          System.out.println("Call #" + i + ": no call stored");
        } else {
            System.out.println("Stored Call # " + i + ": " + this.callHistory[i]);
          }
      }
    }
}
