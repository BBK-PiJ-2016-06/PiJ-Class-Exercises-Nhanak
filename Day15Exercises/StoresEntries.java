public class StoresEntries {

  private int totalEntries = 0;
  private int sumOfEntries = 0;

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

}
