
public class LibraryImpl implements Library {
    private String libraryName;
    private int libraryID;
    private int maxBooksPerUser;
    private String[] arrayOfUserNames;

    public LibraryImpl(String libraryName, int maxBooksPerUser) {
        this.libraryName = libraryName;
        libraryID = 0;
        this.maxBooksPerUser = maxBooksPerUser;
        arrayOfUserNames = new String[50];
        for (int i = 0; i < arrayOfUserNames.length; i++) {
          arrayOfUserNames[i] = "blank";
        }
    }

    public String getLibraryName() {
        return libraryName;
    }

    public int getID(String name) {
      int numOfID = checkForPrevStoredName(name);
      if ( numOfID == -1) {
        numOfID = registerNewUser(name);
      } else {
        System.out.println(name + " is already registered. ID is: ");
      }
      return numOfID;
    }

    private int registerNewUser(String name) {
      arrayOfUserNames[libraryID] = name;
      System.out.println("Registered: " + name + " . New ID is: ");
      int newUserIDNumber = libraryID;
      libraryID++;
      return newUserIDNumber;
    }

    public int getMaxBooksPerUser() {
        return maxBooksPerUser;
    }

    public void setMaxBooksPerUser(int numberOfBooks) {
        maxBooksPerUser = numberOfBooks;
    }

    public int checkForPrevStoredName(String name) {
      int userIdNumber = -1;
      for (int i = 0; i < arrayOfUserNames.length; i++) {
        if (name.equals(arrayOfUserNames[i])) {
          userIdNumber = i;
        }
      }
      return userIdNumber;
    }


}
