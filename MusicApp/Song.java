/** 
 * Andrew Ingalls
 * ID: 2368574
 * Email: aingalls@chapman.edu
 * CPSC 231-03
 * MP4: Music App
 * 
 * This class creates an Song object abd has a method for playing the song
 */
//Song extends content class because it is a type of content
public class Song extends Content{

    //Member variables for number of times played and the album the song is part of
    private int numTimesPlayed;
    private String album;

    //Constructor for creating a song, inputing title, artist, and album
    public Song(String title, String artist, String album){
        super(title, artist);
        this.album = album;
    }

    //Accessor for getting the album
    public String getAlbum(){
        return this.album;
    }

    //Play method plays the song, increments number of times played
    //and displays how many times it is played
    public void play(){
        numTimesPlayed++;
        System.out.println(this.title + " is playing.");
        System.out.println(this.title + " played " + numTimesPlayed + " times.");
    }
}