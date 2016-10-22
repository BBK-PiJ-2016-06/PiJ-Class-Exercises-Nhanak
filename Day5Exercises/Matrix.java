// first three methods of this code co-authored in class by Nathan and Bilal
public class Matrix {
  private int[][] myMatrix;

  public void Matrix(int rows, int columns) {   // fills out the matrix to be size of rows & columns, then initializes them all to one
    myMatrix = new int[rows][columns];
    for (int r = 0; r < rows; r ++) {
      for (int c = 0; c < columns; c++) {
        myMatrix[r][c] = 1;
      }
    }
  }

  public void setElement(int rowNum, int colNum, int value) { // alters one particular matrix position to be a value
   if (rowNum > myMatrix.length || colNum > myMatrix[0].length) {
     System.out.println("Your indeces are of invalid lengths");
   } else {
    myMatrix[rowNum][colNum] = value;
   }
  }

  public void setRow(int rowNum, String setRow) {
    boolean inputIsValid = true;
    char firstChar = setRow.charAt(0);
    char lastChar = setRow.charAt(setRow.length()-1);
    if (rowNum > myMatrix.length && rowNum > -1) {   // checks to see if the row entered is valid
      System.out.println("You have chosen an invalid row number");
      inputIsValid = false;
    }
    if (!Character.isDigit(firstChar) || !Character.isDigit(lastChar)) { //checks if setRow starts and ends with digits
      inputIsValid = false;
      System.out.println("First and last character must be a number");
    }
    if (!setRow.matches("^[0-9,]+$")) { // checks if setRow contains only #'s and commas'
      inputIsValid = false;
      System.out.println("You have entered an invalid character");
    }
    if (inputIsValid) {
        String[] setRowAsArray = setRow.split(","); // setRow split up by commas in to an array
        for (int c = 0; c < setRowAsArray.length; c++) {
              myMatrix[rowNum][c] = Integer.parseInt(setRowAsArray[c]);
        }
    }
  }
  public void setColumn(int columnNum, String setCol) { // alters a whole row's values to be an input of numbers separated by commas
    boolean inputIsValid = true;
    char firstChar = setCol.charAt(0);
    char lastChar = setCol.charAt(setCol.length()-1);
    if (columnNum > myMatrix[0].length && columnNum > -1) {   // checks to see if the row entered is valid
      System.out.println("You have chosen an invalid column number");
      inputIsValid = false;
    }
    if (!Character.isDigit(firstChar) || !Character.isDigit(lastChar)) { //checks if setCol starts and ends with digits
      inputIsValid = false;
      System.out.println("First and last character must be a number");
    }
    if (!setCol.matches("^[0-9,]+$")) { // checks if setCol contains only #'s and commas'
      inputIsValid = false;
      System.out.println("You have entered an invalid character");
    }
    if (inputIsValid) {
        String[] setColAsArray = setCol.split(","); // setCol split up by commas in to an array
        for (int c = 0; c < setColAsArray.length; c++) {
              myMatrix[c][columnNum] = Integer.parseInt(setColAsArray[c]);
        }
    }
  }

  public String toString() { // returns matrix where rows separated by ; and each entry separated by ,
    String result = "[";
    for (int rowCrawler = 0; rowCrawler < myMatrix.length; rowCrawler++) {
      for (int columnCrawler = 0; columnCrawler < myMatrix[0].length; columnCrawler++) {
        result = result + myMatrix[rowCrawler][columnCrawler];
        if (columnCrawler != (myMatrix[0].length - 1)) {
          result = result + ",";
        }
      }
      if (rowCrawler != (myMatrix.length - 1)) {
        result = result + ";";
      }
    }
    result = result + "]";
    return result;
  }

  public void prettyPrint() {
    String printRow;
    for (int rowCrawler = 0; rowCrawler < myMatrix.length; rowCrawler++) {
      printRow = "";
      for (int columnCrawler = 0; columnCrawler < myMatrix[0].length; columnCrawler++) {
        printRow = printRow + myMatrix[rowCrawler][columnCrawler] + "\t";
      }
      System.out.println(printRow);
    }
  }
}
