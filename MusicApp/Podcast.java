/** 
 * Andrew Ingalls
 * ID: 2368574
 * Email: aingalls@chapman.edu
 * CPSC 231-03
 * MP4: Music App
 * 
 * This class creates an Podcast object with constructors and a method for playing the podcast
 */
//Podcast extends content because it is a piece of content
public class Podcast extends Content{

    //Member variables for the episode number and number of times played
    private int numEpisode;
    private int numTimesPlayed;

    
    //Constructor for creating a podcast taking in the 
    //title, artist, and ep number
    public Podcast(String title, String artist, int numEpisode){
        super(title, artist);
        this.numEpisode = numEpisode;
    }

    //Accessor for getting the episode number
    public int getNumEpisode(){
        return this.numEpisode;
    }

    //Play method plays the podcast and displays the episode number
    //We override this method to include the episode number
    @Override
    public void play() {
        super.play();
        System.out.println("Episode number: " + numEpisode);
  }
}