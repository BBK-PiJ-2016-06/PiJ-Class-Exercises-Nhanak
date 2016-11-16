public class UserImpl implements User {
    private String userName;
    private int userID;
    private Library usersLibrary;

    public UserImpl(String name) {
        this.userName = name;
        userID = -1;
    }

    public String getUserName() {
        return userName;
    }

    public int getUserID(){
        return userID;
    }

    public void register(Library library) {
        usersLibrary = library;
        userID = library.getID(userName);
    }

    public String getLibrary() {
        return usersLibrary.getLibraryName();
    }


}
