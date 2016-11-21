public class StoresEntriesB {

  private int totalEntries = 0;
  private int sumOfEntries = 0;
  private int numberOfDesiredEntries;

  public StoresEntriesB(int number) {
    this.numberOfDesiredEntries = number;
  }

  public void addToSumOfEntries(int newNumber) {
      sumOfEntries += newNumber;
      totalEntries++;
  }

  public int getTotalEntries() {
    return totalEntries;
  }

  public int getSumOfEntries() {
    return sumOfEntries;
  }

  public int getNumberOfDesiredEntries() {
    return numberOfDesiredEntries;
  }

}
