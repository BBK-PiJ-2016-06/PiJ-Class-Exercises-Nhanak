public class Day05Ex03 {

  public static void main(String[]  args) {

    Matrix firstMatrix = new Matrix();

    int rowSet = 4;
    int columnSet = 6;
    firstMatrix.Matrix(rowSet, columnSet);

    firstMatrix.setElement(2, 3, 756);
    String rowInput = "78,33,547,69";
    firstMatrix.setRow(3, rowInput);
    String columnInput = "24,999,666";
    firstMatrix.setColumn(5, columnInput);
    System.out.println("Here's the Matrix printed linearly:" + firstMatrix.toString());
    System.out.println("Here's the Matrix printed visually: ");
    firstMatrix.prettyPrint();
  }
}
