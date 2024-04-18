/** 
 * Andrew Ingalls
 * ID: 2368574
 * Email: aingalls@chapman.edu
 * CPSC 231-03
 * MP4: Music App
 * 
 * This class creates an Album object but is part of the ContentCollection class
 */
//Album extends the contentcollection class
public class Album extends ContentCollection {

    //Default constructor for making an Album object
    public Album(String title) {
        super(title);
    }

    //Play method for playing songs in album
    public void play() {
        for (Content content : contentList) {
            content.play();
        }
    }
}

