/** 
 * Andrew Ingalls
 * ID: 2368574
 * Email: aingalls@chapman.edu
 * CPSC 231-03
 * MP4: Music App
 * 
 * This class creates an Content object and has methods for playing the content 
 and accessing member variables
 */
public class Content implements Comparable<Content>{

    //Member variables for title, artist, and number of times a piece of content is played
    protected String title;
    protected String artist;
    protected int numTimesPlayed;

    //Default constuctor for making a piece of content
    public Content(){
        title = "";
        artist = "";
        numTimesPlayed = 0;
    }

    //Overloaded for entering title and artist of the content
    public Content(String title, String artist){
        this.title = title;
        this.artist = artist;
        numTimesPlayed = 0;
    }

    //Play method for a piece of content which increases 
    //number of times it is played by 1 and displays it
    public void play() {
        numTimesPlayed++;
        System.out.println("Playing " + title + " by " + artist + " (times streamed: " + numTimesPlayed + ")");
  }

    //Compare method to compare 2 pieces of content together by number of times played
    public int compareTo(Content other) {
    return Integer.compare(numTimesPlayed, other.numTimesPlayed);
  }

    //Accessor for getting the title of the content
    public String getTitle(){
        return this.title;
    }

    //toString method that displays the content with title and artist
    public String toString(){
        return title + " by " + artist;
    }
}