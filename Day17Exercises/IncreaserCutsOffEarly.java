public class IncreaserCutsOffEarly implements Runnable {
  private Counter counter;

  public IncreaserCutsOffEarly(Counter counter) {
    this.counter = counter;
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
       synchronized(this) { // synchronizing the object doesn't lock up counter, as it's an external object
        System.out.println("Starting at " + counter.getCount());
        for (int i = 0; i < 1000; i++) {
          counter.increase();
        }
        System.out.println("Stopping at " + counter.getCount());
      }
  }

}
