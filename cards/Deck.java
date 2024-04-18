/** 
 * Andrew Ingalls
 * ID: 2368574
 * Email: aingalls@chapman.edu
 * CPSC 231-03
 * MP3-A: Cards
 * 
 * This class creates a deck of 52 cards, has a method to
 * display a list of each card in the correct formatting, and 
 * also has a method deal which returns a random card from the deck
 */
import java.util.LinkedList;
import java.util.Random;
public class Deck {

    /**Member variable m_cards creating a LinkedList */
    private LinkedList<Card> m_cards;

    /**Default constructor initializing a new deck with 52 cards */
    public Deck(){
        m_cards = new LinkedList<Card>();
        for (int i = 0; i < 4; ++i){
            for (int j = 2; j < 15; ++j){
                m_cards.add(new Card(j,i));
            }
        }
    }

    //copy constructor creating a new deck
    /**Copy constructor for making a new deck of the same size
    * @param other, another deck  */
    public Deck(Deck other){
        m_cards = new LinkedList<Card>();
        for (int i = 0; i < other.getSize(); ++i){
            m_cards.add(new Card(other.getCard(i)));
        }
    }

    /**Accessor for getting a card in the deck 
    * @param i, the location within the deck
    * @return the card at location i*/
    public Card getCard(int i){
        return m_cards.get(i);
    }

    /**Accessor for getting the size of the deck
    * @return the size of the LinkedList deck */
    public int getSize(){
        return m_cards.size();
    }

    /**toString method which displays each card in the deck 
    * @return a string of each card seperated by a comma and space */
    public String toString(){
        String cardDeck = "";
        for (int i = 0; i < m_cards.size(); ++i){
            cardDeck += m_cards.get(i) + ", ";
        }
        return cardDeck;
    }

    /**Size method returns the size of the linkedlist 
    * @return an int of the size of the deck*/
    public int Size(){
        return m_cards.size();
    }

    /**Deal method picks a random number based off the 
    * size of the deck, gets the card at that value, removes
    * the card from the deck and finally returns that card
    * @return the card removed from the deck and dealt*/
    public Card Deal(){
        Card tempCard;
        Random randy = new Random();
        int num = randy.nextInt(m_cards.size());

        tempCard = m_cards.get(num);
        m_cards.remove(num);
        return tempCard;
    }
}