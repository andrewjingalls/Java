/** 
 * Andrew Ingalls
 * ID: 2368574
 * Email: aingalls@chapman.edu
 * CPSC 231-03
 * MP4: Music App
 * 
 * This class creates an Content Collection object which holds all the content.
 * It also has constructors and the shuffle method for shuffling the songs/podcasts
 */
import java.util.LinkedList;
import java.util.Random;
public class ContentCollection implements Comparable<ContentCollection> {
    
    //Member variables for the content list and the title of the content
    protected LinkedList<Content> contentList;
    protected String title;

    //Default constructor for making a collection of content
    public ContentCollection(String title) {
        this.title = title;
        contentList = new LinkedList<Content>();
    }

    //accessor for getting the title of the content list
    public String getTitle(){
        return this.title;
    }

    //Accessor for accessing the content list
    public LinkedList<Content> getContent(){
        return this.contentList;
    }

    //Add method adds a piece of content to the collection list
    public void add(Content content) {
        this.contentList.add(content);
    }

    //Play method plays a random piece of content from the collection of content
    public void shuffle() {
        if (!contentList.isEmpty()) {
        int index = new Random().nextInt(contentList.size());
        contentList.get(index).play();
        }
    }

    //Compare method compares two collections by the number of items in the collection
    public int compareTo(ContentCollection other) {
        return Integer.compare(contentList.size(), other.contentList.size());
    }

}