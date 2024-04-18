/** 
 * Andrew Ingalls
 * ID: 2368574
 * Email: aingalls@chapman.edu
 * CPSC 231-03
 * MP3-A: Cards
 * 
 * This class is responsible for creating a new deck, and then dealing
 * a specified number of cards and adding them to a linkedlist, and
 * fianlly displaying the deck as a string. 
 */
import java.util.LinkedList;
public class Dealer{

    /**Private memeber variable for a deck */
    private Deck m_deck;

    /**Default constructor creating a new deck */
    public Dealer(){
        m_deck = new Deck();
    }

    //deals method 
    /**Deals method which returns a linkedlist of however many cards
    * are specified in the parameter
    * @param n, the number of cards wanting to deal
    * @return the linkedlist of cards */
    public LinkedList<Card> deals(int n){
        LinkedList<Card> myList = new LinkedList<Card>();
        for (int i = 0; i < n; i++){
            myList.add(m_deck.Deal());
        }
        return myList;
    }

    /**Accessor for the size of the deck
    * @return the size of the deck */
    public int deckSize(){
        return m_deck.Size();
    }

    /**toString method displaying the deck of cards
    * @return the deck as a string */
    public String toString(){        
        return m_deck.toString();
    }
}