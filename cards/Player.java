/** 
 * Andrew Ingalls
 * ID: 2368574
 * Email: aingalls@chapman.edu
 * CPSC 231-03
 * MP3-B: Spoons
 * 
 * This class creates a player object and has methods
 * for playing the game such as stealing spoons and taking a turn
 */
import java.util.LinkedList;
public class Player {

    //Member variable for player number
    private int playerNum;
    //Linked list of cards for the players hand
    private LinkedList<Card> playerHand;
    //Variable for number of spoons in play
    private int numSpoons;
    //Boolean for if a player has a spoon
    private boolean hasSpoon;
    //Variable for number of matches in a players hand
    private int numMatches;
    //Linked list of ints for the value of matches in a hand
    private LinkedList<Integer> matchVal;
    //Card variable for the card that the player may or may 
    //not add to their hand
    private Card floatingCard;


    //Constructor for initializing a new player object with 
    // the player number, dealer object and number of spoons
    public Player(int playerNum, Dealer dealer, int numSpoons){
        LinkedList<Card> playerHand = dealer.deals(4);
        this.playerNum = playerNum;
        hasSpoon = false;
        this.numSpoons = numSpoons;
        
    }

    //Method for the player taking a turn
    public Card takeTurn(){
        if(playerNum == 1){
            playerHand.add(floatingCard);
        }
        return floatingCard;
    }

    //accessor for getting the floating card
    public Card getFloating(){
        return this.floatingCard;
    }
    //mutator for setting a new floating card
    public void setFloating(Card newFloating){
        this.floatingCard = newFloating;
    }

    //Method for stealing spoon, decrements number of spoons by 1
    public void stealSpoon(){
        this.hasSpoon = true;
        this.numSpoons--;
    }

    //Accessor for getting the player number
    public int getPlayerNum(){
        return this.playerNum;
    }
}
