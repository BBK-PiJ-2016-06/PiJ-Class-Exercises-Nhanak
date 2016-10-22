public class Day05Ex05 {

  public static void main(String[] args) {
    MatrixChecker machine = new MatrixChecker();

    int[] aSymmetricalArray =  {22, 666, 4940, 348, 22, 292};
    int[] symmetricalArray = {3, 4, 5, 6, 6, 5, 4, 3};
    int[][] aSymmetricalMatrix = {{34,23,59},{3928,99,293},{49,3,5}};
    int[][] symmetricalMatrix = {{1,7,3},{7,4,-5},{3,-5,6}};
    int[][] aTriangularMatrix = {{34,23,59},{3928,99,293},{49,3,5}};
    int[][] triangularMatrix = {{0,0,0},{0,0,0},{0,0,0}};

    if (machine.isSymmetrical(aSymmetricalArray)) { //  these two check an array for symmetry
      System.out.println("That array is symmetrical!");
      } else {
      System.out.println("That array is not symmetrical!");
        }

    if (machine.isSymmetrical(symmetricalArray)) {
      System.out.println("That array is symmetrical!");
    } else {
      System.out.println("That array is not symmetrical!");
      }

    if (machine.isSymmetrical(aSymmetricalMatrix)) { // these two check a matrix for symmetry
      System.out.println("That matrix is symmetrical!");
      } else {
      System.out.println("That matrix is not symmetrical!");
        }

    if (machine.isSymmetrical(symmetricalMatrix)) {
      System.out.println("That matrix is symmetrical!");
    } else {
      System.out.println("That matrix is not symmetrical!");
      }

    if (machine.isTriangular(aTriangularMatrix)) { // these two check a matrix to see if it's triangular
      System.out.println("That matrix is Triangular!");
      } else {
      System.out.println("That matrix is not Triangular!");
        }

    if (machine.isTriangular(triangularMatrix)) {
      System.out.println("That matrix is Triangular!");
    } else {
      System.out.println("That matrix is not Triangular!");
      }
  }
}
