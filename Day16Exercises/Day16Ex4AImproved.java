import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

public class Day16Ex4AImproved {

  public static void main(String[] args) {
    if (args.length != 2) {
      System.out.println("Please enter <FileNameToCopy> <NewFileContainingCopy>");
      return;
    }

    Day16Ex4AImproved fileCopier = new Day16Ex4AImproved();
    fileCopier.launch(args[0] , args[1]);
  }

  public void launch(String fileNameToCopy, String newFile) {
    if (newFileIsNotAlreadyAFile(newFile)) {
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
    } else {
        System.out.println("File not copied.");
    }

  }

  /**
   *Method that checks if the file to be copied exists or if the new destination already exists.
   *If new destination already exists, asks if overwrite is ok.
   *@return boolean result of operation
   *@param String names of the new files to create
   */
  private boolean newFileIsNotAlreadyAFile(String newFile) {
    boolean result = true;
    File fileToCopy = new File(newFile);
    if(fileToCopy.exists()) {
        if (!overwriteConfirm()) {
          System.out.println("Denied overwrite.");
          result = false;
        }
    }
    return result;
  }

  /**
   * method which asks for user input to confirm if they would like to overwrite their
   * previous existing file
   * @return true if user does wish to overwrite their file, false if not
   */
  private boolean overwriteConfirm() {
    boolean result = false;
    System.out.println("Overwrite Second File? Press 1 to confirm, any other value to deny");
      String response = System.console().readLine();
      if (response.equals("1")) {
        result = true;
      }
    return result;
  }

}
