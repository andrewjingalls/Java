/** 
 * Andrew Ingalls
 * ID: 2368574
 * Email: aingalls@chapman.edu
 * CPSC 231-03
 * MP3-A: Cards
 * 
 * This class creates the card objects and defaults a card to 
 * an ace of spades. Assigns each card with a card value and 
 * a card suit. Returns a string of "Card of Suit".
 */
public class Card{
    /**Public final member variables for the suits */
    public static final int HEARTS = 0;
    public static final int SPADES = 1;
    public static final int CLUBS = 2;
    public static final int DIAMONDS = 3;

    /**Public final member variables for face cards */
    public static final int JACK = 11;
    public static final int QUEEN = 12;
    public static final int KING = 13;
    public static final int ACE = 14;

    /**Private member variables for card value and card suit */
    private int cardVal;
    private int cardSuit;
    
    /**Default constructor initializing a card to an ace of spades */
    public Card(){
        cardVal = ACE;
        cardSuit = SPADES;
    }

    /**Overloaded constructor which accepts values for the 
    * card value and card suit
    * @param cardVal, number value of card
    * @param cardSuit, number value of suit (0-4)*/
    public Card(int cardVal, int cardSuit) {
        this.cardVal = cardVal;
        this.cardSuit = cardSuit;
    }

    /**Copy constructor for creating another card
    * @param other, another card*/
    public Card(Card other) {
        this.cardVal = other.getVal();
        this.cardSuit = other.getSuit();
    }

    /**Accessor for value of the card
    * @return the int value of the card*/
    public int getVal() {
        return this.cardVal;
    }
    /**Mutator for the value fo the card
    * @param newVal, new value of card */
    public void setVal(int newVal) {
        this.cardVal = newVal;
    }

    /**Accessor for suit of the card
    * @return the int value of the suit */
    public int getSuit() {
        return this.cardSuit;
    }
    //Mutator for cardSuit
    /**Mutator for the suit of the card
    * @param newSuit, the new suit of the card */
    public void setSuit(int newSuit) {
        this.cardSuit = newSuit;
    }

    /**toString method that takes the values of cardVal
    * and cardSuit. Depending on the number it either returns
    * a string of the card number (2-10) or the string 
    * representation of the face card while also returning the 
    * suit of the card in format: "Value of Suit".
    * @return the string representation of the card */
    public String toString() {
        String card = "";
        String suit = "";
        if(cardVal < 11){
            card += cardVal;
        }
        if(cardVal == 11){
            card = "Jack";
        }
        if(cardVal == 12){
            card = "Queen";
        }
        if(cardVal == 13){
            card = "King";
        }
        if(cardVal == 14){
            card = "Ace";
        }
        if(cardSuit == 0){
            suit = "Hearts";
        }
        if(cardSuit == 1){
            suit = "Spades";
        }
        if(cardSuit == 2){
            suit = "Clubs";
        }
        if(cardSuit == 3){
            suit = "Diamonds";
        }
        return card + " of " + suit;
    }

    /**Equals method checks to see if two cards are the same
    * by checking the cardVal and cardSuit
    * @return a boolean if the cards are equal or not */
    public boolean equals(Object o){
        if (!(o instanceof Card)){
            return false;
        } else {
            Card other = (Card) o;
            return other.getVal()==(this.cardVal)
                && other.getSuit()==(this.cardSuit);
        }
    }
}