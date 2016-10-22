public class ArrayCopier {

  public void copy(int[] source, int[] destination) {
    if (source.length >= destination.length){
      largerOrEqualSource(source, destination);
    } else if ( source.length < destination.length) {
      largerDestination(source, destination);
      }
  }

  public void largerOrEqualSource(int[] source, int[] destination) {
      for (int counter = 0; counter < destination.length; counter++) {
        destination[counter] = source[counter];
      }
    }
  public void largerDestination(int[] source, int[] destination) {
      for (int counter = 0; counter < source.length; counter ++) {
        destination[counter] = source[counter];
      }
      for (int counter = source.length; counter < destination.length; counter++) {
        destination[counter] = 0;
      }
    }
}
