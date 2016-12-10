import java.io.File;

public class Q1b {
  public static void main(String[] args) {
    String path = ".";
    File file = new File(path);
    if (file == null || file.list().length == 0) {
      System.out.println("Error!");
    } else {
      String[] list = file.list();
      for (String item: list) {
        System.out.println(item);
      }
    }
  }
}
