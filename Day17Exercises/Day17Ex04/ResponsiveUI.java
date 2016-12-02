import java.util.ArrayList;
import java.util.List;


public class ResponsiveUI {

  public static void main(String[] args) {
    ResponsiveUI myUI = new ResponsiveUI();
    myUI.launch();
  }

  private List<Integer> finishedTaskList;
  private int currentActiveTasks = 0;

  public void launch() {

      finishedTaskList = new ArrayList<Integer>();

      for(int i = 0; i < 10; i++) {
        System.out.print( "Please enter a time in MS to wait: ");
        int timeToWait = Integer.parseInt(System.console().readLine());
        Task runnableTask = new Task(i, timeToWait, this);
        Thread t = new Thread(runnableTask);
        t.start();
        currentActiveTasks++;
        if ( !finishedTaskList.isEmpty() ) {
          System.out.print("Finished Tasks: ");
          printFinishedTasks();
        }
      }
      while ( currentActiveTasks != 0 ) {
        waitForAWhile();
      }
      System.out.print("Finished Tasks: ");
      printFinishedTasks();
  }

  public synchronized void waitForAWhile() {
    try {
      wait();
    } catch( IllegalMonitorStateException ex) {
      ex.printStackTrace();
    } catch( InterruptedException ex ) {
      System.out.println("It was interrupted");
    }
  }

  public synchronized void addToList(int taskNum) {
    finishedTaskList.add(taskNum);
    currentActiveTasks--;
    notifyAll();
  }

  public synchronized void printFinishedTasks() {
    if (!finishedTaskList.isEmpty()) {
      System.out.print(finishedTaskList.remove(0));
      if (!finishedTaskList.isEmpty()) {
        System.out.print(", ");
        printFinishedTasks();
      }
    }
    System.out.println("");
  }



}
