/** 
 * Andrew Ingalls
 * ID: 2368574
 * Email: aingalls@chapman.edu
 * CPSC 231-03
 * MP4: Music App
 * 
 * This class creates an Listener Account object and a method for favoriting content
 */
import java.util.LinkedList;
//Listener account is a type of account
public class ListenerAccount extends Accounts{

    //Member variable for the list of favorite content
    private LinkedList<Content> FavContent = new LinkedList<Content>();

    //Default Constructor for making a listener account
    public ListenerAccount(){
        super("Kanye West");
    }

    //Overloaded for giving it a name
    public ListenerAccount(String accountName){
        super(accountName);
    }

    //favorite method for adding a piece of content to the favorite content list 
    public void favorite(Content content){
        FavContent.add(content);
        System.out.println(FavContent);
    }

}