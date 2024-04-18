/** 
 * Andrew Ingalls
 * ID: 2368574
 * Email: aingalls@chapman.edu
 * CPSC 231-03
 * MP3-A: Cards
 * 
 * This class is meant to test the functionality of the 
 * card, deck, and dealer classes. 
 */
public class TestCards{
    public static void main(String[] args){
        // Card faceCard = new Card(Card.ACE, Card.SPADES);
        // System.out.println(faceCard);

        Deck myDeck = new Deck();
        // System.out.println(myDeck);
        // System.out.println(myDeck.Size());
        // System.out.println(myDeck.Deal());

        Dealer myDealer = new Dealer();
        System.out.println(myDealer.deals(30));
    }
}