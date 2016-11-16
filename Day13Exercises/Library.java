/**
* Library
*/
public interface Library {

   public String getLibraryName();

   public int getID(String name);

   public int getMaxBooksPerUser();

   public void setMaxBooksPerUser(int numberOfBooks);
}
