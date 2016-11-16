/**
 * name
 */
public class BookImpl implements Book {

    private String authorName;
    private String bookTitle;

    public BookImpl(String authorName, String bookTitle){
        this.authorName = authorName;
        this.bookTitle = bookTitle;
    }


    public String getAuthorName(){
        return this.authorName;
    }

    public String getBookTitle(){
        return this.bookTitle;
    }

}
