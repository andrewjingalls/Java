/** 
 * Andrew Ingalls
 * ID: 2368574
 * Email: aingalls@chapman.edu
 * CPSC 231-03
 * MP4: Music App
 * 
 * This class creates an Playlist object which extends from the content collection
 * class and also has a method for playing the playlist
 */
//Playlist extends ContentCollection because it is part of the collection of content
public class Playlist extends ContentCollection {
    
    //Constructor for making a playlist calling in a title
    public Playlist(String title) {
        //Calls the contentcollection method using the given title
        super(title);
    }

    //Play method takes the size of the content list and plays shuffles
    public void play() {
        for (int i = 0; i < contentList.size(); i++) {
            shuffle();
        }
    }
}