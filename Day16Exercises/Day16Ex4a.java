import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

public class Day16Ex4a {

  public static void main(String[] args) {
    if (args.length != 2) {
      System.out.println("You entered an invalid amount of files to search");
    } else {
      BufferedReader in = null;
      PrintWriter out = null;
        try {
          File file = new File(args[0]);
          if (file.exists()) {
            File file2 = new File(args[1]);
            file2.createNewFile();
            in = new BufferedReader(new FileReader(file));
            String line = null;
            out = new PrintWriter(file2);
            while ((line = in.readLine()) != null) {
              file2 = out.write(line);
            }
          } else {
              System.out.println("File does not exist");
          }
        } catch (FileNotFoundException ex) {
            System.out.println("File does not exist");
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
          try{
            in.close();
            out.close();
          } catch (IOException ex) {
              ex.printStackTrace();
          }
        }
      }

  }
}
