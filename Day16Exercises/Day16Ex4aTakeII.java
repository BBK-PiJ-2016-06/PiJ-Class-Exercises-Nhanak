import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

public class Day16Ex4aTakeII {

  public static void main(String[] args) {
    if (args.length != 2) {
      System.out.println("Please enter <FileNameToCopy> <NewFileContainingCopy>");
      return;
    }

    Day16Ex4aTakeII fileCopier = new Day16Ex4aTakeII();
    fileCopier.launch(args[0] , args[1]);
  }

  public void launch(String fileNameToCopy, String newFile) {
    try(  BufferedReader in = new BufferedReader(new FileReader(new File(fileNameToCopy)));
          PrintWriter out = new PrintWriter(new File(newFile));
       ) {
           String line = null;
           while ((line = in.readLine()) != null) {
             out.write(line);
           }
         } catch (FileNotFoundException ex) {
           System.out.println("Could not find the file name given");
         } catch (IOException ex) {
           System.out.println("IO error");
           ex.printStackTrace();
         }

  }

}
