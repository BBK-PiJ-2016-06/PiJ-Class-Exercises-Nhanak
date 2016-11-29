public class Increaser implements Runnable {
  private Counter c;

  public Increaser(Counter counter) {
    this.c = counter;
  }

  public static void main(String args[]) {

    Counter counter = new Counter();

    for (int i = 0; i < 100; i++) {
      Increaser increaserTask = new Increaser(counter);
      String name = ("Thread#" + i);
      Thread t = new Thread(increaserTask, name);
      System.out.println(t.getName() + " starting");
      t.start(); // once a thread is launched, program continues on, whether thread is complete or not
      try {
        t.sleep(10);
      } catch (InterruptedException ex) {
        // sleep less
      }
    }

  }

  public void run() {
    try {
    synchronized(c) {
        System.out.println("Starting at " + c.getCount());
        for (int i = 0; i < 1000; i++) {
          c.increase();
        }
        System.out.println("Stopping at " + c.getCount());
        notifyAll();
      }
    } catch (IllegalMonitorStateException ex) {
      // do  nothing
    }
  }

}
