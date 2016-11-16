
public class LibraryImpl implements Library {
    private String libraryName;
    private int libraryID;
    private int maxBooksPerUser;
    private int[] arrayOfIDs;
    private String[] arrayOfUserNames;

    public LibraryImpl(String libraryName, int maxBooksPerUser) {
        this.libraryName = libraryName;
        libraryID = 0;
        this.maxBooksPerUser = maxBooksPerUser;
        arrayOfIDs = new int[50];
        arrayOfUserNames = new String[50];
        for (int i = 0; i < arrayOfIDs.length; i++) { // initializes both arrays
          arrayOfIDs[i] = -1;
          arrayOfUserNames[i] = "blank";
        }
    }

    public String getLibraryName() {
        return libraryName;
    }

    public int getID(String name) {
      int numOfID = checkForPrevStoredName(name);
      if ( numOfID == -1) {
        arrayOfIDs[libraryID] = libraryID;
        arrayOfUserNames[libraryID] = name;
        System.out.println("Registered: " + name + " . New ID is: ");
        numOfID = libraryID;
        libraryID++;
      } else {
        System.out.println(name + " is already registered. ID is: ");
      }
      return numOfID;
    }

    public int getMaxBooksPerUser() {
        return maxBooksPerUser;
    }

    public void setMaxBooksPerUser(int numberOfBooks) {
        maxBooksPerUser = numberOfBooks;
    }

    public int checkForPrevStoredName(String name) {
      boolean isRegistered = false;
      int registeredUserID = -1;
      for (int i = 0; i < arrayOfIDs.length; i++) {
        if (name == arrayOfUserNames[i]) {
          isRegistered = true;
          registeredUserID = arrayOfIDs[i];
        }
      }
      return registeredUserID;
    }


}
