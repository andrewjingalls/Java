public class Book{
    private String title;
    private String author;
    private boolean checkedIn;

    //default constructor
    public Book(){
        this.title = null;
        this.author = null;
        this.checkedIn = true;
    }

    //overloaded constructor
    public Book(String title, String author){
        this.title = title;
        this.author = author;
        this.checkedIn = true;
    }

    public Book(Book other){
        this.title = other.getTitle();
        this.author = other.getAuthor();
        this.checkedIn = other.checkedIn();
    }


    public String getTitle() {
        return this.title;
    }
    public void setTitle(String newTitle) {
        this.title = newTitle;
    }


    public String getAuthor() {
        return author;
    }
    public void setAuthor(String newAuthor){
        this.author = newAuthor;
    }


    public boolean checkedIn(){
        return checkedIn;
    }


    public String toString(){
        return title + " by " + author + " is checked in: " + checkedIn;
    }


    public void checkOut(){
        this.checkedIn = false;
    }

    public void checkIn(){
        this.checkedIn = true;
    }


}