import java.io.File;

public class Mkdir {
  public static void main(String[] args) {
    File file = new File(args[0]);
    file.mkdir();
  }
}
