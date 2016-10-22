public class MatrixChecker {

  public boolean isSymmetrical(int[] arrayInput) { // checks to see if an array is symmetrical or not
    int fromArrayBack = arrayInput.length -1;
    for (int arrayCrawler = 0; arrayCrawler<(arrayInput.length/2); arrayCrawler++) {
      if (arrayInput[arrayCrawler] != arrayInput[fromArrayBack]) {
        return false;
      }
      fromArrayBack = fromArrayBack - 1;
    }
    return true;
  }

  public boolean isSymmetrical(int[][] matrixInput) { // checks to see if a 2d matrix is symmetrical or not
    for (int rowCrawler = 0; rowCrawler<matrixInput.length; rowCrawler++) {
      for (int columnCrawler = 0; columnCrawler<matrixInput[0].length; columnCrawler++) {
        if (matrixInput[rowCrawler][columnCrawler] != matrixInput[columnCrawler][rowCrawler]) {
          return false;
        }
      }
    }
    return true;
  }

  public boolean isTriangular(int[][] matrixInput) { // checks to see if a 2d matrix is triangular or not
    for (int rowCrawler = 0; rowCrawler<matrixInput.length; rowCrawler++) {
      for (int columnCrawler = 0; columnCrawler<matrixInput[0].length; columnCrawler++) {
        if ((rowCrawler > columnCrawler) && (matrixInput[rowCrawler][columnCrawler]!= 0)) {
          return false;
        }
      }
    }
    return true;
  }
}
