package BacktoBook;

public class Book {

    private String title;
    private String ISBN;
    private Person Author;



    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public Person getAuthor() {
        return Author;
    }

    public void setAuthor(Person author) {
        Author = author;
    }
}
