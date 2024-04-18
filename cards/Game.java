/** 
 * Andrew Ingalls
 * ID: 2368574
 * Email: aingalls@chapman.edu
 * CPSC 231-03
 * MP3-B: Spoons
 * 
 * This class is the game class which is meant to execute the game
 * and play a full game of spoons
 */
import java.util.LinkedList;
public class Game{

    //Member variables for number of players, number of spoons in play
    //The game dealer, list of players, and discard pile
    private int numPlayers;
    private int numSpoons;
    private Dealer m_dealer;
    private LinkedList<Player> players;
    private LinkedList<Card> discard;

    //Game class that runs the spoons game
    public Game(){
        m_dealer = new Dealer();
        numSpoons = numPlayers-1;
        for (int i = 1; i <= numPlayers; ++i){
            players.add(new Player(i, m_dealer, 1));
        }
    }

}