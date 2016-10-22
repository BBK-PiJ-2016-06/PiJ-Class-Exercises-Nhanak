public class Day05Ex02 {
  public static void main(String[] args) {
    ArrayCopier copy = new ArrayCopier();
    int[] fixedArray = {45, 66, 42};
    int[] variableArray = new int[args.length];

    for (int counter = 0; counter < args.length; counter++) {
      variableArray[counter] = Integer.parseInt(args[counter]);
    }
    ArrayCopier ex2Copier = new ArrayCopier();
    ex2Copier.copy(fixedArray, variableArray);

    for (int counter=0; counter < variableArray.length; counter++) {
      System.out.print(variableArray[counter] + " ");
    }
    System.out.println();
  }
}
