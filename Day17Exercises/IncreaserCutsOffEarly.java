public class IncreaserCutsOffEarly implements Runnable {
  private Counter c;

  public IncreaserCutsOffEarly(Counter counter) {
    this.c = counter;
  }

  public static void main(String args[]) {

    Counter counter = new Counter();

    for (int i = 0; i < 100; i++) {
      IncreaserCutsOffEarly increaserTask = new IncreaserCutsOffEarly(counter);
      String name = ("Thread#" + i);
      Thread t = new Thread(increaserTask, name);
      System.out.println(t.getName() + " starting");
      t.start(); // once a thread is launched, program continues on, whether thread is complete or not
    }

  }

  public void run() {
    try {
      while (c.getCount()%1000 != 0) {
        wait();
      }
      synchronized(c) {
        System.out.println("Starting at " + c.getCount());
        for (int i = 0; i < 1000; i++) {
          c.increase();
        }
        System.out.println("Stopping at " + c.getCount());
        notifyAll();
      }
    } catch (InterruptedException ex) {
      // do nothing
    } catch (IllegalMonitorStateException ex) {
      // do  nothing
    }
  }

}
