public class Matrix {
  private int[][] myMatrix;

  public Matrix(int rows, int columns) {   // fills out the matrix to be size of rows & columns, then initializes them all to one
    myMatrix = new int[rows][columns];
    for (int r = 0; r < rows; r ++) {
      for (int c = 0; c < columns; c++) {
      myMatrix[r][c] = 1;
      }
    }
  }
  public setElement(int rowNum, int colNum, int value) {
   if (rowNum > myMatrix.length || colNum > myMatrix[0].length) {
     println "Your indeces are of invalid lengths";
   } else {
    myMatrix[rowNum][colNum] = value;
   }
  }
  public setRow(int rowNum, String setRow) {
    if (rowNum > myMatrix.length) {
      println "Your indeces are of invalid lengths";
    } else {}
      else {
        for (int c = 0; c < myMatrix[0].length; c++) {
          for (int stringCrawler = 0; stringCrawler<setRow.length; ) // come back here
          myMatrix[rowNum][c] = setRow
        }
  }
}
