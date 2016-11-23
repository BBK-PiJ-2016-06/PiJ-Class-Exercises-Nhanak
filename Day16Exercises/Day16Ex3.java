import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Day16Ex3 {

  public static void main(String[] args) {
    if (args.length == 0) {
      System.out.println("You didn't enter a file to search");
    } else {
        File file = new File(args[0]);
        try {
            if (file.exists()) {
            BufferedReader in = new BufferedReader(new FileReader(file));
            String line;
            while ((line = in.readLine()) != null) {
              System.out.println(line);
            }
          } else {
            System.out.println("File does not exist");
          }
        } catch (FileNotFoundException ex) {
          System.out.println("File does not exist");
        } catch (IOException ex) {
          ex.printStackTrace();
        }
      }

  }
}
