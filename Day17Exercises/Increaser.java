public class Increaser implements Runnable {
  private Counter counter;

  public Increaser(Counter counter) {
    this.counter = counter;
  }

  public static void main(String args[]) {

    Counter counter = new Counter();

    for (int i = 0; i < 100; i++) {
      Increaser increaserTask = new Increaser(counter);
      String name = ("Thread#" + i);
      Thread t = new Thread(increaserTask, name);
      System.out.println(t.getName() + " starting");
      t.start(); // once a thread is launched, program continues on, whether thread is complete or not
    }

  }

  public void run() {
       synchronized(counter) {
        System.out.println("Starting at " + counter.getCount());
        for (int i = 0; i < 1000; i++) {
          counter.increase();
        }
        System.out.println("Stopping at " + counter.getCount());
      }
   }

}
