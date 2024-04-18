/** A representation of a Song on a music streaming platform
* holds variables for the title and author
* and whether or not song is favorities or currently playing

* @author Andrew Ingalls
* @version 1.0


*/
public class Song {
    private String title;
    private String author;
    private boolean isFavorited;
    private boolean isPlaying;
    /** No covers are allowed on the platform */
    public static final boolean isCover = false;
    /**A running tally of how mnay Song Objects have been constructed */
    public static int songsOnPlatform = 0;

    /**Default Constructor sets title and author to null
    * and is favorited and isPlaying */
    public Song() {
        // default constructor
        this.title = null;
        this.author = null;
        this.isFavorited = false;
        this.isPlaying = false;
        songsOnPlatform++;
    }

    /**Overloaded constructor accepts values for title 
    * @param title, is string representation of the title of song
    * @param artist, is string representation of the artist of the song */
    public Song(String title, String artist) {
        // overloaded constructor
        this.title = title;
        this.author = artist;
        this.isFavorited = false;
        this.isPlaying = false;
        songsOnPlatform++;
    }

    /** Copy Constructor */
    public Song(Song other) {
        // copy constructor
        this.title = other.getTitle();
        this.author = other.getAuthor();
        this.isFavorited = other.isFavorited();
        this.isPlaying = other.isPlaying();
        songsOnPlatform++;
    }


    /**Accessor for string representation of title
    * @return the string representation of title */
    public String getTitle() {
        return this.title;
    }

    /** Mutator for title
    * @param newTitle, new string  */
    public void setTitle(String newTitle) {
        this.title = newTitle;
    }

    /** Accessor for Author
    * @return author */
    public String getAuthor() {
        return author;
    }

    public boolean isFavorited() {
        return isFavorited;
    }

    public boolean isPlaying() {
        return isPlaying;
    }

    public String toString() {
        return title + " by " + author;
    }

    /** Two objects are equal if they share the same title and author */
    public boolean equals(Object o) {
        // make sure o is a Song
        // (and not something else like Playlist)
        if (!(o instanceof Song)) {
            return false;
        } else {
            // cast "down" into an object of this class
            Song other = (Song) o;
            return other.getTitle().equals(this.title)
                && other.getAuthor().equals(this.author);
        }
    }


    // public static void main(String[] args){
    //     Song s1 = new Song("Cosmic Love", "Florence + The Machine");
    //     Song s2 = new Song(s1);
    //    // //as long as we provide a toString()
    //    // //we can just print our object to call it

    //     System.out.println(s1);
    //     System.out.println(s2);
    //     System.out.println(s2.equals(s1));

    // }
}

