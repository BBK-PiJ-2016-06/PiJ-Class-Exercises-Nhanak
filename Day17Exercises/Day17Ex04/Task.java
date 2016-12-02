import java.util.ArrayList;
import java.util.List;

public class Task implements Runnable {

  private int taskNumber;
  private int timeToWait;
  private ResponsiveUI origin;

  public Task(int taskNumber, int timeToWait, ResponsiveUI origin) {
    this.taskNumber = taskNumber;
    this.timeToWait = timeToWait;
    this.origin = origin; 
  }

  @Override
  public void run() {
    try {
      Thread.sleep(timeToWait);
      origin.addToList(this.taskNumber);
      } catch (InterruptedException ex) {
      ex.printStackTrace();
      }
  }




}
