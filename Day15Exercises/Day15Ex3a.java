public class Day15Ex3a {

   public static void main(String[] args) {
     Day15Ex3a exercise3 = new Day15Ex3a();
     exercise3.launch();
   }

   public void launch() {

     StoresEntries average = new StoresEntries();

     while(average.getTotalEntries() < 11) {
      System.out.println("Please enter a number");
      try {
        String str = System.console().readLine();
        int input = Integer.parseInt(str);
        average.addToSumOfEntries(input);
      } catch (NumberFormatException ex) {
        System.out.println("Program threw " + ex + " because you didn't enter a number");
      }
    }
    System.out.println("You have entered 10 numbers");
    System.out.println("The mean average is " + (average.getSumOfEntries()/10));
   }
}
